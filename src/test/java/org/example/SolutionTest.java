package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(String s, String answer) {
        // when
        String result = solution.solution(s);

        // then
        Assertions.assertEquals(result, answer);
    }

    @Disabled
    @Test @DisplayName("이 메서드는 Mock Up 이다.")
    void testcase0() {
        // given
        String s = "1 2 3 4";
        String answer = "1 4";

        // when & then
        assertAnswer(s, answer);
    }
}