package me.dio.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name= "tb_account") // Define que esta classe é uma entidade JPA e será mapeada para a tabela "tb_account"
public class Account {

    @Id // Marca o campo "id" como a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que o valor da chave primária será gerado automaticamente pelo banco de dados (auto-incremento)
    private Long id;
    
    @Column(unique= true) // Define que a coluna será única no banco de dados, ou seja, não poderá ter valores duplicados
    private String number;
    
    private String agency;

    @Column(precision=2, scale=13)
    private BigDecimal balance;

    @Column(name="adicional_limit",precision=2, scale=13)
    private BigDecimal limit;
}
