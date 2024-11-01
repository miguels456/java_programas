import java.util.Scanner;

public class programa19
{
 public static void main(String args[])
 {
 int dinero,menu;
 float tot1,tot2,tot3,tot4,aum1,aum2,aum3,aum4,preF1,preF2,preF3,preF4;
 Scanner leer= new Scanner(System.in);
 System.out.println("ingresa la cantidad de dinero que tienes: ");
 dinero=leer.nextInt();
 System.out.println("Menu");
 System.out.println("1- Light              $20 ");
 System.out.println("2- Media orden        $26 ");
 System.out.println("3- Orden completa     $32");
 System.out.println("4- Orden Extra grande $45");
 System.out.println("¿Que deseas ordenar?");
 menu=leer.nextInt();
 switch(menu)
 {
 case 1:
 tot1=dinero-20f;
 aum1=tot1*.07f;
 preF1=tot1-aum1;
 System.out.println("Has ordenado un desayuno (Light) el costo es de 20$");
 System.out.println("tines: "+dinero+"$ -20$ de tu desayuno te sobra: "+tot1);
 System.out.println("Debido a la atencion debes de pagar el 5% por el servicio y 2% de propina");
 System.out.println("eso quiere deecir que en realidad te sobra: "+preF1);
 break;
 
 case 2:
 
 tot2=dinero-26f;
 aum2=tot2*.07f;
 preF2=tot2-aum2;
 System.out.println("Has ordenado un desayuno de (Media orden) el costo es de 26$");
 System.out.println("tines: "+dinero+"$ -26$ de tu desayuno te sobra: "+tot2);
 System.out.println("Debido a la atencion debes de pagar el 5% por el servicio y 2% de propina");
 System.out.println("eso quiere deecir que en realidad te sobra: "+preF2);
 break;
 
 case 3:
 tot3=dinero-32f;
 aum3=tot3*.07f;
 preF3=tot3-aum3;
 System.out.println("Has ordenado un desayuno de (orden completa) el costo es de 32$");
 System.out.println("tines: "+dinero+"$ -32$ de tu desayuno te sobra: "+tot3);
 System.out.println("Debido a la atencion debes de pagar el 5% por el servicio y 2% de propina");
 System.out.println("eso quiere deecir que en realidad te sobra: "+preF3);
 break;
 
 case 4:
 tot4=dinero-45f;
 aum4=tot4*.07f;
 preF4=tot4-aum4;
 System.out.println("Has ordenado un desayuno de (orden extra grande) el costo es de 45$");
 System.out.println("tines: "+dinero+"$ -45$ de tu desayuno te sobra: "+tot4);
 System.out.println("Debido a la atencion debes de pagar el 5% por el servicio y 2% de propina");
 System.out.println("eso quiere deecir que en realidad te sobra: "+preF4);
 break;
 default:
 System.out.println("Error ese tipo de desayuno no se encuentra");
 }
 }
 }
 

 

 

 