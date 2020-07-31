package com.younghun.hibusgo.domain;


import java.time.LocalDateTime;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Account {

    public enum Status { DEFAULT, DELETED}

    //아이디
    private String id;

    //비밀번호
    private String password;

    //이름
    private String name;

    //이메일
    private String email;

    //휴대폰 번호
    private String phoneNumber;

    // 상태
    private Status status;

    // 회원가입일
    private LocalDateTime createdAt;

    // 최종 수정일
    private LocalDateTime updatedAt;
}
