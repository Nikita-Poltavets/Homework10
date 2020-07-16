package com.homework.nix.service.impl;

import com.homework.nix.service.FourthTaskService;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FourthTaskServiceImpl implements FourthTaskService {
    @Override
    public List<String> getPalindrome(List<String> palindromeList) {

        return palindromeList
                .stream()
                .filter(this::isPalindrome)
                .collect(Collectors.toList());

    }

    public boolean isPalindrome(String originalStr){

        String tempStr = originalStr.replaceAll("\\s+", "").toLowerCase();

        return IntStream.range(0, tempStr.length() / 2)
                .noneMatch(p -> tempStr.charAt(p) != tempStr.charAt(tempStr.length() - p - 1));
    }
}
