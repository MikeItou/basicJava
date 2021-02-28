package dNumericTypes.Tarea;

import libs.Input;

public class ConversionDecimalOctalHexadecimal {
    public static void main(String[] args) {
        int decimal;
        char respuesta;

        do{
            decimal = Input.get_int("Favor de ingresar un numero decimal: ");
            System.out.println(decimal + " su equivalencia en Hexadecimal es "+ Integer.toHexString(decimal));
            System.out.println(decimal + " su equivalencia en Octal es "+ Integer.toOctalString(decimal));

            respuesta = Input.get_char("Desea continuar (y/n)? ");
        }while(Character.toLowerCase(respuesta) == 'y');
    }
}
