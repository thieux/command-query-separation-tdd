package com.mathieupauly.cmdquerysep;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

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

        add(left);
        add(right);

        return String.valueOf(sum());
    }

    @Test
    public void add_1_2() {
        add(1);
        add(2);

        assertThat(sum()).isEqualTo(3);
    }

    private List<Integer> list = new ArrayList<>();

    private int sum() {
        Integer res = 0;
        for (Integer left : list) {
            res += left;

        }
        return res;
    }

    private void add(int left) {
        list.add(left);
    }

}
