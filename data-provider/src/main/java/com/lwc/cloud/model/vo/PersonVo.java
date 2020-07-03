package com.lwc.cloud.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Created by lwc on 2020/7/3.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class PersonVo {
    private String name;
    private String phone;
    private String gender;
    private Integer age;

    public String getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        if (gender == 1)
            this.gender = "男";
        else
            this.gender = "女";
    }
}


