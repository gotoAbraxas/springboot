package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class CustomExceptionController {


@ExceptionHandler(MemberNotFound.class)
@ResponseStatus(HttpStatus.OK)
    public String notFound(MemberNotFound e){
    e.printStackTrace();
    System.out.println(e.getApi() + "를 하는데"+ e.getMemberId() + " 얘가 없어서 에러가 났어요");

    return e.getMessage();
}

}
