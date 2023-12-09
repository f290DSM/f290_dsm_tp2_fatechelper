package br.com.fatecararas.fatechelper.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "disciplinas")
public class Disciplina {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private DiaDaSemana diaDaSemana;

    @ManyToOne
    @JoinColumn(name = "id_curso_fk")
    private Curso curso;
}
