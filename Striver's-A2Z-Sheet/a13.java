//SYMMETRIC VOID PATTERN
public class a13 {
    public static void main(String[] args) {
        int n = 8, c = 0, cc = 2 * (n - 1);

        for (int i = 1; i <= n; i++) {

            // STARS
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            // SPACE
            for (int j = 1; j <= c; j++) {
                System.out.print("-");

            }
            // STARS
            for (int j = 0; j <= n - i; j++) {
                System.out.print("*");
            }
            System.out.println();
            c += 2;
        }

        for (int i = 1; i <= n; i++) {
            // STARS
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // // SPACE
            for (int j = 1; j <= cc; j++) {
                System.out.print("-");
            }

            // // STARS
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            cc -= 2;
        }
    }
}

// **********
// ****--****
// ***----***
// **------**
// *--------*
// *--------*
// **------**
// ***----***
// ****--****
// **********