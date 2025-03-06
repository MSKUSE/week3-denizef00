public class FindMinimum {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        boolean min_num1 = num1 < num2 && num1 < num3;
        boolean min_num2 = num2 < num1 && num2 < num3;

        int minimum = min_num1 ? num1 :
                min_num2 ? num2 : num3;

        System.out.println(minimum);







        int length = args.length;
        if (length != 3 ){
            System.out.println("Not Enough Item");
        }
        else {
            int grade1 = Integer.parseInt(args[0]);
            int grade2 = Integer.parseInt(args[1]);
            int grade3 = Integer.parseInt(args[2]);
            int min;
            if (grade1 < grade2 && grade1 < grade3) {
                min = grade1;
            } else if (grade2 < grade1 && grade2 < grade3) {
                min = grade2;

            } else {
                min = grade3;
            }
            System.out.println(min);
        }
    }
}
