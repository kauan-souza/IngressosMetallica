package com.fundatec.ingressosMetallica.service;

import com.fundatec.ingressosMetallica.domain.Cliente;
import com.fundatec.ingressosMetallica.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void SalvarCliente(Cliente cliente){
        this.repository.save(cliente);
    }

}
