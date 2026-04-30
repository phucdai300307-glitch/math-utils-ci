package com.math;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.nio.file.Path;
import java.nio.file.Paths;

public class MathUtils {
    private static final Logger logger = LoggerFactory.getLogger(MathUtils.class);

    public static String getFilePath() {
        // Không dùng "C:\\..." nữa. Paths.get sẽ tự thêm / hoặc \ tùy vào hệ điều hành
        Path path = Paths.get("data", "temp", "config.txt");
        return path.toString();
    }

    public static int max(int a, int b) {
        logger.debug("So sánh {} và {}", a, b);
        return (a >= b) ? a : b;
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            logger.error("Lỗi chia cho số 0 với số bị chia là {}", a);
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}
