import java.util.Scanner;

public class programa16 {
    public static void main(String[] args) {
        String mtp;
        int catL, tipo;
        float preT1, preT2, porc2, aum2, preT3, porc3, des3;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingresa la cantidad de libros:");
        catL = leer.nextInt();
        
        leer.nextLine();

        System.out.println("Ingresa el metodo de pago (tarjeta o efectivo):");
        mtp = leer.nextLine();

        System.out.println("Ingresa el tipo de libro (1, 2, 3):");
        tipo = leer.nextInt();
        
        if (tipo == 1) {
            preT1 = catL * 200f;
            System.out.println("Tu precio total a pagar es de: " + preT1);
        } else if (tipo == 2) {
            
            if (mtp.equals("tarjeta")) {
                preT2 = catL * 450f;
                porc2 = preT2 * 0.185f; 
                aum2 = preT2 + porc2;
                System.out.println("Debido a que pagaste con tarjeta se aplicó un aumento del 18.5%.");
                System.out.println("Tu precio total a pagar es de: " + aum2);
            } else {
                preT2 = catL * 450f;
                System.out.println("Tu precio total a pagar es de: " + preT2);
            }
        } else if (tipo == 3)
        {
            if (mtp.equals("efectivo"))
            {
                preT3 = catL * 200f;
                porc3 = preT3 * 0.40f; 
                des3 = preT3 - porc3;
                System.out.println("Debido a que pagaste en efectivo se aplicó un descuento del 40%.");
                System.out.println("Tu precio total a pagar es de: " + des3);
            } else
            {
                preT3 = catL * 200f;
                System.out.println("Tu precio total a pagar es de: " + preT3);
            }
        } else
        {
            System.out.println("Error: tipo de libro no válido.");
        }
    }
}