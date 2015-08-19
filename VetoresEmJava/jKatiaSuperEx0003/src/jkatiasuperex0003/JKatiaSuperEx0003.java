package jkatiasuperex0003;

import java.util.Scanner;

public class JKatiaSuperEx0003 {
    public static void main(String[] args) {
                
        int Mensal[]    = new int[20];
        int BiMestral[] = new int[20];
        Scanner leia = new Scanner(System.in);
        
        for(int cont=0; cont<20;cont++){
            System.out.println("Digite a nota Mensal " + (cont+1) + ": ");
            Mensal[cont] = leia.nextInt();
            System.out.println("Digite a nota Bimestral " +  (cont+1)  + ": ");
            BiMestral[cont] = leia.nextInt();
        }
        
        for(int cont=0; cont<20;cont++){
            System.out.println("A nota mensal " + (cont+1) + 
                    " é: " + Mensal[cont] + " e a Bimestral " + 
                    (cont+1) + " é: " + BiMestral[cont] +
                    " \nA média é: " + ((Mensal[cont] + BiMestral[cont])/2));
        }
    
}}
