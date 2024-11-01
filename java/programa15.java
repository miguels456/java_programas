import java.util.Scanner;

public class programa15
{
 public static void main(String args[])
 {
 int num1,num2,num3,numeros;
 Scanner leer= new Scanner(System.in);
 
 System.out.println("ingresa 3 numeros");
 num1=leer.nextInt();
 num2=leer.nextInt();
 num3=leer.nextInt();
 
 if(num1>num2 && num1>num3)
 {
 System.out.println(num1);
 } else
 if(num2>num1 && num2>num3)
 {
  System.out.println(num2);
  } else
  if(num3>num1 && num3>num2)
  {
   System.out.println(num3);
   }
   }
   }

