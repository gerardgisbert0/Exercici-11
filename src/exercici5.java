import java.util.Scanner;

public class exercici5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double preu = 73.490;
        System.out.println("Quants quilometres te la Volswaguen?");
        double km = sc.nextDouble();
        double perdua = preu * (0.000001 * km);
        double valorMercat = preu - perdua;


        System.out.println("El valor del mercat es" + valorMercat + "€");
    }

}
