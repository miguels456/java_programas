import java.util.Scanner;

public class programa20
{
 public static void main(String args[])
 {
 int cat;
 float sueldo,suelF1,suelF2,suelF3,suelF4,aum1,aum2,aum3,aum4;
 Scanner leer=new Scanner(System.in);
 System.out.println("Ingrsa tu sueldo");
 sueldo= leer.nextInt();
 System.out.println("Aumentos");
 System.out.println("1- Ingenieros      15%");
 System.out.println("2- Licenciados     12%");
 System.out.println("3- Arquitectos      8%");
 System.out.println("4- Recursos humanos 7%");
 System.out.println("elige cual es tu aumento");
 cat=leer.nextInt();
 
 switch(cat)
 {
 case 1:
 aum1=sueldo*.15f;
 suelF1=sueldo+aum1;
 System.out.println("Tu sueldo es de: "+sueldo+"$ tubo un aumento del 15%");
 System.out.println("Tu sueldo final ya con el 15% de aumento es es de :$"+suelF1);
 break;
 case 2:
 aum2=sueldo*.12f;
 suelF2=sueldo+aum2;
 System.out.println("Tu sueldo es de: "+sueldo+"$ tubo un aumento del 12%");
 System.out.println("Tu sueldo final ya con el 12% de aumento es es de :$"+suelF2);
 break;
 case 3:
 aum3=sueldo*.08f;
 suelF3=sueldo+aum3;
 System.out.println("Tu sueldo es de: "+sueldo+"$ tubo un aumento del 8%");
 System.out.println("Tu sueldo final ya con el 8% de aumento es es de :$"+suelF3);
 break;
 case 4:
 aum4=sueldo*.07f;
 suelF4=sueldo+aum4;
 System.out.println("Tu sueldo es de: "+sueldo+"$ tubo un aumento del 7%");
 System.out.println("Tu sueldo final ya con el 7% de aumento es es de :$"+suelF4);
 break;
 default:
 System.out.println("Error el aumento no existe o es incorrecto");
 }
 }
 }
 


