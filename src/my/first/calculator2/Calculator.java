package my.first.calculator2;

import java.util.ArrayList;

public class Calculator {
    // [캡슐화] 외부에서 직접 수정하지 못하도록 private으로 선언합니다.
    private ArrayList<Integer> results = new ArrayList<>();

    // 사칙연산을 수행하고 결과를 반환하며, 동시에 리스트에 저장하는 메서드
    public int calculate(int num1, int num2, char operator) {
        int result = 0;

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
                if (num2 == 0) {
                    System.out.println("나눗셈 연산에서 분모에 0이 입력될 수 없습니다.");
                    return -1; // 에러 의미로 -1 반환 (초보자 수준의 간단한 처리)
                }
                result = num1 / num2;
                break;
        }

        // 결과를 리스트에 저장합니다.
        results.add(result);
        return result;
    }

    // [Getter] 저장된 결과 리스트를 외부에서 가져갈 수 있게 해줍니다.
    public ArrayList<Integer> getResults() {
        return results;
    }

    // [Setter] 외부에서 리스트 자체를 교체하거나 수정하고 싶을 때 사용합니다.
    public void setResults(ArrayList<Integer> results) {
        this.results = results;
    }

    // 가장 먼저 저장된 데이터를 삭제하는 메서드
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
            System.out.println("가장 오래된 기록이 삭제되었습니다.");
        } else {
            System.out.println("삭제할 기록이 없습니다.");
        }
    }
}