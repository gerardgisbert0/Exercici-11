    import java.util.Scanner;

    public class exercici1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.println("Introdueix el valor");
            int num = sc.nextInt();
            if (num < 0) {
                System.out.println("el valor no pot ser negatiu, torna  a introduir-lo ");
            } else{
                System.out.println("Valorr correcte:" + num);
            }
        }

    }





