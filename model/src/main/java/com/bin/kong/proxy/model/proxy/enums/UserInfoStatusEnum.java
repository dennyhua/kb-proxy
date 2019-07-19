package com.bin.kong.proxy.model.proxy.enums;

public enum UserInfoStatusEnum {
    //状态：-1.停止代理  1. 开始代理
    STOP(-1, "停止"),  START(1, "开启");

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    private int code;
    private String desc;


    UserInfoStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static UserInfoStatusEnum getByCode(int code) {
        for (UserInfoStatusEnum statusEnum : values()) {
            if (statusEnum.getCode() == code) {
                return statusEnum;
            }
        }
        return null;
    }

    public static String getDescByCode(int code) {
        for (UserInfoStatusEnum statusEnum : values()) {
            if (statusEnum.getCode() == code) {
                return statusEnum.getDesc();
            }
        }
        return null;
    }
}
