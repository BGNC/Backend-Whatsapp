package io.bgnc.WhatsApp_backend.messaging.domain.message.aggregate;

import io.bgnc.WhatsApp_backend.messaging.domain.message.vo.*;
import io.bgnc.WhatsApp_backend.shared.error.domain.Assert;
import lombok.AllArgsConstructor;
import lombok.Builder;
import org.hibernate.validator.internal.engine.messageinterpolation.parser.MessageState;

@Builder

public class Message {

    private final MessageSentTime sentTime;
    private final MessageContent messageContent;
    private final MessageSendState messageSendState;
    private final MessagePublicId messagePublicId;
    private final ConversationPublicId conversationPublicId;

    private final UserPublicId  sender;

    public Message(MessageSentTime sentTime, MessageContent messageContent, MessageSendState messageSendState, MessagePublicId messagePublicId, ConversationPublicId conversationPublicId, UserPublicId sender) {
        assertMandatoryFields(sentTime,messageContent,messageSendState,messagePublicId,sender,conversationPublicId);
        this.sentTime = sentTime;
        this.messageContent = messageContent;
        this.messageSendState = messageSendState;
        this.messagePublicId = messagePublicId;
        this.conversationPublicId = conversationPublicId;
        this.sender = sender;
    }

    private void assertMandatoryFields(MessageSentTime sentTime,
                                       MessageContent content,
                                       MessageSendState state,
                                       MessagePublicId publicId,
                                       UserPublicId sender,
                                       ConversationPublicId conversationId) {
        Assert.notNull("sentTime", sentTime);
        Assert.notNull("content", content);
        Assert.notNull("state", state);
        Assert.notNull("publicId", publicId);
        Assert.notNull("sender", sender);
        Assert.notNull("conversationId", conversationId);
    }
}
