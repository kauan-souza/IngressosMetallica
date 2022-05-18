package com.fundatec.ingressosMetallica.controller;

import com.fundatec.ingressosMetallica.domain.Cliente;
import com.fundatec.ingressosMetallica.service.ClienteService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClienteController {

    private ClienteService service;

    public ClienteController(ClienteService service) {
        this.service = service;
    }

    @PostMapping
    public void SalvarCliente(@RequestBody Cliente cliente){
        this.service.SalvarCliente(cliente);
    }

}
