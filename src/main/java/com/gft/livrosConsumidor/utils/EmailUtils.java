package com.gft.livrosConsumidor.utils;

import com.gft.livrosConsumidor.models.Emprestimo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Component
public class EmailUtils {
    @Autowired
    private JavaMailSender sender;

    @Autowired
    private TemplateEngine templateEngine;

    public String corpoEmail(Emprestimo emprestimoObj) {
        final Context context = new Context();
        context.setVariable("emprestimo", emprestimoObj);
        return templateEngine.process("emprestimoTemplate", context);
    }

    public void sendEmail(String corpoEmail, String email) throws MessagingException {
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);

        helper.setTo(email);
        helper.setText(corpoEmail, true);
        helper.setSubject("Devolução do empréstimo de livros");
        sender.send(message);
    }
}
