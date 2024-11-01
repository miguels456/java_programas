import java.util.Scanner;

public class programa11
{
  public static void main(String args[])
  {
  int num1,num2;
  Scanner leer=new Scanner(System.in);
  
  System.out.println("Escribe 2 numeros");
  num1=leer.nextInt();
  num2=leer.nextInt();
  
  if(num1==num2)
  {
  System.out.println("El numero es igual");
  } else
  {
  System.out.println("No es igual");
  }
  }
  }
  