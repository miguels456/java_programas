import java.util.Scanner;

public class programa23
{
 public static void main(String args[])
 {
 Scanner leer = new Scanner(System.in);
 int nipValido=4562;
 int nipUsuario;
 int cont=-1;
 do
 {
 System.out.println("Introduce un nip de 4 digitos");
 nipUsuario=leer.nextInt();
 cont ++;
 if(nipUsuario != nipValido)
    System.out.println("Error, intentalo de nuevo/n");
    }
      
    while(nipUsuario != nipValido);
     System.out.println("Acceso correcto, clave valida");
          }   
}

    
    

