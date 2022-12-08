package com.example.docker.demodocker.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@Builder
@Document
public class Client {

    @Id
    private String dni;
    private String name;
    private int age;
    private String address;


}
