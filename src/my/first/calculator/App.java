package my.first.calculator;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 1. 키보드 입력을 받기 위한 Scanner 객체를 만듭니다.
        Scanner sc = new Scanner(System.in);

        // 2. 반복문을 사용하여 "exit"을 입력하기 전까지 계속 계산하게 합니다.
        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 (0 포함 양의 정수): ");
            // 입력받은 첫 번째 숫자를 정수형 변수 num1에 저장합니다.
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력하세요 (0 포함 양의 정수): ");
            // 입력받은 두 번째 숫자를 정수형 변수 num2에 저장합니다.
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력하세요 (+, -, *, /): ");
            // 입력받은 문자열에서 첫 번째 글자(기호)만 따와서 char 타입 변수에 저장합니다.
            char operator = sc.next().charAt(0);

            int result = 0; // 결과값을 저장할 변수를 미리 만듭니다.
            boolean success = true; // 계산이 성공적으로 이루어졌는지 확인하는 용도입니다.

            // 3. switch문을 사용하여 기호에 맞는 연산을 수행합니다.
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    // 나눗셈에서 분모가 0이면 오류가 나므로 if문으로 체크합니다.
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모(두 번째 정수)에 0이 입력될 수 없습니다.");
                        success = false; // 계산 실패 표시
                    } else {
                        result = num1 / num2;
                    }
                    break;
                default:
                    // +, -, *, / 외에 다른 기호를 입력했을 때 처리입니다.
                    System.out.println("잘못된 연산 기호입니다.");
                    success = false;
                    break;
            }

            // 4. 계산이 성공했을 때만 결과값을 화면에 보여줍니다.
            if (success) {
                System.out.println("결과: " + result);
            }

            // 5. 반복을 계속할지 종료할지 결정합니다.
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료, 아무 문자나 입력 시 계속): ");
            String exitCheck = sc.next();

            // 입력한 글자가 "exit"과 같다면 break를 통해 반복문을 탈출합니다.
            if (exitCheck.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            }
        }
    }
}