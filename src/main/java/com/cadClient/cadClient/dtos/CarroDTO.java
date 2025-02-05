package com.cadClient.cadClient.dtos;

import com.cadClient.cadClient.entity.Montadora;

import java.util.UUID;

public record CarroDTO(UUID id , String modelo, Montadora montadora, String placa) {
}
