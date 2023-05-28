package class13;

public class E3StringDemo {
    public static void main(String[] args) {

        String str="ksnfksnDSKJSD12       32344@#$%^&*";
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[^a-z0-9]",""));
        System.out.println(str.replaceAll("[^a-z0-9A-Z]",""));

        System.out.println(str.replaceAll("[Dn3]",""));
        System.out.println(str.replaceAll("[A-Z]","\\$"));
        System.out.println(str.replaceAll("  ","\\$"));
    }
}
