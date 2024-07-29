import dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso cursoJava = new Curso();
        cursoJava.setTitulo("Curso Java");
        cursoJava.setDescricao("Descrição do curso Java");
        cursoJava.setCargaHoraria(8);

        Curso cursoJavaScrpit = new Curso();
        cursoJavaScrpit.setTitulo("Curso JavaScript");
        cursoJavaScrpit.setDescricao("Descrição do curso JavaScript");
        cursoJavaScrpit.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java");
        mentoria.setDescricao("Mentoria de Java");
        mentoria.setData(LocalDate.now());

        System.out.println(cursoJava);
        System.out.println(cursoJavaScrpit);
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Exemplo de descrição do Bootcamp Java Developer");
        bootcamp.getConteudos().add(cursoJava);
        bootcamp.getConteudos().add(cursoJavaScrpit);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Daniel");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Daniel:" + dev1.getConteudosInscritos());
        dev1.progredir();
        dev1.progredir();
        System.out.println("=============");
        System.out.println("Conteúdos Inscritos Daniel:" + dev1.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Daniel:" + dev1.getConteudosConcluidos());
        System.out.println("XP:" + dev1.calcularTotalXp());

        System.out.println("=============");

        Dev dev2 = new Dev();
        dev2.setNome("Giselle");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Giselle:" + dev2.getConteudosInscritos());
        dev2.progredir();
        dev2.progredir();
        dev2.progredir();
        System.out.println("--");
        System.out.println("Conteúdos Inscritos Giselle:" + dev2.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Giselle:" + dev2.getConteudosConcluidos());
        System.out.println("XP:" + dev2.calcularTotalXp());

    }
}