package com.example.demo.store;

import com.example.demo.hobby.Hobby;
import com.example.demo.hobby.HobbyResponse;
import com.example.demo.member.Member;
import com.example.demo.member.MemberResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter @AllArgsConstructor
public class MemberHobby {
    private MemberResponse member;
    private HobbyResponse hobby;
}
