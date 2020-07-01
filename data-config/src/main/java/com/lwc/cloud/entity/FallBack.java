package com.lwc.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lwc on 2020/7/1.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FallBack {
    private String result;
    private Integer code;
}
