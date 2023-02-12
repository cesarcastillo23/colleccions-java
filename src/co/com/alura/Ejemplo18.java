package co.com.alura;

import co.com.alura.model.Alumno;
import co.com.alura.model.Curso;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Optional;


public class Ejemplo18 {
    public static void main(String[] args) {

        Curso curso1 = new Curso("Historia", 30);


        Alumno alumno1 = new Alumno("luis felipe", "21");
        Alumno alumno2 = new Alumno("Juan Carlos", "4");
        Alumno alumno3 = new Alumno("Mario Fernando", "45");
        Alumno alumno4 = new Alumno("Jorge Alejandro", "12");
        Alumno alumno5 = new Alumno("Carlos Andres", "78");
        Alumno alumno6 = new Alumno("Nicolas Alejandro", "32");
        Alumno alumno7 = new Alumno("Mauricion Antonio", "52");
        Alumno alumno8 = new Alumno("Jorge Alejandro", "54");

        Collection<Alumno> listaAlumnos = new HashSet<>();
        curso1.addAlumno(alumno1);
        curso1.addAlumno(alumno2);
        curso1.addAlumno(alumno3);
        curso1.addAlumno(alumno4);
        curso1.addAlumno(alumno5);
        curso1.addAlumno(alumno6);
        curso1.addAlumno(alumno7);
        curso1.addAlumno(alumno8);

        //curso1.getAlumnos().forEach(alumno -> System.out.println(alumno));

        Iterator<Alumno> alumnoIterator = curso1.getAlumnos().iterator();

       Optional<Alumno>alumno= curso1.getAlumnos().stream().filter(a->"45".equalsIgnoreCase( a.getCodigo())).findFirst();
        if(alumno.isPresent()){
            System.out.println(alumno.get());
        }
        Alumno alumnoMap = curso1.getAlumnoMap().get("45");
        System.out.println(alumnoMap);
    }
}
