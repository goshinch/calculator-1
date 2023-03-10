package Java.src.main.java.week02.day05.homework1;

import java.util.Scanner;

// 추가할 기능
// continue
// only number
class Calculate {

    // class Calculate를 생성한다.
    // -> int n1, int n2의 값을 받아와서 계산하기
    static int add(int n1, int n2) {
        //	더하기
    }

    static int sub(int n1, int n2) {
        //	빼기
    }

    static int mul(int n1, int n2) {
        //	곱하기
    }

    static int div(int n1, int n2) {
        // 나누기
    }

    static int pow(int n1, int n2) {
        // 거듭제곱
        double result =Math.pow((double)n1, (dobule)n2);
        return (int)result;
    }

}

public class Calculator {

    public static void main(String[] args) {
        // 값을 받기 위해서 Scanner를 생성
        Scanner scan = new Scanner(System.in);
        // 클래스 변수 선언
        Calculate calc = new Calculate();

        // numbers
        int num1, num2;
        // operator
        char oper;

        System.out.println("only support +, -, *, /, ^");
        // first number
        num1 = scan.nextInt();
        // operator
        // char 문자를 받을기 위해 .charAt()을 사용
        oper = scan.next().charAt(0);
        // second number
        num2 = scan.nextInt();

        // calculate part
        switch (oper) {
            // add
            case '+':
                System.out.println(
                    "Answer -> " + num1 + " + " + num2 + " = " + Calculate.add(num1, num2));
                break;

            // minus
            case '-':
                System.out.println(
                    "Answer -> " + num1 + " - " + num2 + " = " + Calculate.sub(num1, num2));
                break;

            // multiple
            case '*':
                System.out.println(
                    "Answer -> " + num1 + " * " + num2 + " = " + Calculate.mul(num1, num2));
                break;

            // devide
            case '/':
                System.out.println(
                    "Answer -> " + num1 + " / " + num2 + " = " + Calculate.div(num1, num2));
                break;

            // pow
            case '^':
                System.out.println(
                    "Answer -> " + num1 + " ^ " + num2 + " = " + Calculate.pow(num1, num2));
                break;
        }
    }
}
