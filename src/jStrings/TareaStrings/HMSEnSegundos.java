package jStrings.TareaStrings;

import libs.Input;

public class HMSEnSegundos {
    public static void main(String[] args) {

        //primero pedirle al usuario la duracion del video.
        //String duracion= pedirDuracionVideo();
        //chechar si lo que ingreso el usuario esta correcto.
        /*boolean isValid = validarFormato(duracion);
        if(isValid) {
            System.out.println(calcularSegundos(duracion));
        } else {
            System.out.println("Error en la duracion del video.");
        }
        //calcular el numero de segundos
        //imprimirlo*/

        String duracionVideo;

        duracionVideo = Input.get_string("Ingrese la duracion del video (hh:mm:ss): ");

        if (validarSintaxis(duracionVideo) == true){
            conversionSegundos(duracionVideo);
        }
        else
            System.out.println("Inorrecto, favor de ingresar un valor correcto con base en el formato hh:mm:ss (23:59:59).");

    }

   /* private static int calcularSegundos(String duracion) {
        return Integer.parseInt(duracion.split(":")[0]) * 3600 +
                Integer.parseInt(duracion.split(":")[1]) * 60 +
                        Integer.parseInt(duracion.split(":")[2]);
    }*/

    /*private static boolean validarFormato(String duracion) {
        //partir el string utilizando el caracter de do puntos
        String[] partes = duracion.split(":");
        if(partes.length != 3) {
            return false;
        }
        //checar si cada uno de los elementos del arreglo tiene un numero.
        for (int i = 0; i < 3 ; i++) {
            String partex = partes[i];
            try {
                int parteNumerica = Integer.parseInt(partex);
                if(i > 0 && parteNumerica < 0 && parteNumerica > 59)
                    return false;
                if( i == 0 && parteNumerica < 0 && parteNumerica > 23)
                    return false;
            }catch(Exception x) {

                return false;
            }


        }
        return true;
    }*/

   /* private static String pedirDuracionVideo() {
        return Input.get_string("Ingresa la duracion del video (hh:mm:ss)");
    }*/

    public static boolean validarSintaxis(String duracionVideo){
        String[] validarHMS;
        if(duracionVideo.length()!= 8)
            return false;

        else {
            for (int i = 0; i < duracionVideo.length(); i++) {
                if(duracionVideo.charAt(i) == ':' && (i == 2 || i == 5))
                    continue;
                else{
                    if(duracionVideo.charAt(i)>='0' && duracionVideo.charAt(i)<='9')
                        continue;
                    else
                        return false;
                }
            }
        }

        validarHMS = duracionVideo.split(":");
        if( Integer.parseInt(validarHMS[0])>23 || Integer.parseInt(validarHMS[1])>59 || Integer.parseInt(validarHMS[2])>59)
            return false;

        return true;
    }

    public static void conversionSegundos(String duracionVideo){
        String[] duracionSeg = duracionVideo.split(":");
        int sumatoria, horas, minutos, segundos;

        horas = Integer.parseInt(duracionSeg[0]) * 3600;
        minutos = Integer.parseInt(duracionSeg[1]) * 60;
        segundos = Integer.parseInt(duracionSeg[2]);
        sumatoria = horas + minutos + segundos;

        System.out.println("El video dura " + sumatoria + " segundos.");
    }
}
