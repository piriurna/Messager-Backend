package com.piriurna.messenger.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.piriurna.messenger.data.models.Message;
import com.piriurna.messenger.data.payloads.request.MessageRequest;
import com.piriurna.messenger.data.payloads.response.MessageResponse;
import com.piriurna.messenger.data.service.MessageService;

@RestController
@RequestMapping("/messages")
public class MessageController {

	@Autowired
    MessageService messageService;

    @GetMapping("/all")
    public ResponseEntity<List<Message>> getAllMessages () {
        List<Message> messages = messageService.getAllMessages();
        return new ResponseEntity<>(messages, HttpStatus.OK);
    }
    
    @GetMapping("/find/{id}")
    public ResponseEntity<Message> getMessageById (@PathVariable("id") Integer id) {
        Message message = messageService.getASingleMessage(id);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
    
    
    @PostMapping("/add")
    public ResponseEntity<MessageResponse> addMessage( @RequestBody MessageRequest message) {
        MessageResponse newEmployee = messageService.createMessage(message);
        return new ResponseEntity<>(newEmployee, HttpStatus.CREATED);
    }
    
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteMessage(@PathVariable("id") Integer id) {
    	messageService.deleteMessage(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
