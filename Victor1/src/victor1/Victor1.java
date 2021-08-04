/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victor1;

/**
 *
 * @author victor.marcelino
 */
public class Victor1 {
    int a = 10;
    int b = 30;
    int c = 50;
    int d = 70;
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Victor1 Val = new Victor1();
        String str1 = "Número alvo: 40 ";
        String str2 = "Realização primeiro cálculo:";
        String str3 = "Realização segundo cálculo: ";
        String str4 = "Realização terceiro cálculo: ";
        String str5 = "Realização quarto cálculo: ";
        String str6 = "Realização quinto cálculo:";
        String str7 = "Realização sexto cálculo:";
        String str8 = "Realização Sétimo cálculo";
        String str9 = "Realização oitavo cálculo";
        int[] ListNum = {10, 30, 50, 70};
        int resp = 40;
        
        System.out.println(str1);
        System.out.println(str2);
        System.out.printf("10 + 30 = %d ", (Val.a + Val.b));
         if(ListNum[0] + ListNum[1] == resp){
             System.out.println("- Resposta correta\n" );
         }
         else{
             System.out.println("- Resposta Incorreta");
             
         }
         
             
        System.out.println(str1);
        System.out.println(str3);
        System.out.printf("10 + 50 = %d ", (Val.a + Val.c));
         if(ListNum[0] + ListNum[2] == resp){
             System.out.println("- Resposta correta " );
         }
         else{
             System.out.println("- Resposta Incorreta\n");
        
         }
         

        System.out.println(str1);
        System.out.println(str4);
        System.out.printf("10 + 70 = %d ", (Val.a + Val.d));
         if(ListNum[0] + ListNum[3] == resp){
             System.out.println("- Resposta correta " );
         }
         else{
             System.out.println("- Resposta Incorreta\n");
        
         }
         
         
        System.out.println(str1);
        System.out.println(str5);
        System.out.printf("30 + 50 = %d ", (Val.b + Val.c));
         if(ListNum[1] + ListNum[2] == resp){
             System.out.println("- Resposta correta " );
         }
         else{
             System.out.println("- Resposta Incorreta\n");
        
         }
         
         
        System.out.println(str1);
        System.out.println(str6);
        System.out.printf("30 + 70 = %d ", (Val.b + Val.d));
         if(ListNum[1] + ListNum[3] == resp){
             System.out.println("- Resposta correta " );
         }
         else{
             System.out.println("- Resposta Incorreta\n");
        
         }
         
        System.out.println(str1);
        System.out.println(str7);
        System.out.printf("50 + 70 = %d ", (Val.c + Val.d));
         if(ListNum[2] + ListNum[3] == resp){
             System.out.println("- Resposta correta " );
         }
         else{
             System.out.println("- Resposta Incorreta\n");
        
         }
    }
}



    

