import java.util.Scanner;

public class programa13
{
 public static void main(String args[])
 {
 int num1,num2;
 Scanner leer= new Scanner(System.in);
 
 System.out.println("ingresa 2 numeros");
 num1=leer.nextInt();
 num2=leer.nextInt();
 
 if(num1>num2)
 {
 System.out.println("tu primer numero es mayor"+num1);
 }
 else
 {
 System.out.println("tu primer numero es menor"+num1);
 } if(num2>num1)
 {
 System.out.println("tu segundo numero es mayor"+num2);
 }
 else
 {
 System.out.println("tu segundo numero es menor"+num2);
 }
 }
 }
