package ru.mntreal.clanner.be.event.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.mntreal.clanner.be.event.jpa.entity.EventEntity;

public interface EventRepository extends JpaRepository<EventEntity, Long> {
}
