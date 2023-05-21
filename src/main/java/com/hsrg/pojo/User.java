package com.hsrg.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private long userId;
    private String nickName;
    private String imageUrl;
    private LocalDateTime updateTime;
    private LocalDateTime createTime;
}
