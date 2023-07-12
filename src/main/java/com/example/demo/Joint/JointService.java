package com.example.demo.Joint;

import com.example.demo.hobby.Hobby;
import com.example.demo.hobby.HobbyResponse;
import com.example.demo.hobby.HobbyService;
import com.example.demo.member.Member;
import com.example.demo.member.MemberResponse;
import com.example.demo.member.MemberService;
import com.example.demo.store.MemberHobby;
import com.example.demo.store.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service @RequiredArgsConstructor
public class JointService {
    private final MemberService memberService;
    private final HobbyService hobbyService;

    public void Joint(JointRequest jointRequest){
        Member byId = memberService.findById(jointRequest.memberId());
        Hobby byId1 = hobbyService.findById(jointRequest.hobbyId());

        MemberHobby memberHobby = new MemberHobby(byId, byId1);

        byId.getMemberHobbies().add(new HobbyResponse(memberHobby.getHobby()));
        byId1.getMemberHobbies().add(new MemberResponse(memberHobby.getMember()));

        Store.memberHobbies.add(memberHobby);

    }
}
