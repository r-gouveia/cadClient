package com.cadClient.cadClient.controller;

import com.cadClient.cadClient.dtos.AssociadoDTO;
import com.cadClient.cadClient.service.AssociadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/associados")
public class AssociadoController {

    @Autowired
    private AssociadoService service;

    public AssociadoController(AssociadoService service) {
        this.service = service;
    }

    @GetMapping
    public ResponseEntity<Optional<AssociadoDTO>> buscarAssociado(){

    }
}
