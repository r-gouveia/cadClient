package com.cadClient.cadClient.entity;
import jakarta.persistence.*;
import java.util.UUID;

@Entity
@Table(name ="carros")
public class Carro {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    private String modelo;
    private String cor;
    private String placa;
    private int ano;

    @Enumerated(EnumType.STRING)
    private Montadora montadora;

    @ManyToOne
    private Associado associado;

    public Carro(){}

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Montadora getMontadora() {
        return montadora;
    }

    public void setMontadora(Montadora montadora) {
        this.montadora = montadora;
    }

    public Associado getAssociado() {
        return associado;
    }

    public void setAssociado(Associado associado) {
        this.associado = associado;
    }
}
