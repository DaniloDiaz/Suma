import java.util.Scanner;


public class Nuempar {
    public static void main(String[] args)  {
    {
           int dato=0, sum=0;
            Scanner leer=new Scanner(System.in);
                    System.out.println("\ningresar un numero");
                    dato=leer.nextInt();
            
            if((dato>=2)&&(dato%2==0)){
                    for(int i=2;i<=dato;i++){ 
               sum= sum+i;}
               System.out.println("\n La suma es: "+sum); 
            }else{
                    System.out.println("ERROR");               
      }
     }
   }
}
