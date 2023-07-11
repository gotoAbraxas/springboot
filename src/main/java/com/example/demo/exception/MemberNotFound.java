package com.example.demo.exception;

public class MemberNotFound extends NullPointerException{
    private String api;
    private Integer memberId;

    public MemberNotFound(String s,String api,Integer memberId) {
        super(s);
        this.api = api;
        this.memberId = memberId;
    }

    public String getApi() {
        return api;
    }

    public Integer getMemberId() {
        return memberId;
    }
}
