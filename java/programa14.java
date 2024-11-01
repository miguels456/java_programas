import java.util.Scanner;

public class programa14
{
  public static void main(String args[])
  {
  float prec,desc1,desc2,desc3,preT,descF1,descF2,descF3;
  int catL;
  Scanner leer= new Scanner(System.in);
  
  System.out.println("Cuanto te costo cada libro");
  prec=leer.nextFloat();
  System.out.println("Ingresa la cantitad de libro a comprar");
  catL=leer.nextInt();
  preT= catL*prec;
  if(catL>=12 && catL<=23)
  {
  System.out.println("compraste: "+catL+" libros tu descuento sera del 10%");
  desc1= preT*.10f;
  descF1=preT-desc1;
  System.out.println("precio total: "+preT);
  System.out.println("tu precio total con el descuento: "+descF1);
  } else 
  if(catL==24)
  {
    System.out.println("compraste: "+catL+"libros tu descuento sera del 20%");
    desc2= preT*.20f;
    descF2=preT-desc2;
    System.out.println("precio total: "+preT);
    System.out.println("tu precio total con el descuento: "+descF2);
    } else if(catL>24)
    {
     System.out.println("compraste: "+catL+"libros tu descuento sera del 30%");
     desc3= preT*.30f;
     descF3=preT-desc3;
     System.out.println("precio total: "+preT);
     System.out.println("tu precio total con el descuento: "+descF3);
    } else
     {
      System.out.println("compraste: "+catL+" libros tu precio total: "+preT);
     }
     }
     }
