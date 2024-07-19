package ru.mntreal.clanner.be.event.mapper;

import org.mapstruct.Mapper;
import ru.mntreal.clanner.be.common.mapper.DefaultMapper;
import ru.mntreal.clanner.be.event.api.dto.graphql.Event;
import ru.mntreal.clanner.be.event.api.dto.graphql.EventInput;
import ru.mntreal.clanner.be.event.jpa.entity.EventEntity;

@Mapper(componentModel = "spring")
public interface EventMapper extends DefaultMapper<EventEntity, Event, EventInput> {
}
