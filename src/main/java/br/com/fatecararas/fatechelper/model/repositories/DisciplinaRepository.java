package br.com.fatecararas.fatechelper.model.repositories;

import br.com.fatecararas.fatechelper.model.entities.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisciplinaRepository extends JpaRepository<Disciplina, Integer> {
}
