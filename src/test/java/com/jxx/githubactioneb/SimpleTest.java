package com.jxx.githubactioneb;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@AutoConfigureMockMvc
@SpringBootTest
public class SimpleTest {

    @DisplayName("테스트할게요.")
    @Test
    void test() {
        String s = "hello";
        Assertions.assertThat(s).isEqualTo("hello");
    }
}
