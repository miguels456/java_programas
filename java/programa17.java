import java.util.Scanner;

public class programa17 
{
  public static void main(String args[])
    {
       
        float cal1,cal2,cal3,cal4,cal5,promF;
       Scanner leer= new Scanner(System.in);
        
     System.out.println("ingresa tus 5 calificasiones: ");
        cal1=leer.nextFloat();
        cal2=leer.nextFloat(); 
        cal3=leer.nextFloat(); 
        cal4=leer.nextFloat(); 
        cal5=leer.nextFloat(); 
        promF= (cal1+cal2+cal3+cal4+cal5)/5f;
        
        if(promF>=0 && promF<=69)
        {
         System.out.println("Repetir curso");
        } else if(promF>=70 && promF<=79)
        {
          System.out.println("Suficiente");
        } else if(promF>=80 && promF<=89)
        {
          System.out.println("Bien");
        } else if(promF>=90 && promF<=99)
        {
            System.out.println("Muy bien");
        } else if(promF==100)
        {
            System.out.println("Excelente");
        }
    }   
}