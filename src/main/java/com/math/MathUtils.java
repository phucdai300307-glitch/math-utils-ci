package com.math;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    // Trong file src/main/java/com/math/MathUtils.java
    public static String getFilePath() {
        // Dùng dấu gạch chéo ngược cứng của Windows
        return "C:\\data\\temp\\config.txt";
    }

    public static int max(int a, int b) {
        logger.debug("So sánh {} và {}", a, b);
        return (a >= b) ? a : b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            logger.error("Lỗi chia cho 0 với số bị chia là {}", a);
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}
