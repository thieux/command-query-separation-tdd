package com.mathieupauly.cmdquerysep;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandQuerySeparationTest {

    @Test
    public void integration_test() {
        assertThat(application("1 2")).isEqualTo("3");
    }

    private String application(String pair) {
        final String[] elements = pair.split(" ");
        final int left = Integer.parseInt(elements[0]);
        final int right = Integer.parseInt(elements[1]);

        result = 0;
        add(left);
        add(right);

        return String.valueOf(sum());
    }

    @Test
    public void add_1_2() {
        result = 0;
        add(1);
        add(2);

        assertThat(sum()).isEqualTo(3);
    }

    private int result;

    private int sum() {
        return result;
    }

    private void add(int left) {
        result = add(left, result);
    }

    private int add(int left, int right) {
        return left + right;
    }
}
