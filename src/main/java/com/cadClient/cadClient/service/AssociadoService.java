package com.cadClient.cadClient.service;

import com.cadClient.cadClient.dtos.AssociadoDTO;
import com.cadClient.cadClient.entity.Associado;
import com.cadClient.cadClient.entity.Carro;
import com.cadClient.cadClient.repository.AssociadoRepository;
import com.cadClient.cadClient.repository.CarroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Optional;
import java.util.UUID;

@Service
public class AssociadoService {

    @Autowired
    private AssociadoRepository repository;
    @Autowired
    private CarroRepository carroRepository;

    public Associado criarAssociado(Associado associado){
        return repository.save(associado);
    }

    public Associado buscarAssociado(String placa){
        Optional<Carro> associadoPorCarro = carroRepository.findByPlaca(placa);
        if(associadoPorCarro.isPresent()) {
            Carro carro = associadoPorCarro.get();
            return carro.getAssociado();
        }
        return null;
    }




}
