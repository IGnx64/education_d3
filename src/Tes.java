import java.util.Scanner;

class Sum {
    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("A = ");
        int a = scan.nextInt();
        System.out.print("B = ");
        int b = scan.nextInt();
        System.out.print("C = ");
        int c = scan.nextInt();
        System.out.println("A + B = " + ( a + b +c ));
    }
}