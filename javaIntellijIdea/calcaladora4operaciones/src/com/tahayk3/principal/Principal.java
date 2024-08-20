package com.tahayk3.principal;

import com.tahayk3.calculator.Calculadora;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        System.out.println("CALCULADORA");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el primer numero");
        float num1 = scanner.nextInt();

        System.out.println("Ingrese el segundo numero");
        float num2 = scanner.nextInt();

        System.out.println("Ingresa el tipo de operacion");
        System.out.println("1 suma, 2 resta, 3 multiplicacion, 4 division");
        int operacion = scanner.nextInt();

        Calculadora calculadora = new Calculadora();

        float resultado = 0;

        switch (operacion){
            case 1:
               resultado = calculadora.operacionSuma(num1,num2);
                break;
            case 2:
                resultado = calculadora.operacionResta(num1,num2);
                break;
            case 3:
                resultado = calculadora.operacionMul(num1,num2);
                break;
            case 4:
                resultado = calculadora.operacionDiv(num1,num2);
                break;
            default:
                System.out.println("No se detector una operacion valida");
        }

        System.out.println("El resultado de la operacion entre " + num1 +operacion+ num2+ " es:" + resultado );
    }
}
