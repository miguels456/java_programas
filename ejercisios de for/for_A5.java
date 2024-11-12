import java.util.Scanner;

public class for_A5
{
 public static void main (String args[])
 {
 Scanner leer=new Scanner(System.in);
 int numero;
 int i=1;
 int contP=0;
 int contN=0;
 int cont0=0;

 System.out.println("Ingresa 50 numero: ");

 for(i=1;i<=50;i++)
 {
 System.out.println("Numero "+i+":");
 numero=leer.nextInt();
 if(numero ==0)
  {
  cont0 ++;
  }else if (numero <0)
  {
  contN ++;
  } else
  {
  contP++;
  }
  }
   System.out.println("Cantidad de numero de positivo: "+contP);
   System.out.println("Cantidad de numero de negativos: "+contN);
   System.out.println("Cantidad de numero con ceros: "+cont0);
   }
   }

