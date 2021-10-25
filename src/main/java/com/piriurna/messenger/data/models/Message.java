package com.piriurna.messenger.data.models;

import java.sql.Date;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Message {
    
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
  
    private Integer user_id;
  
    private Integer chat_id;
  
    private Date created;
  
    private String text;
  
  
    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", user_id='" + user_id + '\'' +
                ", chat_id='" + chat_id + '\'' +
                ", created='" + created + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

	@Override
	public boolean equals(Object o) {
	    if (this == o) return true;
	    if (o == null || getClass() != o.getClass()) return false;
	    Message message = (Message) o;
	    return Objects.equals(message.id, id) && Objects.equals(user_id, message.user_id) && Objects.equals(chat_id, message.chat_id) && Objects.equals(created, message.created) && Objects.equals(text, message.text);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(id, user_id, chat_id, created, text);
	}

	public Integer getUserId() {
		return user_id;
	}
	
	public void setUserId(Integer user_id) {
		this.user_id = user_id;
	}
	
	public Integer getChatId() {
		return chat_id;
	}
	
	public void setChatId(Integer chat_id) {
		this.chat_id = chat_id;
	}
	
	public Date getCreated() {
		return created;
	}
	
	public void setCreated(Date created) {
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
