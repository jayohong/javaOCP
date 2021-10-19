package com.lab.ocp.day04;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.DoubleSummaryStatistics;

public class ForLoopDemo5 {
    public static void main(String[] args) {
        //一年甲班學生國文與數學的成績
        int[][] exams={{100,90},{70,80},{40,100},{100,100},{80,50}};
//        IntSummaryStatistics stat = Arrays.stream(exams)
//                .mapToInt(exam -> exam[0])
//                .summaryStatistics();
        IntSummaryStatistics stat=Arrays.stream(exams)
                .mapToInt(exam->exam[0])
                .summaryStatistics();
        System.out.printf("國文平均: %.1f\n",stat.getAverage());
        IntSummaryStatistics stat1=Arrays.stream(exams)
                .mapToInt(exam->exam[1])
                .summaryStatistics();
        System.out.printf("數學平均: %.1f\n",stat1.getAverage());
        
        DoubleSummaryStatistics classAvg=Arrays.stream(exams)
                .mapToDouble(exam->Arrays.stream(exam).average().getAsDouble())
                .summaryStatistics();
        System.out.printf("班平均: %.1f\n",classAvg.getAverage());

        long count = Arrays.stream(exams)
                    .flatMapToInt(exam -> Arrays.stream(exam))
                    .filter(score -> score==100)
                    .count();
        System.out.printf("有 %d 個100分",count);
    }
}
