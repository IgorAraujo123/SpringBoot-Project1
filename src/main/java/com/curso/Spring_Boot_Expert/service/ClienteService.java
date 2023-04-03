package com.curso.Spring_Boot_Expert.service;

import com.curso.Spring_Boot_Expert.model.Cliente;
import com.curso.Spring_Boot_Expert.repository.ClienteRepository;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    private ClienteRepository repository;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
    }

    public void salvarCliente(Cliente cliente){
        valdarCliente(cliente);
        this.repository.salvar(cliente);
    }

    public void valdarCliente(Cliente cliente){

    }
}
