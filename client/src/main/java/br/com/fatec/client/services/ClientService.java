package br.com.fatec.client.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.fatec.client.entities.Client;
import br.com.fatec.client.repositories.ClientRepository;
import jakarta.persistence.EntityNotFoundException;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public Client getClientById(int id){
        return clientRepository.findById(id).orElseThrow(
            () -> new EntityNotFoundException("Cliente não encontrado")
        );
    }

    public List<Client> getClients() {
        return clientRepository.findAll();
    }
}
