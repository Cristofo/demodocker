package com.example.docker.demodocker.service.impl;

import com.example.docker.demodocker.dto.Client;
import com.example.docker.demodocker.repository.ClientRepository;
import com.example.docker.demodocker.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {

    private final ClientRepository clientRepository;


    @Override
    public List<Client> getClients() {
        return clientRepository.findAll();
    }
}
