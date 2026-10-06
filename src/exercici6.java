import java.util.Scanner;
public class exercici6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Quants litres per metre quadrat han plogut");
        double pluja = sc.nextDouble();

        boolean comportes = false;

        if ( pluja > 90){
            comportes = true;
            System.out.println("Obrir comportes:" + comportes);
        }
        else System.out.println("No obrir comportes");
    }
}

