import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso java");
        curso1.setDescricao("Descrição curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso js");
        curso2.setDescricao("Descrição curso js");
        curso2.setCargaHoraria(8);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria java");
        mentoria.setDescricao("Descrição mentoria java");
        mentoria.getData(LocalDate.now());
        System.out.println(mentoria);

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp java");
        bootcamp.setDescricao("Descrição Bootcamp java developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        Dev dev2 = new Dev();

        dev1.setNome("Primeiro Machado");
        dev1.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + dev1.getNome() + " - " + dev1.getConteudosInscritos());
        System.out.println("XP: " + dev1.calcularTotalXp());
        dev1.progredir();
        System.out.println("Avançoou no bootcamp.\nConteúdos inscritos " + dev1.getNome() + " - " + dev1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev1.getNome() + " - " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev1.calcularTotalXp());

        dev2.setNome("Segundo da Silva");
        dev2.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos " + dev2.getNome() + " - " + dev2.getConteudosInscritos());
        System.out.println("XP: " + dev2.calcularTotalXp());
        dev2.progredir();
        dev2.progredir();
        System.out.println("Avançoou no bootcamp.\nConteúdos inscritos " + dev2.getNome() + " - " + dev2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos " + dev2.getNome() + " - " + dev1.getConteudosConcluidos());
        System.out.println("XP: " + dev2.calcularTotalXp());







    }
}
