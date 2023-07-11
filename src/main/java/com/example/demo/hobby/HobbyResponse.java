package com.example.demo.hobby;

import lombok.Getter;

@Getter
public class HobbyResponse {

    private Integer id;
    private String name;

    public HobbyResponse(Hobby hobby) {
        this.id = hobby.getId();
        this.name = hobby.getName();
    }
}
