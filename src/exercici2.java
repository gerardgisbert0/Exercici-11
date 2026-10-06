import java.util.Scanner;

public class exercici2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix el preu de la compra");
        double preu = sc.nextDouble();
        System.out.println("Ets client VIP? TRUE/FALSE");
        boolean VIP = sc.nextBoolean();
        double descompte;


        if ( VIP || preu > 200 ){
            descompte = (preu * 0.20);
        }
        else {
            descompte = 0;
        }
        double preuFinal = preu - descompte;
        System.out.println("El preu final es :" + preuFinal);
    }

}
