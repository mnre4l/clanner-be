package ru.mntreal.clanner.be.common.crud;

public interface JpaRemover<ID> {

    void remove(ID t);
}
