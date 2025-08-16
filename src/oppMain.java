import models.Transaccion;

import java.time.LocalDateTime;
import java.util.Scanner;

public class oppMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Crear un objeto transaccion
        Transaccion transaccion1 = new Transaccion();
        transaccion1.setNombre("Transaccion Codigo");

        Transaccion transaccion2 = new Transaccion(
                2,
                "transaccion dos",
                22.50,
                LocalDateTime.now(),
                "yape",
                "Comida",
                "Chinawok"
        );

        System.out.println(transaccion1.getNombre());

        System.out.println(transaccion2.getFechaCreacion());
    }
}
