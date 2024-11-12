import java.util.Scanner;

public class for_A3
{
 public static void main (String args[])
 {
  Scanner leer= new Scanner(System.in);
  int numero;
  int sumInp=0;
  int sumPar=0;
  float prom;
  int i=1;
  
  for(i=1;i<=12;i++)
  {
  System.out.println("Numero "+i+":");
  numero=leer.nextInt();
  
  if(numero/2==0)
  {
  sumPar=sumPar+numero;
  } else
    {
    sumInp=sumInp+numero;
    }
    
    }
    prom=sumInp/12f;
    System.out.println("La suma de los pares es :"+sumInp);
    System.out.println("El promedio de los impares :"+prom);
    }
    }

 