package com.piriurna.messenger.data.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.piriurna.messenger.data.models.Message;
import com.piriurna.messenger.data.payloads.request.MessageRequest;
import com.piriurna.messenger.data.payloads.response.MessageResponse;

@Component
public interface MessageService {
	MessageResponse createMessage(MessageRequest messageRequest);
    void deleteMessage(Integer messageId);
    Message getASingleMessage(Integer messageId);
//    List<Message> getAllMessagesFromChat(Integer chatId);
    List<Message> getAllMessages();
}
