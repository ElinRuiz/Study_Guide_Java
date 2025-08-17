package lessons.lessons2;

public class Calculus {

    public static void main(String[] args) {

        Calculus instance = new Calculus();

        instance.printNumbers(2) ;

    }

    public void printNumbers(long number) {

        if (number < 2) {
            System.out.println("Starting number adjusted to 2 because prime numbers are >= 2.");
            number = 2;
        }

        while (true) {

            if (number == Long.MAX_VALUE) {
                System.out.println("Reached Long.MAX_VALUE, stopping to prevent overflow.");
                break;
            }

            try {
                if (isPrime(number)) {
                    System.out.println(number);
                }
            } catch (Exception e) {

                System.err.println("Error checking number " + number + ": " + e.getMessage());
                break;
            }

            number++;
        }
    }

    public boolean isPrime(long n) throws ArithmeticException {

        if (n < 2){
            throw new ArithmeticException("isPrime not define negative number");
        }



        if (n == 2) return true;
        if (n % 2 == 0) return false;

        long sqrt = (long) Math.sqrt(n);
        for (long i = 3; i <= sqrt; i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

}
