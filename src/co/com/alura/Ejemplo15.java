package co.com.alura;

import co.com.alura.model.Alumno;
import co.com.alura.model.Curso;

import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;


public class Ejemplo15 {
    public static void main(String[] args) {

        Curso curso1=new Curso("Historia",30);


        Alumno alumno1 = new Alumno("luis felipe","21");
        Alumno alumno2 = new Alumno("Juan Carlos","4");
        Alumno alumno3 = new Alumno("Mario Fernando","45");
        Alumno alumno4 = new Alumno("Jorge Alejandro","12");
        Alumno alumno5 = new Alumno("Carlos Andres","78");
        Alumno alumno6 = new Alumno("Nicolas Alejandro","32");
        Alumno alumno7 = new Alumno("Mauricion Antonio","52");
        Alumno alumno8 = new Alumno("Jorge Alejandro","54");

        Collection<Alumno> listaAlumnos= new HashSet<>();
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        curso1.addAlumno(alumno8);



        Alumno alumnoNuevo =new Alumno("luis felipe","21");
        System.out.println(alumno1.equals(alumnoNuevo));
        System.out.println(curso1.verificarAlumno(alumnoNuevo));
        curso1.getAlumnos().stream().sorted(Comparator.comparing(Alumno::getCodigo).reversed())
                .forEach(alumno -> System.out.println(alumno.getCodigo()));
    }
}
