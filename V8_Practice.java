import java.util.Scanner;

public class V8_Practice {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // 1.
        // int a = 10;
        // if(a==11){
        // System.out.println("I m 11");
        // }else{
        // System.out.println("I m not 11");
        // }

        // 2.
        // System.out.println("Enter marks of 1st sub");
        // int m1 = sc.nextInt();
        // System.out.println("Enter marks of 2nd sub");
        // int m2 = sc.nextInt();
        // System.out.println("Enter marks of 3rd sub");
        // int m3 = sc.nextInt();
        // int sum = m1+m2+m3;
        // if(m1>=33 && m2>=33 && m3>=33 && sum>=40){
        // System.out.println("Pass");
        // }else{
        // System.out.println("Fail");
        // }

        // 3.
        // float incomeSlab = sc.nextFloat();
        // System.out.println("Enter your Early Income");
        // if ((incomeSlab >= 2.5) && (incomeSlab < 5.0)) {
        // System.out.println("tax = 5%");
        // }
        // if ((incomeSlab >= 5.0) && (incomeSlab < 10.0)) {
        // System.out.println("tax = 20%");
        // }
        // if ((incomeSlab >= 10.0)) {
        // System.out.println("tax = 30%");
        // }

        // 4.
        // int num = sc.nextInt();
        // System.out.println("Enter a number between 1 to 7");
        // switch (num) {
        // // or case 1 -> System.out.println("Monday");
        // // Write like this
        // case 1:
        // System.out.println("Monday");
        // break;
        // case 2:
        // System.out.println("Tuesday");
        // break;
        // case 3:
        // System.out.println("Wednesday");
        // break;
        // case 4:
        // System.out.println("Thursday");
        // break;
        // case 5:
        // System.out.println("Friday");
        // break;
        // case 6:
        // System.out.println("Saturday");
        // break;
        // case 7:
        // System.out.println("Sunday");
        // break;
        // default:
        // break;
        // }

        // 5.
        // int year = sc.nextInt();
        // if (year % 4 == 0) {
        // if (year % 100 == 0) {
        // if (year % 400 == 0) {
        // System.out.println("Leap year");
        // } else {
        // System.out.println("Not a Leap Year");
        // }
        // }else{
        // System.out.println("Leap year");
        // }
        // } else {
        // System.out.println("Not a Leap Year");
        // }

        // 6.
        String str = sc.next();
        if (str.endsWith(".com")) {
            System.out.println("Commercial Website");
        } else if (str.endsWith(".org")) {
            System.out.println("Organization Website");
        } else if (str.endsWith(".in")) {
            System.out.println("Indian Website");
        } else {
            System.out.println("Error");
        }
    }
}
