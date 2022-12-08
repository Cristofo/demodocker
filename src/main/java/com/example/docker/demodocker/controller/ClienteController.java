package com.example.docker.demodocker.controller;


import com.example.docker.demodocker.dto.Client;
import com.example.docker.demodocker.service.ClientService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("controller-clients")
@RequiredArgsConstructor
public class ClienteController {


    private final ClientService clientService;


    @GetMapping(value = "/get-all")
    public List<Client> getClientes(){
        return clientService.getClients();
    }

}
