package jkatiasuperex0001;
import java.util.Scanner;

public class JKatiaSuperEx0001 {

    public static void main(String[] args) {
        int NumRecebidos[] = new int[20]; // vetor com 20 posições
        int SomaPositivos = 0;
        int QtdNegativos = 0;
        Scanner leia = new Scanner(System.in);
        
        for(int cont=0; cont<20;cont++){
            System.out.println("Digite a posição " + cont + ": ");
            NumRecebidos[cont] = leia.nextInt();
        }
        
        for(int cont=0; cont<20; cont++)
        {
            System.out.println("O valor da posição " + cont + " é: " + NumRecebidos[cont]);
            if (NumRecebidos[cont] > 0) SomaPositivos = SomaPositivos + NumRecebidos[cont];
            if (NumRecebidos[cont] < 0) QtdNegativos++;
        }
        
        System.out.println("A soma de todos os positivos é: " + SomaPositivos); 
        System.out.println("A quantidade dos negativos é: " + QtdNegativos); 
    }    
}
