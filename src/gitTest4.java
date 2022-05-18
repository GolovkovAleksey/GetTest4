import java.util.Scanner;
public class gitTest4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите число");
        String value = sc.nextLine();
        System.out.println("¬ведите разделитель");
        String decl =sc.nextLine();;
        String value1;
        value1 = value.replaceAll("\\B(?=(\\d{3})+(?!\\d))",decl);
        System.out.println(value1);
        System.out.println("sdd");
    }
}