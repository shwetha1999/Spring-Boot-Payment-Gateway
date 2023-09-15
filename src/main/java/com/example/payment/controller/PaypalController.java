package com.example.payment.controller;

import com.example.payment.entity.Order;
import com.example.payment.service.PaypalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class PaypalController {

    @Autowired
    private PaypalService paypalService;


    @PostMapping("/pay")
    public String pay(){
        return "message";
    }





}
