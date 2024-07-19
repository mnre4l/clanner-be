package ru.mntreal.clanner.be.common.exception;

import ru.mntreal.clanner.be.common.exception.codes.ExceptionCode;

public class CustomGraphQLException extends RuntimeException {

    public CustomGraphQLException(ExceptionCode code, Object... args) {
        super(String.format(code.message(), args));
    }
}
