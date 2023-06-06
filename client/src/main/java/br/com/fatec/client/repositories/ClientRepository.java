package br.com.fatec.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.fatec.client.entities.Client;

public interface ClientRepository extends JpaRepository <Client, Integer>{ //Tem que ser interface, O repositorio deve ser Interface, Primeiro deve ser O tipo, o tipo da chave primaria.
    
}
