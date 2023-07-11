package com.example.demo.hobby;

import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import com.example.demo.store.Store;

public class HobbyRequest {
    private final String name;
    private final Integer hobbyId;

    public HobbyRequest(String name, Integer hobbyId) {
        this.name = name;
        this.hobbyId = hobbyId;
    }

    public String getName() {
        return name;
    }

    public Integer gethobbyId() {
        return hobbyId;
    }
}
