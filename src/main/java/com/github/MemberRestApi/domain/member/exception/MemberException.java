package com.github.MemberRestApi.domain.member.exception;

import com.github.MemberRestApi.global.exception.BaseException;
import com.github.MemberRestApi.global.exception.BaseExceptionType;

public class MemberException extends BaseException {
    private BaseExceptionType exceptionType;


    public MemberException(BaseExceptionType exceptionType) {
        this.exceptionType = exceptionType;
    }

    @Override
    public BaseExceptionType getExceptionType() {
        return exceptionType;
    }
}
