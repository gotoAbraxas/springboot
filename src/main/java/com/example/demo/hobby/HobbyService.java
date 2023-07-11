package com.example.demo.hobby;


import com.example.demo.member.Member;
import com.example.demo.member.MemberService;
import com.example.demo.store.Store;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class HobbyService {
    private final MemberService memberService;
    public void save(HobbyRequest request){
        Hobby hobby = new Hobby(request.gethobbyId(), request.getName());
        Store.hobbies.add(hobby);
    }

    public List<Hobby> findAll(){
        return Store.hobbies;
    }

    public HobbyResponse findById(Integer id){
        HobbyResponse hobbyResponse = Store.hobbies
                .stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .map(HobbyResponse::new).orElse(null);

        return hobbyResponse;
    }
}
