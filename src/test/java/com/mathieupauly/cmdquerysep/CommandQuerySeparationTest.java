package com.mathieupauly.cmdquerysep;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CommandQuerySeparationTest {

    @Test
    public void add_1_2() {
        assertThat(add(1, 2)).isEqualTo(3);
    }

    private int add(int left, int right) {
        return left + right;
    }
}
