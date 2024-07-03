package io.bgnc.WhatsApp_backend.messaging.domain.message.vo;

import io.bgnc.WhatsApp_backend.shared.error.domain.Assert;

import java.time.Instant;

public record MessageSentTime(Instant date) {
    public MessageSentTime {
        Assert.field("date",date).notNull();
    }
}
