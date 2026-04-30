package com.math;

import java.nio.file.Path;
import java.nio.file.Paths;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Utility class for mathematical operations and file path handling.
 */
public class MathUtils {

    private static final Logger LOGGER = LoggerFactory.getLogger(MathUtils.class);

    /**
     * Private constructor to prevent instantiation of utility class.
     */
    private MathUtils() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated");
    }

    /**
     * Generates a platform-independent file path.
     *
     * @return the string representation of the file path.
     */
    public static String getFilePath() {
        Path path = Paths.get("data", "temp", "config.txt");
        return path.toString();
    }

    /**
     * Returns the greater of two integers.
     *
     * @param a the first integer.
     * @param b the second integer.
     * @return the larger of a and b.
     */
    public static int max(int a, int b) {
        LOGGER.debug("So sánh {} và {}", a, b);
        return Math.max(a, b);
    }

    /**
     * Divides the first integer by the second.
     *
     * @param a the dividend.
     * @param b the divisor.
     * @return the quotient.
     * @throws IllegalArgumentException if the divisor is zero.
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            LOGGER.error("Lỗi chia cho số 0 với số bị chia là {}", a);
            throw new IllegalArgumentException("Divider must not be zero");
        }
        return a / b;
    }
}
