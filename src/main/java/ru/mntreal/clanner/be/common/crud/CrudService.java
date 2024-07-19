package ru.mntreal.clanner.be.common.crud;

public interface CrudService<D, T extends Identifiable<?>, ID> extends JpaSaver<D, T>, JpaRetriever<D, ID>, JpaRemover<ID>, JpaUpdater<T> {
}
