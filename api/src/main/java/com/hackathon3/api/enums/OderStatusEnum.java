package com.hackathon3.api.enums;

import org.springframework.security.core.GrantedAuthority;

public enum OderStatusEnum implements GrantedAuthority {
    PENDING, ONGOING, DELIVERED, CANCELLED;

    @Override
    public String getStatus() {
        return name();
    }
}
