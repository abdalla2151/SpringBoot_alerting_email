package com.efinance.emailsender.service;

import javax.mail.MessagingException;

import com.efinance.emailsender.dto.EmailDto;

public interface EmailService {

	public void sendSimpleMessage(EmailDto emailDto);

	public void sendHtmlMessage(EmailDto emailDto) throws MessagingException;

}
