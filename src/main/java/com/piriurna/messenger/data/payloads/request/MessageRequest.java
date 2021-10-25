package com.piriurna.messenger.data.payloads.request;

import java.sql.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MessageRequest {

	@NotBlank
	@NotNull
	private Integer user_id;
  
	@NotBlank
	@NotNull
	private Integer chat_id;
  
	@NotBlank
	@NotNull
	private Date created;
  
	@NotBlank
	@NotNull
	private String text;
	
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
}
