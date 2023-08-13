package com.br.mail.controller;

import com.br.mail.service.HtmlFormaterService;
import com.br.mail.service.SendMailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {
    @Autowired
    private SendMailService sendMailService;

    @Autowired
    private HtmlFormaterService htmlFormaterService;

    private static final String EMAIL = System.getenv("MAIL_TO");

    @GetMapping()
    public void sendMail() {
        sendMailService.send(EMAIL, htmlFormaterService.getFormat(), "SUBJECT");
    }
}
