package com.springBoot_projeto1.projeto1.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {

    @Id
    private Long        id;
    @ManyToOne
    private NivelAcesso nivelAcesso;
    private String      descricao;
}
