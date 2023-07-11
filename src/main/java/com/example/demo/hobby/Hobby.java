package com.example.demo.hobby;


import com.example.demo.member.Member;
import com.example.demo.member.MemberResponse;
import com.example.demo.store.MemberHobby;
import com.example.demo.store.Store;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@NoArgsConstructor
@Getter
public class Hobby {
    private Integer id;
    private String name;
    private List<MemberResponse> memberHobbies = new ArrayList<>();

    public Hobby(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setMemberHobbies(List<MemberResponse> memberHobbies) {
        this.memberHobbies = memberHobbies;
    }
}
