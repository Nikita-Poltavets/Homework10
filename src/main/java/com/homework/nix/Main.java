package com.homework.nix;

import com.homework.nix.service.EighthTaskService;
import com.homework.nix.service.FifthTaskService;
import com.homework.nix.service.impl.*;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
        double[] array = {5.2, 1.3, 2.56, 3.4, 4.6, 5.3, 3.8, 7.43, 7.21, 7.34, 10.2};

        List<Year> yearList = Arrays.asList(Year.of(2017), Year.of(2016), Year.of(2015), Year.of(2014), Year.of(2013), Year.of(2012), Year.of(2011), Year.of(2010));

        List<String> listPalindrome = Arrays.asList("level", "kayak", "therefore");
        List<String> listCustomRegex = Arrays.asList("It s$$eems like", "bla bla $$du", "wedjim$");

        Integer[] arrayOfOddsAndEvens = {1,2,3,4,5,6,6,7,7,8};

        Collection<LocalDate> list = new ArrayList<>();
        list.add(LocalDate.of(1939, 9, 1));
        list.add(LocalDate.of(1914, 7, 28));
        list.add(LocalDate.of(2014, 8, 22));
        list.add(LocalDate.of(2087, 9, 27));

        List<UnaryOperator<Integer>> unaryOperatorList = new ArrayList<>();
        unaryOperatorList.add(x -> x * x);
        unaryOperatorList.add(x -> x + 2);


        System.out.println("\n1. Дан массив double[]. Найти максимальное число, минимальное число, среднее\n" +
                "арифметическое и сумму. (рекомендация - создайте только один стрим для\n" +
                "решения задачи)\n");
        FirstTaskServiceImpl firstTaskService = new FirstTaskServiceImpl();

        System.out.println("Максимальное число:");
        System.out.println(firstTaskService.maxElement(array));
        System.out.println("Минимальное число:");
        System.out.println(firstTaskService.minElement(array));
        System.out.println("Среднее арифметическое:");
        System.out.println(firstTaskService.averageValue(array));
        System.out.println("Сумма:");
        System.out.println(firstTaskService.sumArrayElements(array));


        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("\n2. Дана коллекция лет (java.time.Year). Вернуть високосные годы в виде списка,\n" +
                "отсортированного по возрастанию.\n");
        SecondTaskServiceImpl secondTaskService = new SecondTaskServiceImpl();
        System.out.println(secondTaskService.getLeapYears(yearList));


        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("\n3. Дан список строк. Вырезать из каждой строки участки, удовлетворяющие\n" +
                "регулярному выражению.\n");
        ThirdTaskServiceImpl thirdTaskService = new ThirdTaskServiceImpl();
        System.out.println(thirdTaskService.regularExpression(listCustomRegex, "\\$"));


        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("\n4. Дан список строк со словами, разделенными одним или более пробелами.\n" +
                "Вернуть список слов-палиндромов.\n");
        FourthTaskServiceImpl fourthTaskService = new FourthTaskServiceImpl();
        System.out.println(fourthTaskService.getPalindrome(listPalindrome));


        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("\n5. Сгенерировать бесконечную последовательность простых целых чисел (тип\n" +
                "числа - BigInteger). Вернуть список из n первых вероятных простых чисел\n" +
                "(точность вычисления простого числа должна быть не менее 1 - 2 -100.\n");
        FifthTaskService fifthTaskService = new FifthTaskServiceImpl();
        System.out.println(fifthTaskService.primeNumb(5));


        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("\n6. Дан список дней рождения сотрудников фирмы (Collection<LocalDate>). Вернуть\n" +
                "количество дней рожденья в каждом месяце (Map<Month, Integer>).\n");
        SixthTaskServiceImpl sixthTaskService = new SixthTaskServiceImpl();
        System.out.println(sixthTaskService.birthDay(list));


        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("\n7. Дан массив целых чисел. Разбить его на четные и нечетные, отсортировать и те,\n" +
                "и другие по убыванию.");
        SeventhTaskServiceImpl seventhTaskService = new SeventhTaskServiceImpl();
        seventhTaskService.evenAndOdd(arrayOfOddsAndEvens);


        System.out.println("\n||||||||||||||||||||||||||||||||||||||||||||||||||||||||||");


        System.out.println("\n8. Дан список унарных операторов UnaryOperator<T>. Объединить их в один\n" +
                "унарный оператор, который применяет их все.");
        EighthTaskService<Integer> eighthTaskService = new EighthTaskServiceImpl<>();
        eighthTaskService.getAllUnaryOperators(unaryOperatorList, 2);
    }
}
