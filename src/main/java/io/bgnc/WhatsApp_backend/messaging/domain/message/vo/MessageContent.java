package io.bgnc.WhatsApp_backend.messaging.domain.message.vo;

public record MessageContent(String text,
                             MessageType type,
                             MessageMediaContent mediaContent) {
}
