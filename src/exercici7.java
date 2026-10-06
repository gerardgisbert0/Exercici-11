import java.util.Scanner;
public class exercici7 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double souBase = 1250;
        System.out.println("Quantes hores extras has fet?");
        double hores = sc.nextDouble();
        double souExtra;

        if (hores <= 5){
            souExtra = hores * 15;
        }
        else {
            souExtra = 5 * 15 + (hores -5) * 12;
        }
        double sou = souBase + souExtra;
        System.out.println("El sou total es: " + sou + "€");
    }
}

