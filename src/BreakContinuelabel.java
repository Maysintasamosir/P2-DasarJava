public class BreakContinuelabel {

    public static void main(String[] args) {
        int a, b;
        System.out.println("Contoh break Label");

        for (a = 0; a < 2; a++) {
            for (b = 0; b < 3; b++) {
                if (b == 1) {
                    break;
                }
                System.out.println("a=" + a + ";b=" + b);
            }
        }
        System.out.println("\nContoh continue Label");

        for (a = 0; a < 2; a++) {
            for (b = 0; b < 3; b++) {
                if (b == 1) {
                    continue;
                }
                System.out.println("a=" + a + ";b=" + b);
            }
        }

                }

                }