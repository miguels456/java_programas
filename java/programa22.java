import java.util.Scanner;

public class programa22
{
 public static void main(String args[])
 {
 int opc;
 System.out.println("Igresa un numero entre 1 a 5");
 Scanner leer= new Scanner(System.in);
 do
 {
 opc=leer.nextInt();
 System.out.println("Ingresa otro numero");
 }
 while(opc< 1 && opc> 5);
}
}
