package com.homework.nix.service.impl;

import com.homework.nix.service.EighthTaskService;

import java.util.List;
import java.util.function.UnaryOperator;

public class EighthTaskServiceImpl<T> implements EighthTaskService<T> {

    @Override
    public void getAllUnaryOperators(List<UnaryOperator<T>> unaryOperator, T number) {

        UnaryOperator<T> resultUnaryOperator = unaryOperator
                .stream()
                .reduce(s -> s, (a, b) -> s -> b.apply(a.apply(s)));

        System.out.println(resultUnaryOperator.apply(number));
    }

}
