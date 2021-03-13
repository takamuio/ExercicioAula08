/*
Mariazinha tem 1,50m e cresce 2 centímetros por ano.
Enquanto Maricota tem 1,10m e cresce 3 centímetros por ano.
Construir um programa que calcule e imprima quantos anos serão necessários para que
Maricota seja maior que Mariazinha.
 */
public class Exercicio03 {

    public static void main(String[] args) {
        
        int tamanhoMariazinha = 150;
        int tamanhoMaricota = 110;
        int anos = 0;

        System.out.println("Mariazinha tem 1,50m e cresce 2 centímetros por ano.");
        System.out.println("Maricota tem 1,10m e cresce 3 centímetros por ano.");
        System.out.println("Quantos anos serão necessários para que\n"
                + "Maricota seja maior que Mariazinha");

        while (tamanhoMariazinha >= tamanhoMaricota) {

            tamanhoMariazinha = tamanhoMariazinha + 2;

            tamanhoMaricota = tamanhoMaricota + 3;

            anos = anos + 1;
        }
        
        System.out.println("Será necessário " + anos + " anos \n"
                + "Para Maricota ficar maior que mariazinha");

    }

}
