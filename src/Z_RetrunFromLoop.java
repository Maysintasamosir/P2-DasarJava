public class Z_RetrunFromLoop {
    public static void main(String[] args) {
      returnLoop();
    }
        static void returnLoop() {
        int x;
        System.out.println("Example of return in For-Loop");
        for (x = 1; x <= 10;x++) {
            if (x < 5) {
                System.out.printf("%d", (x - 1));
            } else {
                System.out.println("\n");
                return;
            }
            System.out.printf("%d", x);
            }
            System.out.println("tidak akan pernah di eksekusi");
            }

}

