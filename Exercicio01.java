/*
Faça um programa que receba somente nºs positivos e exibe e calcule:
o número digitado
a soma dos números digitados
a quantidade de números digitados
a média dos números digitados
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        ArrayList<Integer> listaNumerosDigitados = new ArrayList();

        System.out.println("Digite quantos numeros você quiser ! \n"
                + "Para parar digite um numero negativo ! \n"
                + "Ex.: -5 \n");
        int numero = 0;

        do {
            System.out.println("Digite um numero: ");
            numero = ler.nextInt();
            listaNumerosDigitados.add(numero);

        } while (numero >= 0);
        
        int ultimoNumero = listaNumerosDigitados.size();
        listaNumerosDigitados.remove(ultimoNumero -1);

        System.out.println("Os numeros digitados: \n"
                + listaNumerosDigitados);

        int somaNumeros = 0;
        for (int n : listaNumerosDigitados) {
            somaNumeros += n;
        }

        System.out.println("A soma dos numeros digitados: \n"
                + somaNumeros);

        System.out.println("A quantidade de numeros digitados é: \n"
                + listaNumerosDigitados.size());

        int mediaNumeros = 0;
        for (int n : listaNumerosDigitados) {
            mediaNumeros = somaNumeros / listaNumerosDigitados.size();
        }

        System.out.println("A média dos numeros digitados é: \n"
                + mediaNumeros);

    }

}
