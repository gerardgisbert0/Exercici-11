import java.util.Scanner;

public class exercici4 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introdueix un numero de nois");
        int nois = sc.nextInt();
        System.out.println("Introdueix el numero de noies");
        int noies = sc.nextInt();


        double total = noies + nois;


        double percentatgeNoies = noies / total *100;
        double percentatgeNois = nois / total *100;


        System.out.println("Percentatge de noies" + percentatgeNoies + "%");
        System.out.println("Percentatge de nois" + percentatgeNois + "%");
    }

}
