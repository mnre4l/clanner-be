package ru.mntreal.clanner.be.planning.party.jpa.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import ru.mntreal.clanner.be.planning.main.jpa.entity.PlanningEntity;
import ru.mntreal.clanner.be.user.jpa.entity.UserEntity;

import java.time.Instant;
import java.util.Set;

@Getter
@Setter
@Table(name = "party")
@Entity
@Accessors(fluent = true)
@NoArgsConstructor
public class PartyEntity {

    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "seq_party"
    )
    @SequenceGenerator(
            name = "seq_party",
            allocationSize = 5
    )
    private Long id;
    private String name;
    @OneToOne
    private UserEntity leader;
    @ManyToMany
    private Set<UserEntity> participants;
    @ManyToOne(fetch = FetchType.LAZY)
    private PlanningEntity planning;
    private Instant createdAt;
}
