package io.github.zxh111222;

/**
 * @author XinhaoZheng
 * @version 1.0
 * @description: TODO
 * @date 2024/8/8 9:58
 */
public class Test {
     public static void main(String[] args) {
        ExecutionTimer.calculate(new Algorithm() {
            @Override
            public void execute() {
                int sum = 0;
                for (int i = 0; i < 10000; i++) {
                    sum += i;
                }
            }
        });
    }
}
