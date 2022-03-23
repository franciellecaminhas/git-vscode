package RevisaoExercicios;


import java.util.Scanner;


public class EX8_Tabuada {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
           
            int n;
            
             System.out.println("Digite um número: ");
             n = input.nextInt();
             
             for(int cont=1; cont<=10; cont++)
                 System.out.println(cont + "x" + n + " = " + cont*n);

        
    }
    
}
