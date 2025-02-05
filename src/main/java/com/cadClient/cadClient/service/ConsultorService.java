package com.cadClient.cadClient.service;

import com.cadClient.cadClient.repository.AssociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConsultorService {

    @Autowired
    private AssociadoRepository repository;

    public ConsultorService(AssociadoRepository repository) {
        this.repository = repository;
    }

    //criar - post
    //salvar - put
    //deletar - delete
    //atualizar - patch
    //buscarAssociado - get
}
