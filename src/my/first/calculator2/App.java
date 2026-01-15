package my.first.calculator2;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // 1. Calculator 클래스의 인스턴스(객체)를 생성합니다.
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요: ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요: ");
            int num2 = sc.nextInt();
            System.out.print("사칙연산 기호를 입력하세요: ");
            char operator = sc.next().charAt(0);

            // 2. 계산기 객체에게 연산을 시키고 결과값을 받습니다.
            int result = calc.calculate(num1, num2, operator);
            System.out.println("결과: " + result);

            // 3. Getter를 통해 현재 저장된 모든 결과를 출력해봅니다.
            System.out.println("전체 기록: " + calc.getResults());

            // 4. 삭제 기능 테스트
            System.out.print("가장 오래된 기록을 삭제하시겠습니까? (remove 입력 시 삭제): ");
            String removeCheck = sc.next();
            if (removeCheck.equals("remove")) {
                calc.removeResult();
                System.out.println("현재 기록: " + calc.getResults());
            }

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료): ");
            if (sc.next().equals("exit")) {
                break;
            }
        }
    }
}