package ru.mntreal.clanner.be.event.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.mntreal.clanner.be.common.crud.CrudService;
import ru.mntreal.clanner.be.common.exception.NotFoundException;
import ru.mntreal.clanner.be.event.api.dto.graphql.Event;
import ru.mntreal.clanner.be.event.api.dto.graphql.EventInput;
import ru.mntreal.clanner.be.event.mapper.EventMapper;
import ru.mntreal.clanner.be.event.repository.EventRepository;

@Service
@RequiredArgsConstructor
public class EventService implements CrudService<Event, EventInput, Long> {

    private final EventRepository repository;
    private final EventMapper mapper;

    @Override
    public void remove(Long id) {
        repository.findById(id).ifPresentOrElse(repository::delete, () -> {
            throw new NotFoundException(id);
        });
    }

    @Override
    public Event get(Long id) {
        return repository.findById(id).map(mapper::toDto).orElseThrow(() -> new NotFoundException(id));
    }

    @Override
    public Event save(EventInput input) {
        var entity = mapper.toEntity(input);
        return mapper.toDto(repository.save(entity));
    }

    @Override
    public void update(EventInput eventInput) {
        repository.findById(eventInput.id()).ifPresentOrElse(
                it -> repository.save(mapper.toEntity(eventInput)),
                () -> {
                    throw new NotFoundException(eventInput.id());
                });
    }
}
