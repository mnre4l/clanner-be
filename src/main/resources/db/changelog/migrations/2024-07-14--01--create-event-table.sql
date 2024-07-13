--liquibase formatted sql
--changeset mntreal:2024-07-14--01-create-event-table

CREATE TABLE IF NOT EXISTS event
(
    id              BIGINT    NOT NULL,
    event_type      TEXT,
    start_at        TIMESTAMP,
    end_at          TIMESTAMP,
    confidentiality TEXT,
    test            BOOLEAN,
    created_at      TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    constraint pk_event primary key (id)
);

CREATE SEQUENCE seq_event START WITH 1 INCREMENT BY 5;

--rollback DROP TABLE IF EXISTS event;
--rollback DROP SEQUENCE IF EXISTS seq_event;