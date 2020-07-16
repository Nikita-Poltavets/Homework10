package com.homework.nix.service.impl;

import com.homework.nix.service.FirstTaskService;

import java.util.Arrays;

public class FirstTaskServiceImpl implements FirstTaskService {

    @Override
    public double maxElement(double[] array) {
        return Arrays.stream(array).max().getAsDouble();
    }

    @Override
    public double minElement(double[] array) {
        return Arrays.stream(array).min().getAsDouble();
    }

    @Override
    public double averageValue(double[] array) {
        return Arrays.stream(array).average().getAsDouble();
    }

    @Override
    public double sumArrayElements(double[] array) {
        return Arrays.stream(array).sum();
    }
}
