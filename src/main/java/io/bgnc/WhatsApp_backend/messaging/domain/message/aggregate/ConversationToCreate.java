package io.bgnc.WhatsApp_backend.messaging.domain.message.aggregate;

import io.bgnc.WhatsApp_backend.messaging.domain.message.vo.ConversationName;
import io.bgnc.WhatsApp_backend.shared.error.domain.Assert;

public class ConversationToCreate {

    private final Set<UserPublicId> members;

    private final ConversationName conversationName;

    public ConversationToCreate(Set<UserPublicId> members, ConversationName conversationName) {
        this.members = members;
        this.conversationName = conversationName;
    }

    private void assertMandatoryFields(Set<UserPublicId> members, ConversationName name){

        Assert.notNull("name",conversationName);
        Assert.notNull("members",members);
    }
}
