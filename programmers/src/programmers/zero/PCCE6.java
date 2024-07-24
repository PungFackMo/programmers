package programmers.zero;

import java.util.Arrays;

public class PCCE6 {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            } else {
                answer[i] = "Different";
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] numbers = new int[] {3, 4};
        int[] our_score = new int[] {85, 93};
        int[] score_list = new int[] {85, 92, 38, 93, 48, 85, 92, 56};

        PCCE6 solution = new PCCE6();
        System.out.println(Arrays.toString(solution.solution(numbers, our_score, score_list)));
    }
}