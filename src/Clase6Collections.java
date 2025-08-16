import java.util.ArrayList;
import java.util.List;

public class Clase6Collections {
    public static void main(String[] args) {
//        List<String> lenguajes = new ArrayList<>();
//        lenguajes.add("Kotlin");
//        lenguajes.add("Java");
//        lenguajes.add("C#");
//        lenguajes.add("Python");
//        lenguajes.add("Typescript");
//
//        for (String lenguaje : lenguajes){
//            System.out.println(lenguaje);
//        }
//
//        System.out.println( "El elemto Java existe?" + lenguajes.contains("Java"));
//
//        System.out.println("El elemento del inidice 1 " + lenguajes.get(1) );
//
//        System.out.println("Removiendo el ultimo lenguaje");
//        lenguajes.remove(4);

        List<Double> calificaciones = new ArrayList<>();

        calificaciones.add(11.4);
        calificaciones.add(18.0);
        calificaciones.add(13.4);
        calificaciones.add(14.5);
        calificaciones.add(16.5);

        double suma = 0;
        for (Double calificacion : calificaciones){
            suma += calificacion;
        }

        double promedio = suma / calificaciones.size();
        System.out.println("Su promedio es :" + promedio );

    }
}
