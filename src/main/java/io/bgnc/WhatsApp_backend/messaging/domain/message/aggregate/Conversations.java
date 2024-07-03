package io.bgnc.WhatsApp_backend.messaging.domain.message.aggregate;

import io.bgnc.WhatsApp_backend.shared.error.domain.Assert;

import java.util.List;

public record Conversations(List<Conversation> conversationList) {
    public Conversations {
        Assert.field("conversations",conversationList).notNull().noNullElement();
    }
}
