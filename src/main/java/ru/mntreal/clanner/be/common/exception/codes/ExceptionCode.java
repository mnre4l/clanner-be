package ru.mntreal.clanner.be.common.exception.codes;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.experimental.Accessors;

@Getter
@Accessors(fluent = true)
@AllArgsConstructor
public enum ExceptionCode {

    CODE_1("Entity with id = %s not found");

    private String message;
}
