package com.bin.kong.proxy.model.env.search;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EnvSearch {
    private String kw;
    private Integer user_id;
}
