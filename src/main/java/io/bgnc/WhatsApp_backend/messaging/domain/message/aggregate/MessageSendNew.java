package io.bgnc.WhatsApp_backend.messaging.domain.message.aggregate;

import io.bgnc.WhatsApp_backend.messaging.domain.message.vo.ConversationPublicId;
import io.bgnc.WhatsApp_backend.messaging.domain.message.vo.MessageContent;

public record MessageSendNew(ConversationPublicId publicId, MessageContent messageContent) {
}
