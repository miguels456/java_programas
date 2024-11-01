import java.util.Scanner;

public class programa12
{
  public static void main(String args[])
  {
  int num1;
  Scanner leer= new Scanner(System.in);
  
  System.out.println("ingresa un numero del 1 al 9999");
  num1=leer.nextInt();
  if(num1=>0 && num1<= 9)
  {
  System.out.println("Tu numero tiene una cifra");
  } else if(num1=>10 && num1=<99)
  {
    System.out.println("Tu numero tiene dos cifra");
    } else if(num1=>100 && num1=<999)
    {
      System.out.println("Tu numero tiene tres cifra");
      } else if(num1=>1000 && num1=<9999)
      {
        System.out.println("Tu numero tiene tres cifra");
        } else
        
        }
        }

      

