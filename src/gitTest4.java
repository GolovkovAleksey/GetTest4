public class gitTest4 {
    public static void main(String[] args) {
        String value = "21132134214";
        String value1;
        String decl = ",";
        value1 = value.replaceAll("\\B(?=(\\d{3})+(?!\\d))",decl);
        System.out.println(value1);
    }
}