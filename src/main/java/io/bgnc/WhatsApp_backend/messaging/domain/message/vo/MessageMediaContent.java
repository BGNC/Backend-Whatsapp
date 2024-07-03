package io.bgnc.WhatsApp_backend.messaging.domain.message.vo;

public record MessageMediaContent(byte[] file,
                                  String mimetype) {
    public MessageMediaContent {
    }
}
