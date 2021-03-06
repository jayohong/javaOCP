package com.lab.ocp.day09;

//import com.sun.corba.se.impl.ior.OldJIDLObjectKeyTemplate;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Set;
import static java.util.stream.Collectors.partitioningBy;


public class ExamDemo {
    public static void main(String[] args) {
        Exam e1=new Exam("國文",100);
        Exam e2=new Exam("數學",80);
        Exam e3=new Exam("英文",50);
        Exam e4=new Exam("社會",100);
        Exam e5=new Exam("自然",40);
        //Exam e4=new Exam("英文",100);//重複內容
        Set<Exam> exams=new HashSet<>();
        exams.add(e1);exams.add(e2);exams.add(e3);exams.add(e4);exams.add(e5);
        System.out.println(exams); 
        
        IntSummaryStatistics stat=exams.stream()
                .mapToInt(s -> s.getScore())
                .summaryStatistics();
        System.out.println(stat);
        System.out.println(
            exams.stream().collect(partitioningBy(e -> e.getScore()>=60))
        );
        
        Map <Boolean, List<Exam>> map =exams.stream().collect(partitioningBy(e -> e.getScore()>=60));
        System.out.println(map);
        
        
    }
}
