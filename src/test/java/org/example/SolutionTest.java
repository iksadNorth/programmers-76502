package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SolutionTest {
    private final Solution solution = new Solution();

    public void assertAnswer(String s, int answer) {
        // when
        int result = solution.solution(s);

        // then
        Assertions.assertEquals(result, answer);
    }

    @Test
    void testcase1() {
        // given
        String s = "[](){}";
        int answer = 3;

        // when & then
        assertAnswer(s, answer);
    }

    @Test
    void testcase2() {
        // given
        String s = "}]()[{";
        int answer = 2;

        // when & then
        assertAnswer(s, answer);
    }

    @Test
    void testcase3() {
        // given
        String s = "[)(]]";
        int answer = 0;

        // when & then
        assertAnswer(s, answer);
    }

    @Test
    void testcase4() {
        // given
        String s = "}}}";
        int answer = 0;

        // when & then
        assertAnswer(s, answer);
    }
}