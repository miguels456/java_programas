import java.util.Scanner;

public class programa25
{
 public static void main(String args[])
 {
 int edad;
 int gh=0, gm=0, gn1_12=0,gh_65=0,gma12_20=0;
 char genero;
 float peso,prom1_12,prom_65, sumaPesoh1_12=0.0f;
 
 Scanner leer= new Scanner(System.in);
 
 do{ //principla
  System.out.println("Ingresa una edad:");
 edad= leer.nextInt();
 if(edad<0)
 {
 System.out.println("Erro no existen edades negativas");
 } else if(edad>0)
   {
    System.out.println("Ingresa tu genero h = hombre y m = mujer");
    genero= leer.next().charAt(0);
     if(genero=='h')
     {
      gh ++;
      if(edad>=1 && edad<=12)
      {
        System.out.println("ingresa tu peso: ");
      peso=leer.nextFloat();
      sumaPesoh1_12= sumaPesoh1_12 + peso;
      gn1_12 ++;
      if (edad>=65)
      {
      sumaEdad_65=
      gh_65 ++;
      }
      } else
            {
            gm ++;
              }
 
 
 }// cierre del else
 }while(edad!=0);
 prom1_12= sumaPesoh1_12/gn1_12;
 prom_65=
   System.out.println("Se vacunaron: "+(gh+gm));
  System.out.println("Se vacunaron: " +gm+ " Mujeres");

    System.out.println("En total se vacunaron : " +gn1_12+ " niños y su promedi de vacunacion es: "+prom);
  System.out.println("Se vacunaron: " +gm+ " Mujeres");
 System.out.println("Se vacunaron: " +gh+ " Hombres");
 

 
 
 }
 }