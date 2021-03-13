/*
Faça um programa onde o usuário digita vários números e, quando digitar 0,
o programa pára e soma os valores digitados.
 */

import java.util.ArrayList;
import java.util.Scanner;
public class Exercicio02 {
   
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

        } while (numero != 0);
        
         int ultimoNumero = listaNumerosDigitados.size();
        listaNumerosDigitados.remove(ultimoNumero -1);
        
        int somaNumeros = 0;
        for (int n : listaNumerosDigitados) {
            somaNumeros += n;
        }

        System.out.println("A soma dos numeros digitados: \n"
                + somaNumeros);
    }
    
}
