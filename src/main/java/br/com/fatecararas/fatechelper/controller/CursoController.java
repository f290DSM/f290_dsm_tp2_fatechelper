package br.com.fatecararas.fatechelper.controller;

import br.com.fatecararas.fatechelper.model.entities.Curso;
import br.com.fatecararas.fatechelper.model.repositories.CursoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/helper/curso")
public class CursoController {

    @Autowired
    private CursoRepository repository;

    @GetMapping("/novo")
    String incluir(Curso curso) {
        return "cursos/cadastrar";
    }

    @GetMapping("/todos")
    String listar() {
        return "cursos/listar";
    }


    @ModelAttribute("cursos")
    public List<Curso> getCursos() {
        return repository.findAll();
    }
}
