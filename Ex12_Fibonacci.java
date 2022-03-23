package RevisaoExercicios;

import java.util.Scanner;

public class Ex12_Fibonacci {
    public static void main(String[] args) {        
        Scanner input = new Scanner(System.in);        
        int n1 = 1; int n2 = 0; 
		
            System.out.println(n2);
            System.out.println(n1);
		            
		for (int i = 0; i < 8; i++) {
                    n1 = n1 + n2;
                    n2 = n1 - n2;
                    System.out.println(n1);    
       }
                                
    }
    
}
