public class BigOrSmall {

    public static void main(String[] args) {
        int[] arr= {1,500,233,255,60,3,1,55555,100,222};
        String[] result= bigOrSmall(arr);

        for(String s: result) {
            System.out.println(s);
        }

    }

    private static String[] bigOrSmall(int[] arr) {
        String[] answers= new String[arr.length];

        for(int i=0;i<arr.length;i++) {
            if(arr[i]>100) {
                answers[i]="big";
            }
            else {
                answers[i]="small";
            }
        }

        return answers;
    }
}
