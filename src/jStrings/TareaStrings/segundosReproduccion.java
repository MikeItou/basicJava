package jStrings.TareaStrings;

import libs.Input;

import java.security.PublicKey;

public class segundosReproduccion {
    public static void main(String[] args) {
        String duracionSegundos;

        duracionSegundos = Input.get_string("Duracion de la cancion en segundos: ");
        if(validarDuracion(duracionSegundos) == true){
            duracionCancion(duracionSegundos);
        }
        else{
            System.out.println("Inorrecto, favor de ingresar un valor numerico mayor que cero o que no contenga letras.");
        }

    }

    public static boolean validarDuracion(String duracionSegundos){

        for (int i = 0; i < duracionSegundos.length() ; i++) {
            if(duracionSegundos.charAt(i) >= '0' && duracionSegundos.charAt(i) <= '9')
                continue;

            else{
                return false;
            }
        }
        return true;
    }

    public static void duracionCancion(String duracionSegundos){
        int duracionSeg = Integer.parseInt(duracionSegundos);
        int horas=0, minutos=0, segundos=0;

        minutos = duracionSeg/60;
        segundos = duracionSeg%60;

       if(minutos>59){
           horas = minutos/60;
           minutos = minutos%60;
       }

        System.out.println("La cancion dura " + horas + " hora(s), " + minutos + " minuto(s) y " + segundos + " segundo(s).");

    }
}
