package com.homework.nix.service.impl;

import com.homework.nix.service.SecondTaskService;

import java.time.Year;
import java.util.List;
import java.util.stream.Collectors;

public class SecondTaskServiceImpl implements SecondTaskService {

    @Override
    public List<Year> getLeapYears(List<Year> yearList) {
        return yearList
                .stream()
                .filter(year -> year.isLeap())
                .sorted()
                .collect(Collectors.toList());
    }
}
