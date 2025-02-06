package com.cadClient.cadClient.repository;

import com.cadClient.cadClient.entity.Associado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface AssociadoRepository extends JpaRepository<Associado, UUID> {


}
