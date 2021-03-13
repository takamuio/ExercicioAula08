/*
 Criar um programa em Java que consistem em:
- Listar números de 1 a 50;
- Exibir a lista na horizontal e vertical;
- Exibir o tamanho da lista;
- Somar os valores da lista;
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int x = 0;       

        ArrayList<Integer> listaDeNumeros = new ArrayList();

        for (int i = 1; i < 51; i++) {
            listaDeNumeros.add(i);
        }

        System.out.println(listaDeNumeros);
        if (x == 0 ) {
            for (int i = 0; i < listaDeNumeros.size(); i++) {
                System.out.println(listaDeNumeros.get(i));
            }
        }

        if (x == 0) {
            int somaNumeros = 0;
            for (int n : listaDeNumeros) {
                somaNumeros += n;
            }
            
            System.out.println("Tamanha da lista : " + listaDeNumeros.size());

            System.out.println("A soma dos numeros : " + somaNumeros);
        }

    }

}
