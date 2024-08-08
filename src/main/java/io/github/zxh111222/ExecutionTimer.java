package io.github.zxh111222;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/8 9:51
 */
public class ExecutionTimer {

        public static long calculate(Algorithm algorithm) {
        long start = System.currentTimeMillis();
        algorithm.execute();
        long end = System.currentTimeMillis();

        long elapsedTime = end - start;
        System.out.println("Execution time: " + elapsedTime + " ms");
        return elapsedTime;
    }

}
