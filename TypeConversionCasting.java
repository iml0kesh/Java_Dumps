public class TypeConversionCasting {
    public static void main(String[] args) {
        byte b = 127;

        int a = 256;
        byte k = (byte) a; // casting explict conversion

        System.out.println(k);
    }
}
