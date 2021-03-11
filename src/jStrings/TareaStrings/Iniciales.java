package jStrings.TareaStrings;

import libs.Input;

public class Iniciales {
    public static void main(String[] args) {

        int totalPalabras;
        String mensaje = "Pepe pecas Pica Papas con un Pico";
        //mensaje = Input.get_string("Escriba su mensaje: ");
        String[] palabraIndividual;

        System.out.println("\nSu mensaje es: " + mensaje);
        palabraIndividual = mensaje.split(" ");
        totalPalabras = palabraIndividual.length;
        System.out.println("\nLa frase anterior cuenta con " + totalPalabras + " palabras y las estas son:");

        for (int i = 0; i < totalPalabras; i++) {
            System.out.println(palabraIndividual[i]);
        }

        System.out.println("\nLa primera letra en mayuscula de cada palabra es:");

        for (int i = 0; i < totalPalabras; i++) {
            String palabraUnica = palabraIndividual[i];
            char primeraLetra = palabraUnica.charAt(0);
            System.out.print(mayuscula(primeraLetra));
        }

    }

    public static char mayuscula(char c) {
        if(Character.isAlphabetic(c) && c >= 'a' && c <= 'z') {
            int valorNum = (int) c;
            int valorMayuscula = valorNum - 32;
            char mayuscula = (char) valorMayuscula;
            return mayuscula;
        } else return c;
    }
}
