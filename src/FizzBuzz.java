/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {

        // what does the i++ mean?
        int i = 1;
        while (i < 100) {

            i = doFizzBuzz(i);
        }
    }

    private static int doFizzBuzz(int i) {
        // Find out which numbers divide i.
        // divisibleBy3 and divisibleBy5 are variables that are saving the bool value of True or False
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        // && is the java equivalent of and
        // else if is used instead of elif
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");

        } else if (divisibleBy3) {

            System.out.println("Fizz");

        } else if (divisibleBy5) {

            System.out.println("Buzz");

        } else {

            System.out.println(i);

        }
        i++;
        return i;
    }
}
