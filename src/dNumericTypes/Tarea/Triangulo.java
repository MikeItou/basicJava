package dNumericTypes.Tarea;

import libs.Input;

import javax.swing.*;

public class Triangulo {
    public static void main(String[] args) {
        int altura;
        String simbolo = "#";
        char respuesta;

        do{

            altura = Input.get_int("Ingrese la altura del triangulo: ");

            while(altura<=0){
                System.out.println("Favor de ingresar un numero mayor que cero.");
                altura = Input.get_int("Ingrese la altura del triangulo: ");
            }
            //justificacion a la izquiera
            System.out.print("Triangulo justificado a la izquierda:");
            for (int i = 0;i <= altura; i++){
                for (int j = 0;j < i; j++){
                    System.out.print(simbolo);
                }
                System.out.println();
            }
            //justificacion a la derecha
            System.out.print("Triangulo justificado a la derecha:");
            for (int i = 0;i <= altura; i++){
                espacios(altura - i);
                for (int j = 0;j < i; j++){
                    if(j==0)
                        System.out.print(simbolo);
                    System.out.print(simbolo);
                }
                System.out.println();
            }

            respuesta = Input.get_char("Desea continuar (y/n)? ");
        }while(Character.toLowerCase(respuesta) == 'y');

    }

    //metodo para colocar espacios
    public static void espacios(int alt){
        for (int i = 0; i < alt; i++)
            System.out.print(" ");
    }
}
