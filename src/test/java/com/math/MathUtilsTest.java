package com.math;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Unit tests for MathUtils class.
 */
class MathUtilsTest {

    private static final Logger LOGGER = LoggerFactory.getLogger(MathUtilsTest.class);

    @Test
    @DisplayName("Kiểm tra hàm Max với số A lớn hơn B")
    void testMaxAGreaterThanB() {
        LOGGER.info("Đang chạy testMaxAGreaterThanB");
        assertEquals(10, MathUtils.max(10, 5));
    }

    @Test
    @DisplayName("Kiểm tra hàm Max với hai số bằng nhau")
    void testMaxAEqualsB() {
        assertEquals(7, MathUtils.max(7, 7));
    }

    @Test
    @DisplayName("Kiểm tra hàm Divide với số chia dương")
    void testDividePositiveDivisor() {
        LOGGER.info("Đang chạy testDividePositiveDivisor");
        assertEquals(5, MathUtils.divide(10, 2));
    }

    @Test
    @DisplayName("Kiểm tra ngoại lệ khi chia cho 0")
    void testDivideZeroDivisor() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            MathUtils.divide(5, 0);
        });
        assertEquals("Divider must not be zero", exception.getMessage());
        LOGGER.warn("Đã bắt được ngoại lệ chia cho 0 đúng như kỳ vọng");
    }

    @Test
    void testFilePathRefactored() {
        String path = MathUtils.getFilePath();
        // Kiểm tra xem đường dẫn có chứa các thư mục mong muốn không
        assertTrue(path.contains("data"));
        assertTrue(path.contains("temp"));

        // Kiểm tra tính hợp lệ của tệp logic
        File file = new File(path);
        assertNotNull(file.getName(), "Tên tệp không được rỗng");
    }
}
