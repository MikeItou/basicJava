package jStrings.TareaStrings;

import libs.Input;

public class CifradoCesar {
    public static void main(String[] args) {
        String mensaje = "La Zandunga pierde la razon";
        int baseCifradoCesar = 12;
        // = Input.get_string("Ingresar mensaje:");

        System.out.println("Tu mensaje es: " + mensaje);
        System.out.println("\nEl cifrado cesar (a " + baseCifradoCesar + " pocisiones) es igual a:");

        cifradoCesar(mensaje, baseCifradoCesar);

        /*
        mensaje = "Pepe Pecas pica papas con un pico";
        System.out.println("Mensaje: " + mensaje);
        System.out.print("Cifrado: " )
         */


    }

    private static void cifradoCesar(String mensaje, int baseCifradoCesar) {

        for (int i = 0; i < mensaje.length(); i++) {

            if(!Character.isAlphabetic(mensaje.charAt(i))){
                System.out.print(mensaje.charAt(i));
            }

            else{
                int cifradoCesar = (int) mensaje.charAt(i) + baseCifradoCesar;

                if(Character.isLowerCase(mensaje.charAt(i)) && cifradoCesar > 122
                || Character.isUpperCase(mensaje.charAt(i)) && cifradoCesar > 90)
                    cifradoCesar -= 26;

                char conversionCesar  = (char) cifradoCesar;
                System.out.print(conversionCesar);
            }
        }
    }

}
