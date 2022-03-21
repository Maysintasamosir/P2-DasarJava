public class I_ShortCircuitBooleanAnd {
    public static void main(String[] args) {
        //menggunakan operator boolean and short-circuit
        int a = 5, b = 7;
        if ((a < 2) && (b++ < 10)) {
            b += 2;
        }
        System.out.println(b);
    }

}
