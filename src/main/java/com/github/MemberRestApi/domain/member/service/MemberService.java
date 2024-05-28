package com.github.MemberRestApi.domain.member.service;


import com.github.MemberRestApi.domain.member.dto.MemberInfoDto;
import com.github.MemberRestApi.domain.member.dto.MemberSignUpDto;
import com.github.MemberRestApi.domain.member.dto.MemberUpdateDto;
import org.springframework.stereotype.Service;

public interface MemberService {
    /**
     * 회원가입
     * 정보수정
     * 회원탈퇴
     * 정보조회
     */
    void signUp(MemberSignUpDto memberSignUpDto) throws Exception;

    void update(MemberUpdateDto memberUpdateDto, String username) throws Exception;

    void updatePassword(String asIsPassword, String toBePassword, String username) throws Exception;

    void withdraw(String checkPassword, String username) throws Exception;

    MemberInfoDto getInfo(Long id) throws Exception;

    MemberInfoDto getMyInfo() throws Exception;


}
