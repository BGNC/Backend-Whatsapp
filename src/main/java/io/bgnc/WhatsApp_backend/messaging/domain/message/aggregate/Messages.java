package io.bgnc.WhatsApp_backend.messaging.domain.message.aggregate;

import io.bgnc.WhatsApp_backend.shared.error.domain.Assert;

import java.util.List;

public record Messages(List<Message> messages) {

    public Messages {
        Assert.field("messages",messages).noNullElement().notNull();
    }
}
