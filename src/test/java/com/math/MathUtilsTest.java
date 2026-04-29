package com.math;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class MathUtilsTest {
    private static final Logger logger = LoggerFactory.getLogger(MathUtilsTest.class);

    @Test
    @DisplayName("Kiểm tra hàm Max với số A lớn hơn B")
    void testMax_AGreaterThanB() {
        logger.info("Đang chạy testMax_AGreaterThanB");
        assertEquals(10, MathUtils.max(10, 5));
    }

    @Test
    @DisplayName("Kiểm tra hàm Max với hai số bằng nhau")
    void testMax_AEqualsB() {
        assertEquals(7, MathUtils.max(7, 7));
    }

    @Test
    @DisplayName("Kiểm tra hàm Divide với số chia dương")
    void testDivide_PositiveDivisor() {
        logger.info("Đang chạy testDivide_PositiveDivisor");
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    @DisplayName("Kiểm tra ngoại lệ khi chia cho 0")
    void testDivide_ZeroDivisor() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(5, 0);
        });
        assertEquals("Divider must not be zero", exception.getMessage());
        logger.warn("Đã bắt được ngoại lệ chia cho 0 đúng như kỳ vọng");
    }
}