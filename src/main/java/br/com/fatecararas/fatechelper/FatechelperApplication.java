package br.com.fatecararas.fatechelper;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.fatecararas.fatechelper.model.entities.Curso;
import br.com.fatecararas.fatechelper.model.repositories.CursoRepository;

@SpringBootApplication
public class FatechelperApplication implements CommandLineRunner {

	@Autowired
	private CursoRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(FatechelperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Curso c1 = new Curso();
		c1.setNome("Desenvolvimento de Software Multiplataforma");

		Curso c2 = new Curso();
		c2.setNome("Gestão Empresarial");

		repository.save(c1);
		repository.save(c2);

		List<Curso> cursos = repository.findAll();

		System.out.println(cursos);
	}

}
