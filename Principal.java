package pylab01;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        char jugarDenuevo;
        Scanner sc = new Scanner(System.in);
        do {
            vida = 0;
            do {
                vida++;
                System.out.println("Vida:" + vida + "\tCual es el numero secreto?");
                rp = sc.nextInt();
                if (rp == 1234) {
                    fl = true;
                }
            } while(vida < 3 && !fl);
            
            if (fl == true) {
                System.out.println("Adivinaste!!!! ");
                break;
            }
            else {
                System.out.println("ups, perdiste...");
            }
            
            System.out.println("Quieres jugar de nuevo? (S/N)");
            jugarDenuevo = sc.next().charAt(0);
        } while (jugarDenuevo == 'S' || jugarDenuevo == 's');
    }
}
