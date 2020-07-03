package com.lwc.cloud.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * Created by lwc on 2020/7/3.
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person implements Serializable{
    private Long id;
    private String name;
    private String phone;
    private Integer gender;
    private Integer age;
}
