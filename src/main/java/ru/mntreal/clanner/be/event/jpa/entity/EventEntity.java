package ru.mntreal.clanner.be.event.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.mntreal.clanner.be.common.crud.Identifiable;
import ru.mntreal.clanner.be.event.api.dto.enums.Confidentiality;
import ru.mntreal.clanner.be.event.api.dto.enums.EventType;

import java.time.LocalDateTime;

@Getter
@Setter
@Table(name = "event")
@Entity
@Accessors(fluent = true)
@NoArgsConstructor
public class EventEntity implements Identifiable<Long> {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seq_event"
    )
    @SequenceGenerator(
            name = "seq_event",
            allocationSize = 5
    )
    private Long id;
    @Column(name = "name")
    private String name;
    @Column(name = "type")
    private EventType type;
    @Column(name = "start_at")
    private LocalDateTime startAt;
    @Column(name = "end_at")
    private LocalDateTime endAt;
    @Column(name = "confidentiality")
    private Confidentiality confidentiality;
    @Column(name = "test")
    private boolean test;
}
