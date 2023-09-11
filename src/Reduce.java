public class Reduce {
    public static void main(String[] args) {

        int n = 10;
        int steps = 0;

        while (n != 0) {

            boolean isEven = n % 2 == 0;

            if (isEven) {
                n = n / 2;
                steps++;
            }

            else {
                n = n - 1;
                steps++;
            }
        }
        System.out.println(steps);
    }
}
