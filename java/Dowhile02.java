import java.util.Scanner;

public class Dowhile02
{
 public static void main(String args[])
 {
 int num, cont=-1;
 Scanner leer= new Scanner(System.in);
 
 System.out.println("ingresa un numero");
 cont=-1;
 do
 {

 num=leer.nextInt();
  System.out.println("ingresa otro numer");
 cont++;
 }
 while(num!=0);
 System.out.println("se leyeron: "+cont);
 }
 }
 