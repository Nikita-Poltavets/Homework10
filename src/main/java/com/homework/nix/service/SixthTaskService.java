package com.homework.nix.service;

import java.time.LocalDate;
import java.time.Month;
import java.util.Collection;
import java.util.Map;

public interface SixthTaskService {

    Map<Month, Integer> birthDay(Collection<LocalDate> birthDays);
}
