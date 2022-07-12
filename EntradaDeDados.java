package entradadedados;

import java.util.Scanner;

public class EntradaDeDados {
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
    
        System.out.println("Digite o nome:");
    String nome = teclado.nextLine();
    
        System.out.println("Digite a nota:");
    float nota = teclado.nextFloat();
    
        System.out.printf("The note of %s is %.1f \n", nome, nota); 
        
    }
    
}
