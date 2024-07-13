package ru.mntreal.clanner.be.event.api.graphql;

import graphql.kickstart.tools.GraphQLQueryResolver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import ru.mntreal.clanner.be.common.crud.CrudService;
import ru.mntreal.clanner.be.event.api.dto.graphql.Event;
import ru.mntreal.clanner.be.event.api.dto.graphql.EventInput;

@Component
@RequiredArgsConstructor
public class EventQuery implements GraphQLQueryResolver {

    private final CrudService<Event, EventInput, Long> eventCrudService;

    public Event getEventById(Long id) {
        return eventCrudService.get(id);
    }
}
