import java.util.Scanner;


public class exercici3 {


    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        System.out.println("Introdueix el valor de la compra");
        double valor = sc.nextDouble();
        System.out.println("La figura esta en bon estat? TRUE/FALSE");
        boolean estat = sc.nextBoolean();
        double preuVenda;


        if (estat){
            preuVenda = valor * 1.25;}
        else{ preuVenda = valor * 1.10;
        }
        System.out.println("El preu de la venda es:" + preuVenda + "€");
    }
}

