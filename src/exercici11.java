    import java.util.Scanner;


    public class exercici11 {


        public static void main(String[] args) {


            Scanner sc = new Scanner(System.in);

            System.out.println("Introdueix la nota dels exercicis entregables");
            double exercicisEntregables = sc.nextDouble();

            System.out.println("Introdueix la nota de les POUs avaluables");
            double POUs = sc.nextDouble();

            System.out.println("Introdueix la nota de l'examen final");
            double examenFinal = sc.nextDouble();

            System.out.println("Introdueix la nota de la practica final");
            double practicaFinal = sc.nextDouble();

            double percentatgeNotes = (exercicisEntregables + POUs + examenFinal + practicaFinal) / 4;

            if (percentatgeNotes <= 5) {
                System.out.println("Aprovat la teva nota es " + percentatgeNotes);
            } else {
                System.out.println("Sospes la teva nota es " + percentatgeNotes);
            }
        }

    }

