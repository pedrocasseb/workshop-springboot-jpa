package com.pedrocasseb.course.entities.enums;

import lombok.Getter;

public enum OrderStatus {
    WAITING_PAYMENT,
    PAID,
    SHIPPED,
    DELIVERED,
    CANCELED;
}
