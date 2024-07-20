--liquibase formatted sql
--changeset mntreal:2024-07-20--01-create-user.table

CREATE TABLE IF NOT EXISTS user
(
    id              BIGINT    NOT NULL,
    nickname        TEXT,
    created_at      TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    constraint pk_event primary key (id)
);

--rollback DROP TABLE IF EXISTS user;