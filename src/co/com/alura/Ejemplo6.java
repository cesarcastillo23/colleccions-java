package co.com.alura;

import co.com.alura.model.Aula;
import co.com.alura.model.Curso;

import java.util.ArrayList;

public class Ejemplo6 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Java", 30);
        curso1.addAula(new Aula("ArrayList"));
        curso1.addAula(new Aula("List"));
        curso1.addAula(new Aula("String"));


        ArrayList<Curso> cursos = new ArrayList<>();
        cursos.add(curso1);

        System.out.println(cursos.get(0).getAulaList());

    }
}
