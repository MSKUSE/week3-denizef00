public class FindMaximum {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        boolean condition  = num1 > num2;

        int greatest = condition ? num1 : num2;
        System.out.println(greatest);






        int length = args.length;
        if (length != 2) {
            System.out.println("You should give a score!!!");

        } else {
            int grade1 = Integer.parseInt(args[0]);
            int grade2 = Integer.parseInt(args[1]);
            int maximum;
            if (grade1 > grade2) {
                maximum = grade1;
            } else {
                maximum = grade2;
            }
            System.out.println(maximum);

        }
    }
}

