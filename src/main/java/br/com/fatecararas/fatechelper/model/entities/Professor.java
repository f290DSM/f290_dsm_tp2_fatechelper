package br.com.fatecararas.fatechelper.model.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "professores")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @ManyToMany
    @JoinTable(name = "professor_disciplina",
    joinColumns = {
            @JoinColumn(name = "id_disciplina")
    })
    private List<Disicplina> disicplinas = new ArrayList<>();
}
