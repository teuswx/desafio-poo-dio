import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso java");
    curso1.setDescricao("Descrição curso java");
    curso1.setCargaHoraria(40);
    System.out.println(curso1);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso js");
    curso2.setDescricao("Descrição curso js");
    curso2.setCargaHoraria(10);
    System.out.println(curso2);

    Mentoria mentoria = new Mentoria();

    mentoria.setTitulo("Mentoria de java");
    mentoria.setDescricao("descrição mentoria java");
    mentoria.setData(LocalDate.now());
    System.out.println(mentoria);

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp java Developer");
    bootcamp.setDescricao("Descrição bootcamp Java Developer");
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);
    bootcamp.getConteudos().add(mentoria);

    Dev devCamila = new Dev();
    devCamila.setNome("Camila");
    devCamila.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());

    devCamila.progredir();
    System.out.println("-");
    System.out.println("Conteúdos inscritos Camila" + devCamila.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos João" + devCamila.getConteudosConcluidos());
    System.out.println("XP: "+ devCamila.calcularTotalXP());

    System.out.println("-------");

    Dev devJoao = new Dev();
    devJoao.setNome("Joao");
    devJoao.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos inscritos Joao" + devJoao.getConteudosInscritos());
    devJoao.progredir();
    System.out.println("-");
    System.out.println("Conteúdos inscritos Joao" + devJoao.getConteudosInscritos());
    System.out.println("Conteúdos Concluídos Joao" + devJoao.getConteudosConcluidos());
    System.out.println("XP: "+ devJoao.calcularTotalXP());
    }
}