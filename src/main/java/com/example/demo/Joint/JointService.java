package com.example.demo.Joint;

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
        MemberResponse byId = memberService.findById(jointRequest.memberId());
        HobbyResponse byId1 = hobbyService.findById(jointRequest.hobbyId());

        MemberHobby memberHobby = new MemberHobby(byId, byId1);

        Store.memberHobbies.add(memberHobby);

        Member member = Store.members.stream()
                .filter(m -> m.getId().equals(jointRequest.memberId()))
                .findFirst().orElse(null);

        member.getMemberHobbies().add(memberHobby.getHobby());

        for (int i = 0; i < Store.hobbies.size(); i++) {
            if(Store.hobbies.get(i).getId().equals(jointRequest.hobbyId())){
                Store.hobbies.get(i).getMemberHobbies().add(memberHobby.getMember());
            }
        }
    }
}
