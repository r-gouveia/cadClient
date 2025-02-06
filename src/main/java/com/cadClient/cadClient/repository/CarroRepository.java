package com.cadClient.cadClient.repository;

import com.cadClient.cadClient.entity.Carro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CarroRepository extends JpaRepository<Carro, UUID> {

    public Optional<Carro> findByPlaca(String placa);

}
