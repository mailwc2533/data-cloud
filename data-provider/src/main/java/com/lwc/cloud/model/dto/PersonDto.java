package com.lwc.cloud.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lwc on 2020/7/3.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PersonDto {
    private String name;
    private String phone;
    private Integer gender;
    private Integer age;
}
