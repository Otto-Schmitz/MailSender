package com.br.mail.service;

import jakarta.mail.internet.MimeMessage;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class SendMailService {
    @Autowired
    private JavaMailSender javaMailSender;

    @SneakyThrows
    public void send(String email, String body, String subject) {
        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setTo(email);
        helper.setSubject(subject);
        helper.setText(body, true);

        javaMailSender.send(message);
    }
}
