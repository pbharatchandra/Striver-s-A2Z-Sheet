public class a12 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {
            char ch = 'E';
            for (ch -= i; ch <= 'E'; ch++) {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}
