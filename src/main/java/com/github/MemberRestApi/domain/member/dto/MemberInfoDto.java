package com.github.MemberRestApi.domain.member.dto;

import com.github.MemberRestApi.domain.member.Member;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class MemberInfoDto {

    private String name;
    private String nickName;
    private String username;
    private Integer age;



    @Builder
    public MemberInfoDto(Member member) {
        this.name = member.getName();
        this.nickName = member.getNickName();
        this.username = member.getUsername();
        this.age = member.getAge();
    }
}