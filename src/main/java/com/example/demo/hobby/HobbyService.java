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

    public Hobby findById(Integer id){
        Hobby hobbyResponse = Store.hobbies
                .stream()
                .filter(m -> m.getId().equals(id))
                .findFirst()
                .orElse(null);

        return hobbyResponse;
    }

    public List<Hobby> findByName(String name){
        List<Hobby> hobby = Store.hobbies.stream()
                .filter(m -> m.getName().contains(name)).toList();

        return hobby;
    }
}
