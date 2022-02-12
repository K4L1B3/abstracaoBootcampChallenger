package view;

import java.time.LocalDate;

import model.Bootcamp;
import model.Cursos;
import model.Dev;
import model.Mentorias;

public class App {
    public static void main(String[] args) throws Exception {
       
        Cursos Curso = new Cursos();
            Curso.setCargahoraria(30);
            Curso.setDescricao("Curso voltado para desenvolvimento web");
            Curso.setTitulo("Curso de Java");
            
        Cursos Curso2 = new Cursos();
            Curso2.setCargahoraria(12);
            Curso2.setDescricao("Curso voltado para desenvolvimento web");
            Curso2.setTitulo("Curso de Java");
            
        Mentorias Mentoria = new Mentorias();
            Mentoria.setDate(LocalDate.now());  
            Mentoria.setDescricao("Mentoria de java voltado para iniciantes que querem aprender sobre programação orientada a objetos");
            Mentoria.setTitulo("Java: Rodrigo DIO");
            
            
        Mentorias Mentoria2 = new Mentorias();
            Mentoria2.setDate(LocalDate.now());  
            Mentoria2.setDescricao("Mentoria de javaScript voltado para desenvolvedores web");
            Mentoria2.setTitulo("JavaScript: Gabriela Duarte DIO");



        // System.out.println(Mentoria.getTitulo());
        // System.out.println(Mentoria.getDescricao());
        // System.out.println(Mentoria.getDate());


        Bootcamp bootcamp = new Bootcamp();
            bootcamp.setNome("Bootcamp Python Developer");
            bootcamp.setDescricao("Descricao bootcamp python IA developer");
            bootcamp.getConteudos().add(Curso);
            bootcamp.getConteudos().add(Curso2);
            bootcamp.getConteudos().add(Mentoria);

        Dev devLuiz = new Dev();
            devLuiz.setNome("Luiz");
            devLuiz.Inscrever(bootcamp);
            System.out.println(devLuiz.getNome() + " - " + "Conteudos inscritos" + devLuiz.getConteudosInseridos());
            devLuiz.progredir();
            System.out.println(devLuiz.getNome() + " - " + "Conteudos conncluidos" + devLuiz.getConteudosConcluidos());
            System.out.println("XP: " + devLuiz.calcularTotalXp());
            
            Dev devNany = new Dev();
            devNany.setNome("Nany");
            devNany.Inscrever(bootcamp);
            System.out.println(devNany.getNome() + " - " + "Conteudos inscritos" + devNany.getConteudosInseridos());
            // devNany.progredir();
            System.out.println(devNany.getNome() + " - " + "Conteudos conncluidos" + devNany.getConteudosConcluidos());
            System.out.println("XP: " + devNany.calcularTotalXp());

        


    }
}
