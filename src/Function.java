public class Function {
    public static void main(String[] args) {
    helloWorld();
    greeting("Zenith");
    add(5,7);
    }

    public static void helloWorld(){
        System.out.println("Hello, World");
    }

    private static void greeting(String name){
        System.out.println("Hello, " + name);
    }

    public static int add(int num1, int num2) {
        return num1 + num2;
    }

    public static void faveColorFinder(String color){
        if (color.equalsIgnoreCase("red")){
            System.out.println("red is a great color");
        } else if (color.equalsIgnoreCase("green")){
            System.out.println("green is solid favorite color");
        } else if (color.equalsIgnoreCase("black")){
            System.out.println("so trendy");
        } else {
            System.out.println("you need to evaluate your favorite color");
        }
    }

    public static void thatsOdd(int number){
        if (number %2 == 0){
            System.out.println("that's not odd");
        } else {
            System.out.println("That is odd indeed");
        }
    }

    private static String[] bigOrSmall(int[] arr){
        String[] answers = new String[arr.length];

        for (int i =0; i < arr.length; i++){
            if (arr[i] > 100){
                answers[i] = "big";
            } else if (arr[i] <= 100){
                answers[i] = "small";
            }
        }
        return answers;
    }
}
