package ru.mntreal.clanner.be.event.api.dto.graphql;

import lombok.Builder;
import ru.mntreal.clanner.be.common.crud.Identifiable;
import ru.mntreal.clanner.be.event.api.dto.enums.Confidentiality;
import ru.mntreal.clanner.be.event.api.dto.enums.EventType;

import java.time.LocalDateTime;

@Builder
public record Event(Long id,
                    String name,
                    EventType type,
                    LocalDateTime startAt,
                    LocalDateTime endAt,
                    Confidentiality confidentiality,
                    boolean test) implements Identifiable<Long> {
}