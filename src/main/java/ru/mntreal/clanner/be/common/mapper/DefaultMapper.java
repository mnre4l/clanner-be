package ru.mntreal.clanner.be.common.mapper;

import ru.mntreal.clanner.be.common.crud.Identifiable;

import java.util.Collection;
import java.util.List;

public interface DefaultMapper<E, D, I extends Identifiable<?>> {

    D toDto(E entity);

    E toEntity(I input);

    default List<D> toDto(Collection<? extends E> entities) {
        return entities.stream().map(this::toDto).toList();
    }

    default List<E> toEntity(Collection<? extends I> inputs) {
        return inputs.stream().map(this::toEntity).toList();
    }
}
