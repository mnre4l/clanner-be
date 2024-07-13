package ru.mntreal.clanner.be.common.crud;

public interface JpaSaver<D, I> {

    public D save(I input);
}
