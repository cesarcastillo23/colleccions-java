package co.com.alura;

import co.com.alura.model.Curso;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Ejemplo5 {
    public static void main(String[] args) {

        Curso curso1=new Curso("Java",30);
        Curso curso3=new Curso("PHP",10);
        Curso curso2=new Curso("Ruby",20);
        Curso curso4=new Curso("JavaScript",50);


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);
        cursos.add(curso2);
        cursos.add(curso3);
        cursos.add(curso4);

        System.out.println(cursos);

        Collections.sort(cursos);
      //  Collections.sort(cursos,Comparator.comparing(Curso::getNombre));
      //  Collections.sort(cursos,Comparator.comparing(Curso::getNombre.reversed());
      // cursos.sort(Comparator.comparing(Curso::getNombre));

        System.out.println(cursos);

        Collections.sort(cursos, Collections.reverseOrder());

        List<Curso> cursosList = cursos.stream()
                .filter(curso -> !curso.getNombre().equalsIgnoreCase("Ruby"))
                .sorted(Comparator.comparingInt(Curso::getTiempo)).collect(Collectors.toList());

        System.out.println(cursosList);

    }
}
