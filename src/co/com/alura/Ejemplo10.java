package co.com.alura;

import co.com.alura.model.Curso;

import java.util.*;
import java.util.stream.Collectors;

public class Ejemplo10 {
    public static void main(String[] args) {

        Curso curso1=new Curso("Historia",30);
        Curso curso3=new Curso("Quimica",10);
        Curso curso2=new Curso("Sociales",20);
        Curso curso4=new Curso("Fisica",50);
        Curso curso5=new Curso("Matematicas",25);
        Curso curso6=new Curso("Programacion",10);
        Curso curso7=new Curso("Quimica",7);
        Curso curso8=new Curso("Fisica",15);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);
        cursos.add(curso5);
        cursos.add(curso6);
        cursos.add(curso7);
        cursos.add(curso8);


        List<Curso> cursosList = cursos.stream()
                .filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby"))
                .sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursos.stream()
                .filter(curso -> !curso.getNombre().equalsIgnoreCase("Historia"))
                .mapToInt(Curso::getTiempo).sum());

        System.out.println(cursos.stream()
                .mapToInt(Curso::getTiempo).average().getAsDouble());

        System.out.println(cursos.stream()
                .mapToInt(Curso::getTiempo).max().getAsInt());

        System.out.println(cursos.stream()
                .mapToInt(Curso::getTiempo).min().getAsInt());
                //Elementos de listas repetidas
        Map<String,List<Curso>> grupoCurso = cursos.stream()
                .collect(Collectors.groupingBy(Curso::getNombre));
            grupoCurso.forEach((key,value) -> System.out.println(key+"-"+value.size()));


        System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());

    }
}
