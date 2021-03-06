package com.younghun.hibusgo.dto;

import com.younghun.hibusgo.aop.LoginCheck.UserLevel;
import com.younghun.hibusgo.domain.Account;
import com.younghun.hibusgo.domain.DataStatus;
import javax.validation.constraints.Max;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

// 유저 생성시 유효성 검사를 위한 class
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Builder
public class AccountDto {

    // 회원 아이디(이메일)
    @NotBlank
    @Email
    @Max(255)
    private String userId;

    // 패스워드
    @NotBlank
    @Length(min = 8, max = 16)
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[$@!%*#?&])[A-Za-z\\d$@!%*#?&]{8,16}$")
    private String password;

    // 이름
    @NotBlank
    @Length(min = 3, max = 20)
    @Pattern(regexp = "^[ㄱ-ㅎ가-힣a-z0-9_-]{3,20}$")
    private String name;

    // 핸드폰 번호
    @Pattern(regexp = "^(01[1|6|7|8|9|0])-(\\d{3,4})-(\\d{4})$")
    private String phoneNumber;

    private UserLevel userLevel;

    // 상태 DEFAULT(기본), DELETED(삭제됨)
    private DataStatus status;

    public Account toEntity() {
        return Account.builder()
                .userId(this.userId)
                .password(this.password)
                .name(this.name)
                .phoneNumber(this.phoneNumber)
                .userLevel(UserLevel.USER)
                .status(DataStatus.DEFAULT)
                .build();
    }

}
