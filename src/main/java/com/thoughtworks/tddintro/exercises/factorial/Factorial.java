package com.thoughtworks.tddintro.exercises.factorial;

public class Factorial {
    public Integer compute(int i) {
        if (i < 0){
            throw new IllegalArgumentException();
        }
        else if (i == 0){
            return 1;
        }
        else if (i <= 2){
            return i;
        }
        else {
            Integer factorial = i;
            for (Integer j = i - 1; j > 0; j--){
                factorial *= j;
            }
            return factorial;
        }
    }
}

