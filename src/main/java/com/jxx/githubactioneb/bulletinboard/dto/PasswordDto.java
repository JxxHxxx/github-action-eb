package com.jxx.githubactioneb.bulletinboard.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PasswordDto {

    private String password;

    public PasswordDto(String password) {
        this.password = password;
    }
}
