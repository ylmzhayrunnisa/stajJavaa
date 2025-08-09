import java.util.Scanner;

public class class2 {
    String[] hayvanlar = {"inek", "kedi", "köpek"};

    public String ses() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hayvan girin: ");
        String secim = scanner.nextLine();

        String ses;
        switch (secim.toLowerCase()) {
            case "inek":
                ses = "Mööö";
                break;
            case "kedi":
                ses = "Miyav";
                break;
            case "köpek":
                ses = "Hav hav";
                break;
            default:
                ses = "Bu hayvan listede yok.";
        }

        return ses;
    }
}
