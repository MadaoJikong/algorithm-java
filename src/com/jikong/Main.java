package com.jikong;

import java.io.IOException;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        // write your code here

//        String key = "wdassda,.，  ！%saw我都    问问||<>~%%%%|||||||||^&*()_+=|\\";
//        String newKey = key.replaceAll("[\\pP\\p{Punct}]", " ").replaceAll("\\s+", ",");
//        System.out.println(newKey);
//        BigDecimal bigDecimal = new BigDecimal(121 / (double) 23);
//        bigDecimal = bigDecimal.setScale(2, RoundingMode.HALF_UP);
//        System.out.println(bigDecimal);
//        System.out.println(bigDecimal.subtract(new BigDecimal(1)));
//        Date nowDateTemp = formatDate("2023-01-01");
//
//        Date tempDate = getPlusMinusMonth(nowDateTemp, -3);
//        System.out.println(tempDate);

        List<String> a = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11");
        divide(a, 3);
        System.out.println("1");
    }

    public static Date getPlusMinusMonth(Date date, int i) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, i);
        Date newDate = calendar.getTime();
        return newDate;
    }

    public static Date formatDate(String str) {
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date = sd.parse(str);
            return date;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return new Date();
    }

    public static String a(String str) {
        int index = str.lastIndexOf("|");
        if (index != -1) {
            String s = str.substring(0, index);
            return s;
        }
        index = str.lastIndexOf("/");
        if (index != -1) {
            String s = str.substring(0, index);
            return s;
        }
        return "";
    }

    public static List<List<String>> divide(List<String> origin, int size) {

        int block = (origin.size() + size - 1) / size;
        return IntStream.range(0, block).
                boxed().map(i -> {
                    int start = i * size;
                    int end = Math.min(start + size, origin.size());
                    return origin.subList(start, end);
                }).collect(Collectors.toList());
    }


    public static List<Collection> splitObjectCollection(Collection values, int size) {
        List<Collection> result = new ArrayList<Collection>();
        if (values.size() <= size) {
            result.add(values);
        } else {
            int count = 0;
            Collection<Object> subCollection = null;
            for (Object s : values) {
                if (subCollection == null) {
                    subCollection = new ArrayList<>();
                    result.add(subCollection);
                }
                subCollection.add(s);
                count++;
                if (count == size) {
                    count = 0;
                    subCollection = null;
                }
            }
        }
        return result;
    }

}
