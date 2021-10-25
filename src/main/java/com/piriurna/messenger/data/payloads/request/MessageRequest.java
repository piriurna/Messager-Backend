package com.piriurna.messenger.data.payloads.request;

import javax.persistence.Basic;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class MessageRequest {

	@NotBlank
	@NotNull
	private Integer userId;

	@NotBlank
	@NotNull
	private Integer chatId;

	@Basic
    @Temporal(TemporalType.TIMESTAMP)
    private java.util.Date created;

	@NotBlank
	@NotNull
	private String text;

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
}
