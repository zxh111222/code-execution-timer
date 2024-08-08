package io.github.zxh111222;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/8 10:32
 */
public class HowToUse {
    @Test
    public void test() {
        long time = ExecutionTimer.calculate(new Sum1000());
        Assertions.assertTrue(time >= 0);
    }
}
