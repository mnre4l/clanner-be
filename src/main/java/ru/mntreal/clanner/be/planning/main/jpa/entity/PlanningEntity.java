package ru.mntreal.clanner.be.planning.main.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.mntreal.clanner.be.event.jpa.entity.EventEntity;
import ru.mntreal.clanner.be.planning.party.jpa.entity.PartyEntity;

import java.util.Set;

@Getter
@Setter
@Table(name = "planning")
@Entity
@Accessors(fluent = true)
@NoArgsConstructor
public class PlanningEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seq_planning"
    )
    @SequenceGenerator(
            name = "seq_planning",
            allocationSize = 5
    )
    private Long id;
    @OneToOne(fetch = FetchType.LAZY)
    private EventEntity event;
    @OneToMany(fetch = FetchType.LAZY)
    private Set<PartyEntity> parties;
}
