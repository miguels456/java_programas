
import java.util.Scanner;

public class programa24
{
 public static void main(String args[])
 {
 int edad;
 char genero;
 int gm=0, gh=0, ghm;
 Scanner leer= new Scanner(System.in);
 System.out.println("ingresa tu edad: ");
 edad= leer.nextInt();
 while(edad!=0)
 {
    if(edad<0)
    {
    System.out.println("Error las edades deben de ser positivas");
    }

     else
        {
         genero=leer.next().charAt(0);
            if(genero =='h')
              {
               gh ++;
               } 
            else
               {
                gm ++;
                }
        }
 }
 
 }
 }

 
