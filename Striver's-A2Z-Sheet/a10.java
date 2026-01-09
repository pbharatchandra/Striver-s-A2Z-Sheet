public class a10 {
    public static void main(String[] args) {
        int n = 5;
        char ch = 'A';
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(ch);

            }
            System.out.println();
            ch++;
        }
    }
}
// ALPHA RAMP PATTERN
// A
// BB
// CCC
// DDDD
// EEEEE