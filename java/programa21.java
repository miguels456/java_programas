import java.util.Scanner;

public class programa21 
{
 public static void main(String args[])
 {
 int edad,suma;
 float prom;
 suma=0;
 int cont=-1;
 Scanner leer=new Scanner(System.in);
 
 System.out.println("ingresa un numero");
 do
 {
 edad= leer.nextInt();
 cont ++;
 suma=suma+edad;
 System.out.println("ingresa otro numero");

 }
 while(edad>0);
 {
 prom= suma/cont;
 System.out.println("se leyeron: "+cont+" edades");
 System.out.println("el promedio es:"+prom);
 }
 }
 }
 