package com.cadClient.cadClient.controller;

import com.cadClient.cadClient.entity.Associado;
import com.cadClient.cadClient.service.AssociadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/associados")
public class AssociadoController {

    @Autowired
    private AssociadoService service;

    @PostMapping("/associado")
    public ResponseEntity<Associado> criar(@RequestBody  Associado associado){
        Associado newAssociado = service.criarAssociado(associado);
        return new ResponseEntity<>(newAssociado, HttpStatus.CREATED);
    }

    @GetMapping("/{placa}")
    public ResponseEntity<Associado> verAssociado(@RequestParam String placa){
        Associado associado = service.buscarAssociado(placa);
        if(associado != null){
            return ResponseEntity.ok(associado);
        } return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

   
}
