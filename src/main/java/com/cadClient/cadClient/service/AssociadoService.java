package com.cadClient.cadClient.service;

import com.cadClient.cadClient.dtos.AssociadoDTO;
import com.cadClient.cadClient.entity.Associado;
import com.cadClient.cadClient.repository.AssociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.UUID;

@Service
public class AssociadoService {

    @Autowired
    private AssociadoRepository repository;

    public Associado salvarAssociado(Associado associado){
        return repository.save(associado);
    }
}
