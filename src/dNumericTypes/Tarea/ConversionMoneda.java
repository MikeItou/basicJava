package dNumericTypes.Tarea;

import libs.Input;

public class ConversionMoneda {
    public static void main(String[] args) {
        char respuesta;
        double cantidad, cambio, conversion;

        do{
            cantidad = Input.get_double("Ingrese cantidad (Dolares): ");
            while(cantidad < 0){
                System.out.println("Error. La cantidad a convertir debe ser positiva.");
                cantidad = Input.get_double("Ingrese cantidad (Dolares): ");
            }

            cambio = Input.get_double("Ingrese el tipo de cambio: ");
            while (cambio <= 0){
                System.out.println("Error. El cambio para realizar el ajuste debe ser positivo y mayor a cero.");
                cambio = Input.get_double("Ingrese el tipo de cambio: ");
            }

            conversion = cantidad * cambio;
            System.out.println(cantidad + " USD son " + conversion + " en tu moneda.");

            respuesta = Input.get_char("Desea continuar (y/n)? ");
        }while(Character.toLowerCase(respuesta) == 'y');
    }
}
