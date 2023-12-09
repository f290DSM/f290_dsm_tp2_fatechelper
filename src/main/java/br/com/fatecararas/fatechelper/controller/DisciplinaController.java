package br.com.fatecararas.fatechelper.controller;

import br.com.fatecararas.fatechelper.model.entities.Curso;
import br.com.fatecararas.fatechelper.model.entities.DiaDaSemana;
import br.com.fatecararas.fatechelper.model.entities.Disciplina;
import br.com.fatecararas.fatechelper.model.repositories.CursoRepository;
import br.com.fatecararas.fatechelper.model.repositories.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/helper/disciplinas")
public class DisciplinaController {

    @Autowired
    private CursoRepository cursoRepository;
    @Autowired
    private DisciplinaRepository repository;

    @GetMapping("/incluir")
    public String incluir(Disciplina disciplina, Model model) {
        model.addAttribute("diasDaSemana", DiaDaSemana.values());
        return "disciplinas/cadastrar";
    }

    @PostMapping("/salvar")
    public String salvar(Disciplina disciplina) {
        repository.save(disciplina);
        return "disciplinas/listar";
    }

    @ModelAttribute("cursos")
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }
}
