package me.dio.domain.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Getter // Gera automaticamente os métodos getters para os campos da classe
@Setter // Gera automaticamente os métodos setters para os campos da classe
@Entity(name = "tb_user") // Define que esta classe é uma entidade JPA e será mapeada para a tabela "tb_user"
public class User {
    
    @Id // Marca o campo "id" como a chave primária da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Especifica que o valor da chave primária será gerado automaticamente pelo banco de dados (auto-incremento)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL) // Define um relacionamento de um-para-um, onde as entidades relacionadas serão salvas/atualizadas/apagadas juntas
    private Account account;
    
    @OneToOne(cascade = CascadeType.ALL) // Define um relacionamento de um-para-um, onde as entidades relacionadas serão salvas/atualizadas/apagadas juntas
    private Card card;
    
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // Define um relacionamento de um-para-muitos, onde as entidades relacionadas serão salvas/atualizadas/apagadas juntas e carregadas de forma imediata (EAGER)
    private List<Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER) // Define um relacionamento de um-para-muitos, onde as entidades relacionadas serão salvas/atualizadas/apagadas juntas e carregadas de forma imediata (EAGER)
    private List<News> news;

}

