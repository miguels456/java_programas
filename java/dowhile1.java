import java.util.Scanner;

public class dowhile1
{
 public static void main(String args[])
 {
 int num1;
 Scanner leer= new Scanner(System.in);
 
 System.out.println("ingresa un numero");
 do
 {
 
 num1=leer.nextInt();
 System.out.println("ingresa otro numero");
 }
 while(num1>0);
 System.out.println("fin del programa");
 
 }
 }