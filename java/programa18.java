import java.util.Scanner;

public class programa18
{
 public static void main(String args[])
 {
 int num1,num2,num3;
 Scanner leer= new Scanner(System.in);
 System.out.println("ingresa las 3 caras de tu dados");
 num1=leer.nextInt();
 num2=leer.nextInt();
 num3=leer.nextInt();
 if(num1==6 && num2==6 && num3==6)
 {
 System.out.println("Excelente");
 } else if(num1==6 && num2==6)
 {
 System.out.println("Muy bien");
 } else if(num2==6 && num3==6)
 {
 System.out.println("Muy bien");
 } else if(num1==6 && num3==6)
 {
 System.out.println("Muy bien");
 } else if(num1==6)
 {
 System.out.println("Regular");
 } else if(num2==6)
 {
 System.out.println("Regular");
 } else if(num3==6)
 {
 System.out.println("Regular");
 } else
 {
 System.out.println("Muy mal");
}
}
}

