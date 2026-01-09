public class a5 {
    public static void main(String[] args) {
        int n = 5, num = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                num = 1;
            else
                num = 0;
            for (int j = 0; j <= i; j++) {
                System.out.print(num);
                num = 1 - num;
            }
            System.out.println();
        }
    }
}

// 1
// 01
// 101
// 0101
// 10101