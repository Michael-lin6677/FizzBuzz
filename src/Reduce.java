public class Reduce {
    public static void main(String[] args) {
        int count = 0, n = 2;
        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
            }
            else {
                n = n - 1;
            }
            count++;
        }
        System.out.println(count);
    }
}
