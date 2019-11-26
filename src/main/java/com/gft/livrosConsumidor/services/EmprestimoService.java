package com.gft.livrosConsumidor.services;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.gft.livrosConsumidor.models.Emprestimo;
import com.gft.livrosConsumidor.utils.EmailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

import javax.jms.JMSException;
import javax.jms.TextMessage;
import javax.mail.MessagingException;
import java.math.BigDecimal;

@Component
public class EmprestimoService {
    @Autowired
    private EmailUtils emailUtils;

    @Autowired
    private ObjectMapper mapper;

    @JmsListener(destination = "emprestimoQueue")
    public void receiveEmprestimo(TextMessage emprestimo) {
        try {
            Emprestimo emprestimoObj = mapper.readValue(emprestimo.getText(), Emprestimo.class);
            emprestimoObj.setValorMulta(emprestimoObj.getValorMulta().setScale(2, BigDecimal.ROUND_HALF_EVEN));
            String corpoEmail = emailUtils.corpoEmail(emprestimoObj);
            String email = emprestimoObj.getSocio().getEmail();
            emailUtils.sendEmail(corpoEmail, email);
        } catch (JMSException | JsonProcessingException | MessagingException e) {
            e.printStackTrace();
        }
    }
}
