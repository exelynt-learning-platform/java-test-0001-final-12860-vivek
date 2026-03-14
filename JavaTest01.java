public class JavaTest01 {
    public static void main(String[] args) {

        int n = 5; // half of 9 rows (diamond center included)

        // Upper part
        for (int i = 1; i <= n; i++) {

            // Spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // Hollow stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }

        // Lower part
        for (int i = n - 1; i >= 1; i--) {

            // Spaces
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }

            // Hollow stars
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            System.out.println();
        }
    }
}