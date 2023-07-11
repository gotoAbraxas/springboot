package com.example.demo.hobby;

import com.example.demo.member.Member;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/hobbies")
@RequiredArgsConstructor
public class HobbyController {
    private final HobbyService service;
    @PostMapping
    public void save(@RequestBody HobbyRequest request){
        service.save(request);
    }

    @GetMapping
    public List<Hobby> findAll(){
        return service.findAll();
    }

    @GetMapping("{id}")
    public HobbyResponse findById(@PathVariable("id") Integer id){

        return service.findById(id);
    }
}
