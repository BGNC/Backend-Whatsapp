package io.bgnc.WhatsApp_backend.messaging.domain.message.vo;

import io.bgnc.WhatsApp_backend.shared.error.domain.Assert;

public record ConversationName(String name) {

    public ConversationName {
        Assert.field("name",name).minLength(3).maxLength(255);

    }
}
