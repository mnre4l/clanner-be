package ru.mntreal.clanner.be.common.exception;

import ru.mntreal.clanner.be.common.exception.codes.ExceptionCode;

public class NotFoundException extends CustomGraphQLException {

    public NotFoundException(Object id) {
        super(ExceptionCode.CODE_1, id);
    }
}
