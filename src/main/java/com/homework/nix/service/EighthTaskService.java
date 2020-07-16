package com.homework.nix.service;

import java.util.List;
import java.util.function.UnaryOperator;

public interface EighthTaskService<T>  {

    void getAllUnaryOperators(List<UnaryOperator<T>> unaryOperator, T number);
}
