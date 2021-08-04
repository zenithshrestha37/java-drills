public class FizzBuzzSwitch {

    public static void main(String[] args) {
        fizzBuzz100();
    }

    private static void fizzBuzz100() {

        for (int i = 1; i <= 100; i++) {
            int test = 0;
            if (i % 3 == 0) {
                test = 1;
            } else if (i % 5 == 0) {
                test = 2;
            } else if (i % 5 == 0 && i % 3 == 0) {
                test = 3;
            }

            switch (test) {
                case 1:
                    System.out.println("fizz");
                    break;
                case 2:
                    System.out.println("buzz");
                    break;
                case 3:
                    System.out.println("fizzbuzz");
                    break;
                default:
                    System.out.println(i);
                    break;
            }
        }
    }
}

