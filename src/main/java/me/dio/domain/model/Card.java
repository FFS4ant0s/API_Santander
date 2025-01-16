package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tb_card")
public class Card {

    @Id // Marca o campo "id" como a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que o valor da chave primária será gerado automaticamente pelo banco de dados (auto-incremento)
    private Long id;
    
    @Column(unique=true)
    private String number;

    @Column(name="avariable_limit",precision=13, scale=2)
    private BigDecimal limit;
}
