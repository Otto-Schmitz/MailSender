package com.br.mail.service;

import org.springframework.stereotype.Service;

@Service
public class HtmlFormaterService {
    public String getFormat() {
        StringBuilder builder = new StringBuilder();

        builder.append("<div>")
                .append("<h1>")
                .append("Hello World!")
                .append("</h1>\n")
                .append("<p style=\"color:blue\">Just text.</p>")
                .append("</div>");
        return builder.toString();
    }
}
