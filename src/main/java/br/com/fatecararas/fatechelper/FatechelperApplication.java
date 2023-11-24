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
		c1.setDescricao("O currículo do Curso Superior de Tecnologia Desenvolvimento de Software Multiplataforma do eixo tecnológico Informação e Comunicação oferece disciplinas como Matemática para Computação, Álgebra Linear, Redação Técnica e Ética Profissional e Patente, Metodologias Ágeis para Gestão de Projetos de Software, Inglês, além de conhecimentos mais específicos da área como: Algoritmo e Lógica de Programação, Programação para Desktop, Programação para Dispositivos Móveis, Programação para Web, Experiência do Usuário, Computação em Nuvem, Inteligência Artificial, Segurança da Informação, Internet das Coisas, Banco de Dados e Engenharia de Software. O conteúdo do curso prepara os alunos para desenvolver software para diversas plataformas, tais como Web, Desktop, Móvel, em Nuvem Internet das Coisas, empregando conceitos de Segurança da Informação e Inteligência Artificial, além de integração e entrega contínua de software, visando desenvolver soluções de software que atendam os critérios de qualidade exigidos pelo mercado.");

		Curso c2 = new Curso();
		c2.setNome("Gestão Empresarial");
		c2.setDescricao("Contabilidade, economia e administração são as bases de Gestão Empresarial. Direito tributário, logística, empreendedorismo, gestão ambiental, comportamento organizacional (postura do profissional no ambiente de trabalho) e utilização de ferramentas de marketing para motivar e orientar os funcionários também fazem parte da formação. O aluno também aprende a elaborar o planejamento estratégico, que define os objetivos de uma empresa a traçar as estratégias para alcançá-los, usando os recursos disponíveis de maneira eficiente.");

		repository.save(c1);
		repository.save(c2);

		List<Curso> cursos = repository.findAll();

		System.out.println(cursos);
	}

}
