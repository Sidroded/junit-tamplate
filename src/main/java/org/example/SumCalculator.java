package org.example;

public class SumCalculator {

    public int sum(int n) {
        checkInputData(n);
        int result = 0;

        for (int i = 1; i <= n; i++) {
            result += i;
        }
        return result;
    }

    private void checkInputData(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Wrong input data. Must be more than 0.");
        }
    }
}