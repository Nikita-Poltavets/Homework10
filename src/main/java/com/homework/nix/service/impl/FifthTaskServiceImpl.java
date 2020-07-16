package com.homework.nix.service.impl;

import com.homework.nix.service.FifthTaskService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class FifthTaskServiceImpl implements FifthTaskService {

    public boolean isPrime(long n) {
        return LongStream.rangeClosed(2, (long) Math.sqrt(n))
                .allMatch(i -> n % i != 0);
    }

    @Override
    public List<Long> primeNumb(long n) {

        return LongStream.iterate(2, i -> i + 1)
                .filter(this::isPrime)
                .limit(n)
                .boxed()
                .collect(Collectors.toList());
    }
}
