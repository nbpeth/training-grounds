package com.training.grounds;

import java.util.List;
import java.util.stream.Collectors;

public class MagicCalculator {

    public MagicCalculator(){

    }

    public MagicCalculator(int threshold){

    }

    public int calculateDynamically(String operation, int a, int b){

        return 0;
    }

    public List<Integer> filterNumbersByThreshold(List<Integer> numbers){

        return numbers.stream().filter(n-> n >= 2000).collect(Collectors.toList());
    }

    public int sumFiltered(List<Integer> numbers){

        return 0;
    }

}
