import java.util.Scanner;

public class Zad1 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("wpisz swoje imie");
        String imie = scanner.nextLine();
        System.out.println("Twoje imie to:" + imie);

        System.out.println("wpisz swoje nazwisko");
        String nazwisko = scanner.nextLine();
        System.out.println("Twoje nazwisko :" + nazwisko);

        System.out.println("wpisz swoj wiek");
        int wiek = scanner.nextInt();
        System.out.println("Twoj wiek to:" + wiek);
    }
}
