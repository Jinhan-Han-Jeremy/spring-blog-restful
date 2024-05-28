package com.github.MemberRestApi.global.exception;


public abstract class BaseException extends RuntimeException{
    public abstract BaseExceptionType getExceptionType();
}