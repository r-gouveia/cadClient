package com.cadClient.cadClient.dtos;

import com.cadClient.cadClient.entity.Carro;

import java.util.List;
import java.util.UUID;

public record AssociadoDTO(UUID id, String nome , List<Carro> carro) {
}
