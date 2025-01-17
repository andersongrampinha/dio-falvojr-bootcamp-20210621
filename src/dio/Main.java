package dio;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import dio.dominio.Bootcamp;
import dio.dominio.Conteudo;
import dio.dominio.Curso;
import dio.dominio.Dev;
import dio.dominio.Mentoria;

public class Main {

	public static void main(String[] args) {

		Curso cursoJavaBasico = new Curso();
		cursoJavaBasico.setTitulo("Java Básico");
		cursoJavaBasico.setDescricao("Aprenda conceitos básicos sobre java.");
		cursoJavaBasico.setCargaHoraria(8);

		Curso cursoDotNet = new Curso();
		cursoDotNet.setTitulo("Java .NET");
		cursoDotNet.setDescricao("Aprenda conceitos básicos sobre C#.");
		cursoDotNet.setCargaHoraria(8);

		Curso cursoJavaAvancado = new Curso();
		cursoJavaAvancado.setTitulo("Java Avançado");
		cursoJavaAvancado.setDescricao("Aprenda conceitos avançados sobre java.");
		cursoJavaAvancado.setCargaHoraria(8);

		Mentoria mentoria = new Mentoria();
		mentoria.setTitulo("Aprendendo Orientação a Objetos com Java ");
		mentoria.setDescricao("Imersão sobre os pilares da Orientação a Objetos");
		mentoria.setData(LocalDateTime.now());

		Bootcamp bootcamp = new Bootcamp();
		bootcamp.setNome("GFT START #2 Java");
		bootcamp.setInicio(LocalDate.now());
		bootcamp.setFim(bootcamp.getInicio().plusDays(45));
		List<Conteudo> conteudosBootcamp = Arrays.asList(cursoJavaBasico, cursoJavaAvancado, mentoria);
		bootcamp.setConteudos(conteudosBootcamp);

		Dev felipao = new Dev();
		felipao.setNome("Felipão");

		Dev venilton = new Dev();
		venilton.setNome("Venilton");

		felipao.inscrever(cursoDotNet);
		felipao.inscrever(bootcamp);
		felipao.progredir();
		felipao.progredir();

		venilton.inscrever(bootcamp);
		venilton.progredir();
		venilton.progredir();
		venilton.progredir();

		System.out.println(String.format("XP Felipão: %.2f", felipao.calcularTotalXp()));
		System.out.println(String.format("XP Venilton: %.2f", venilton.calcularTotalXp()));

		/*
		List<Dev> ranking = Arrays.asList(felipao, venilton).stream() .sorted((dev1,
		  dev2) -> Double.compare(dev2.calcularTotalXp(), dev1.calcularTotalXp()))
		  .collect(Collectors.toList());
		 

		for (Dev dev : ranking) {
			System.out.println(dev.getNome());
		}*/
	}

}
