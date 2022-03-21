public class K_ShortcircuitBooleanOr {
    public static void main(String[] args) {
        // menggunakan boolean or short-circuit
        int a=5,b=7;
        if ((a>2)|(b++<10)){
            b+=2;
        }
        System.out.println(b);
    }
}


