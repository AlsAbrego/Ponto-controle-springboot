package com.springBoot_projeto1.projeto1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {

    @Id
    private Long                id;
    @ManyToOne
    private CategoriaUsuario    categoriaUsuario;
    private String              nome;
    @ManyToOne
    private Empresa             empresa;
    @ManyToOne
    private NivelAcesso         nivelAcesso;
    @ManyToOne
    private JornadaTrabalho     jornadaTrabalho;
    private BigDecimal          tolerancia;
    private LocalDateTime       inicioJornada;
    private LocalDateTime       finalJornada;

}
