package com.example.demo.Joint;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/joint")
@RequiredArgsConstructor
public class JointController {
    private final JointService jointService;

    @PostMapping
    public void Joint(@RequestBody JointRequest jointRequest){
        jointService.Joint(jointRequest);

    }

}
