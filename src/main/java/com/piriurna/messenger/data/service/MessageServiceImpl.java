package com.piriurna.messenger.data.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.piriurna.messenger.data.models.Message;
import com.piriurna.messenger.data.payloads.request.MessageRequest;
import com.piriurna.messenger.data.payloads.response.MessageResponse;
import com.piriurna.messenger.data.repository.MessageRepository;

@Service
public class MessageServiceImpl implements MessageService {

	@Autowired
	MessageRepository messageRepository;
	
	@Override
	public MessageResponse createMessage(MessageRequest messageRequest) {
		Message message = new Message();
		message.setChatId(messageRequest.getChatId());
		message.setCreated(messageRequest.getCreated());
		message.setUserId(messageRequest.getUserId());
		message.setText(messageRequest.getText());
		
		messageRepository.save(message);
		
		return new MessageResponse("New Message created successfully");
	}

	@Override
	public void deleteMessage(Integer messageId){
		if (messageRepository.getById(messageId).getId().equals(messageId)){
			messageRepository.deleteById(messageId);
        }
        //error should throw exception
    }

	@Override
	public Message getASingleMessage(Integer messageId) {
		return messageRepository.findById(messageId).orElse(new Message());
	}

//	@Override
//	public List<Message> getAllMessagesFromChat(Integer chatId) {
////		return messageRepository.findAll(Example.of(chatId));
//	}

	@Override
	public List<Message> getAllMessages() {
		return messageRepository.findAll();
	}

}
