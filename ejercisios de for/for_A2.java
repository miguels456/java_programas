import java.util.Scanner;

public class for_A2
{
public static void main (String args[])
{
 Scanner leer= new Scanner(System.in);
 int edad,suma=0;
 float prom;
 int i=1;
 
 for(i=1;i<=10;i++)
 {
 System.out.println("Edad numero "+i+" :");
 edad= leer.nextInt();
 suma=suma+edad;
 }
 prom=suma/10f;
  System.out.println("El promedio de las edades es :"+prom);
  }
  }
  

 