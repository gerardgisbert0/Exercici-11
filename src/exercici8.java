import java.util.Scanner;
public class exercici8 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantes persones sou?");
        int persones = sc.nextInt();
        System.out.println("Quants dies us quedeu?");
        int dies = sc.nextInt();
        System.out.println("L'ultim dia marxeu despres de les 12h? true / false");
        boolean tard = sc.nextBoolean();
        double preu = persones * dies * 20;

        if (tard) {
            preu = preu + 15;
        } else {
        }

        System.out.println("El preu total de l'estada es: " + preu + "€");
    }
}

