import java.util.Scanner;

public class programa1
{
 public static void main(String args[])
 {
 int num1;
 Scanner leer=new Scanner(System.in);
 System.out.println("ingresa tu edad");
 num1=leer.nextInt();
 if(num1==18)
 {
 System.out.println("Eres mayor de edad");
 }
 }
 }