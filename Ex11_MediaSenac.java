package RevisaoExercicios;
/* @author franc
 */
import java.util.Scanner;

public class Ex11_MediaSenac {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        float m1, m2, media;
        
        System.out.println("Nota Modúlo I: ");
        m1 = input.nextFloat();
        
        System.out.println("Nota Modúlo II: ");
        m2 = input.nextFloat();
                  
        media = (m1 + m2) / 2;
        System.out.println("\nMédia = " + media);
       
            if(media >=70){
                System.out.println("Aluno Aprovado!");
            }else if((media >= 40) && (media < 70)){
                System.out.println("Aluno em Recuperação!");
            }else if(media < 40)
                    System.out.println("Aluno Reprovado!");
    }
    
}
