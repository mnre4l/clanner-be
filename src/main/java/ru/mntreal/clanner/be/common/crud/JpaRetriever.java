package ru.mntreal.clanner.be.common.crud;

public interface JpaRetriever<D, ID> {

    D get(ID id);
}
