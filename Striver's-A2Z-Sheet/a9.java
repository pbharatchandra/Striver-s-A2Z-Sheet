// Decreasing Letter Triangle Pattern

public class a9 {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 0; i < n; i++) {

            for (char j = 'A'; j <= 'A' + (n - i - 1); j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}

// (n - i - 1) i.e if n=5 for reverse counting
// ABCDE
// ABCD
// ABC
// AB
// A