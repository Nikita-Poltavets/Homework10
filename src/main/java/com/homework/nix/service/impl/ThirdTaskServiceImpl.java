package com.homework.nix.service.impl;

import com.homework.nix.service.ThirdTaskService;

import java.util.List;
import java.util.stream.Collectors;

public class ThirdTaskServiceImpl implements ThirdTaskService {

    @Override
    public List<String> regularExpression(List<String> stringList, String regex) {

        return stringList
                .stream()
                .map(s -> s.replaceAll(regex, ""))
                .collect(Collectors.toList());
    }
}
