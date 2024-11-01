import java.util.Scanner;

public class While02
{
 public static void main(String args[])
 {
  int num, cont;
  Scanner leer=new Scanner(System.in);
  num=leer.nextInt();
 
  while (num!=0);
  {
  System.out.println("ingresa otro numero");
  num=leer.nextInt();
  cont++;

}
}
}