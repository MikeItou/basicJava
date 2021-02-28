package dNumericTypes.Tarea;

import libs.Input;

public class Ducha {
    public static void main(String[] args) {

        int minutos, botellas;
        char respuesta;

        do{
            minutos = Input.get_int("Cuantos minutos dura tu banio? ");

            while(minutos < 0){
                System.out.println(minutos + " es un numero negativo, favor de ingresar un valor positivo");
                minutos = Input.get_int("Cuantos minutos dura tu banio? ");
            }

            botellas = minutos * 12;
            System.out.println(minutos + " minutos equivalen a " + botellas + " botellas de agua");
            respuesta = Input.get_char("Desea continuar (y/n)? ");
        }while(Character.toLowerCase(respuesta) == 'y');
    }
}
