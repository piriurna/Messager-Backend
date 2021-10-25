package com.piriurna.messenger.data.models;

import java.util.Objects;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "Messages")
public class Message {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
  
    private Integer userId;
  
    private Integer chatId;
  
    @Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date created;
  
    private String text;
  
  
    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", user_id='" + userId + '\'' +
                ", chat_id='" + chatId + '\'' +
                ", created='" + created + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Message message = (Message) o;
	    return Objects.equals(message.id, id) && Objects.equals(userId, message.userId) && Objects.equals(chatId, message.chatId) && Objects.equals(created, message.created) && Objects.equals(text, message.text);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, userId, chatId, created, text);
	}

	public Integer getUserId() {
		return userId;
	}
	
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	
	public Integer getChatId() {
		return chatId;
	}
	
	public void setChatId(Integer chat_id) {
		this.chatId = chat_id;
	}
	
	public java.util.Date getCreated() {
		return created;
	}
	
	public void setCreated(java.util.Date created) {
		this.created = created;
	}
	
	public String getText() {
		return text;
	}
	
	public void setText(String text) {
		this.text = text;
	}

	public Object getId() {
		return id;
	}
	  
  
  
}
