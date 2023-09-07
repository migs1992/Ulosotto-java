import java.util.InputMismatchException;
import java.util.Scanner;

public class UlosotonLaskuri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Ulosoton Osuuden Laskuri");
            System.out.print("Syötä palkan määrä: ");
            double palkka = scanner.nextDouble();

            System.out.print("Syötä huollettavien lukumäärä: ");
            int huollettavat = scanner.nextInt();

            if (huollettavat < 0) {
                System.out.println("Virhe: Huollettavien lukumäärä ei voi olla negatiivinen.");
                return;
            }

            double suojaosuus = 922.50 + (huollettavat * 270);
            double nettopalkka = palkka - suojaosuus;

            double ulosottoProsentti = 0.3;
            double ulosottoOsuus = ulosottoProsentti * nettopalkka;

            System.out.println("Suojaosuus: " + suojaosuus);
            System.out.println("Nettopalkka ennen ulosottoa: " + nettopalkka);
            System.out.println("Ulosoton osuus: " + ulosottoOsuus);
        } catch (InputMismatchException e) {
            System.out.println("Virhe: Virheellinen syöte. Syötä lukuja oikeassa formaatissa.");
        } finally {
            scanner.close();
        }
    }
}
