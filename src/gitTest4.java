import java.util.Scanner;
public class gitTest4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ââåäèòå ÷èñëî");
        String value = sc.nextLine();
        System.out.println("Ââåäèòå ðàçäåëèòåëü");
        String decl =sc.nextLine();;
        String value1;
        value1 = value.replaceAll("\\B(?=(\\d{3})+(?!\\d))",decl);
        System.out.println(value1);
        System.out.println("sdd");

    }
}