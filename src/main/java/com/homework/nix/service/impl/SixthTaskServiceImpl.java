package com.homework.nix.service.impl;

import com.homework.nix.service.SixthTaskService;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.Map;
import java.util.stream.Collectors;



public class SixthTaskServiceImpl implements SixthTaskService {

    @Override
    public Map<Month, Integer> birthDay(Collection<LocalDate> birthDays) {

     return birthDays
             .stream()
             .collect(Collectors.toMap(LocalDate::getMonth,
                     b -> (int) getCountMonth(b.getMonth(), birthDays),
                     (a1, a2) -> a1));

    }

    long getCountMonth(Month month, Collection<LocalDate> collection){

        return collection.stream().filter(m -> month.equals(m.getMonth())).count();
    }


}
