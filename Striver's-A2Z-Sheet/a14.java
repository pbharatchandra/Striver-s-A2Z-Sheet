public class a14 {
    public static void main(String[] args) {
        int n = 5, space = 2 * n - 2/* 9 */;
        for (int i = 1; i <= 2 * n - 1 /* 9 */; i++) {
            // STARS
            int stars = i;
            if (i > n) {
                stars = 2 * n - i;
            }
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            // SPACE
            for (int j = 1; j <= space /* intially its 8 but c=-2; later */; j++) {
                System.out.print("-");
            }
            // STARS
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            System.out.println();
            if (i < n) {
                space -= 2;
            } else {
                space += 2;
            }

        }
    }
}

// SYMMETRIC BUTTERFLY PATTERN
// *--------*
// **------**
// ***----***
// ****--****
// **********
// ****--****
// ***----***
// **------**
// *--------*