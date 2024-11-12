import java.util.Scanner;

public class for_A4
{
public static void main(String args[])
{
 Scanner leer= new Scanner(System.in);
 int suma=0;
 int edad,n;
 float prom;
 int i=1;
 System.out.println("cuantas edades quieres leer: ");
 n=leer.nextInt();
 for(i=1;i<=n;i++)
 {
  System.out.println("Edad "+i+":");
  edad=leer.nextInt();
  suma=suma+edad;
  }
  prom=suma/n;
    System.out.println("El promedio de las edades es: "+prom);
    }
   
    }


 