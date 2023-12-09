package br.com.fatecararas.fatechelper.controller;

import br.com.fatecararas.fatechelper.model.entities.Curso;
import br.com.fatecararas.fatechelper.model.entities.DiaDaSemana;
import br.com.fatecararas.fatechelper.model.entities.Disciplina;
import br.com.fatecararas.fatechelper.model.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/helper/disciplinas")
public class DisciplinaController {

    @Autowired
    private CursoRepository cursoRepository;

    @GetMapping("/incluir")
    public String incluir(Disciplina disciplina, Model model) {
        model.addAttribute("diasDaSemana", DiaDaSemana.values());
        return "disciplinas/cadastrar";
    }

    @ModelAttribute("cursos")
    public List<Curso> getCursos() {
        return cursoRepository.findAll();
    }
}
