// ALPHA HILL PATTERN
public class a11 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            // SPACE
            for (int j = 0; j <= n - i - 1; j++) {
                System.out.print("-");
            }
            // CHARCTERS
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint)
                    ch++;
                else
                    ch--;
            }
            // SPACE (OPTIONAL)
            // for (int j = 0; j <= n - i - 1; j++) {
            // System.out.print("-");
            // }

            System.out.println();

        }
    }
}

// -----A
// ----ABA
// ---ABCBA
// --ABCDCBA
// -ABCDEDCBA
// OR (OPTIONAL ADDING SPACE AFTER BUT WOULD INCREASE TIME AND SPACE COMPLEXITY)
// -----A-----
// ----ABA----
// ---ABCBA---
// --ABCDCBA--
// -ABCDEDCBA-