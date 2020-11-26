package com.smlsnnshn.entity;

import java.time.LocalDateTime;

public class BaseEntity {

    private Long id;
    private LocalDateTime insertDateTime;
    private Long insertUserId;
    private LocalDateTime lastUpdateTime;
    private Long lastUpdateUserId;

    public BaseEntity() {
    }

    public BaseEntity(Long id, LocalDateTime insertDateTime, Long insertUserId, LocalDateTime lastUpdateTime, Long lastUpdateUserId) {
        this.id = id;
        this.insertDateTime = insertDateTime;
        this.insertUserId = insertUserId;
        this.lastUpdateTime = lastUpdateTime;
        this.lastUpdateUserId = lastUpdateUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getInsertDateTime() {
        return insertDateTime;
    }

    public void setInsertDateTime(LocalDateTime insertDateTime) {
        this.insertDateTime = insertDateTime;
    }

    public Long getInsertUserId() {
        return insertUserId;
    }

    public void setInsertUserId(Long insertUserId) {
        this.insertUserId = insertUserId;
    }

    public LocalDateTime getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(LocalDateTime lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public Long getLastUpdateUserId() {
        return lastUpdateUserId;
    }

    public void setLastUpdateUserId(Long lastUpdateUserId) {
        this.lastUpdateUserId = lastUpdateUserId;
    }

    @Override
    public String toString() {
        return "BaseEntity{" +
                "id=" + id +
                ", insertDateTime=" + insertDateTime +
                ", insertUserId=" + insertUserId +
                ", lastUpdateTime=" + lastUpdateTime +
                ", lastUpdateUserId=" + lastUpdateUserId +
                '}';
    }

}
