public class FizzBuzzSwitch {

    public static void main(String[] args) {
        fizzBuzz100();
    }

    private static void fizzBuzz100() {
        for (int i = 1; i <= 100; i++) {
            switch(){
                case (((i % 5)) && ((i % 3)))):

            }
            if ((i % 3) == 0)
                System.out.println("fizz");
            else if ((i % 5) == 0)
                System.out.println("buzz");
            else if (((i % 5) == 0) && ((i % 3) == 0))
                System.out.println("fizzbuzz");
            else
                System.out.println(i);
        }
    }
}