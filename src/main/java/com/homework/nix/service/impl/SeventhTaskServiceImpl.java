package com.homework.nix.service.impl;

import com.homework.nix.service.SeventhTaskService;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SeventhTaskServiceImpl implements SeventhTaskService {
    @Override
    public void evenAndOdd(Integer[] array) {
        List<Integer> evens;
        List<Integer> odds;

        evens = Arrays.stream(array)
                .filter(e -> e % 2 == 0)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());
        odds = Arrays.stream(array)
                .filter(o -> o % 2 == 1)
                .sorted(Comparator.reverseOrder())
                .collect(Collectors.toList());

        System.out.println("Четные - " + evens);
        System.out.println("Нечетные - " + odds);

    }
}
