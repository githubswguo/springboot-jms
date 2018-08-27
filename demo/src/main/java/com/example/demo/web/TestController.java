package com.example.demo.web;

import com.example.demo.activemq.Email;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    private JmsTemplate jmsTemplate;
    //发布订阅
    @GetMapping("/email/send")
    public Email updateItem(Email item){
        jmsTemplate.convertAndSend("mailbox",new Email("info@exmple.com","Hello"));
        return item;
    }
}
