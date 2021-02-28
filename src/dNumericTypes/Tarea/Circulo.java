package dNumericTypes.Tarea;

import libs.Input;

public class Circulo {
    public static void main(String[] args) {
        char respuesta = 'y';
        double radio, area, perimetro, pi = 3.1416;

        while (Character.toLowerCase(respuesta) == 'y'){
            radio = Input.get_double("Ingrese el radio del circulo ");

            while(radio<=0){
                System.out.println(radio + " no es un numero valido, por favor ingrese un numero positivo");
                radio = Input.get_double("Ingrese el radio del circulo ");
            }

            area = pi*(radio*radio);
            perimetro= 2*pi*radio;

            System.out.printf("El area es %.2f %n", area);
            System.out.printf("El perimetro es %.2f %n",  perimetro);
            respuesta = Input.get_char("Desea continuar (y/n)? ");
        }

    }
}
