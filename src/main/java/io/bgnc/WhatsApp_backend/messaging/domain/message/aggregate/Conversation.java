package io.bgnc.WhatsApp_backend.messaging.domain.message.aggregate;

import io.bgnc.WhatsApp_backend.messaging.domain.message.vo.ConversationName;
import io.bgnc.WhatsApp_backend.messaging.domain.message.vo.ConversationPublicId;
import io.bgnc.WhatsApp_backend.shared.error.domain.Assert;
import lombok.*;

import java.util.Set;

@Builder

@Data
@RequiredArgsConstructor
public class Conversation {

    private final Set<Message> messages;

    private final Set<User> members;

    private final ConversationPublicId conversationPublicId;
    private final ConversationName conversationName;

    private Long dbId;

    public Conversation(Set<Message> messages, Set<User> members, ConversationPublicId conversationPublicId, ConversationName conversationName, Long dbId) {
        assertMandatoryFields(members,conversationName);
        this.messages = messages;
        this.members = members;
        this.conversationPublicId = conversationPublicId;
        this.conversationName = conversationName;
        this.dbId = dbId;
    }


    private void assertMandatoryFields(ConversationName conversationName, Set<User> members) {

        Assert.notNull("users",members);
        Assert.notNull("conversationName",conversationName);

    }



}
