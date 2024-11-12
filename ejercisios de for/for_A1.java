import java.util.Scanner;

public class for_A1
{
 public static void main(String args[])
 {
 Scanner leer= new Scanner (System.in);
 int numero,suma=0;
 float prom;
 int i=1;
 for(i=1; i<=10; i++)
  {
 
 System.out.println("Numero "+ i +":");
 numero= leer.nextInt();
 suma=suma+numero;
 }
 prom=suma/10f;
 System.out.println("El promedio de los dies numeros es :"+prom);
 
 }
 } 