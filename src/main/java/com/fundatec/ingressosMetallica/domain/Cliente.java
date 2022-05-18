package com.fundatec.ingressosMetallica.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String dataDeNascimento;

    @Column
    private String estudante;

    public Cliente(String dataDeNascimento, String estudante) {
        this.dataDeNascimento = dataDeNascimento;
        this.estudante = estudante;
    }
}
