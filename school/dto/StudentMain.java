package school.dto;

import java.util.ArrayList;
import java.util.List;

public class StudentMain {
    public static void main(String[] args) {
        LearningSubject chemistry= new LearningSubject("Chemistry", 7.0);
        LearningSubject maths= new LearningSubject("Maths",8.3);
        LearningSubject English= new LearningSubject("English",10.0);



        StudentStream student=new StudentStream("Vasiliev Vasilii Vasulevich");
        student.setSchoolClass("10");
        student.addLearningSubject(chemistry);
        student.addLearningSubject(maths);
        student.addLearningSubject(English);
        System.out.println("FIO"+ student.getFIO());
        System.out.println("Class: "+student.getSchoolClass());

        System.out.println("Average: "+ student.getAvg());






        List <LearningSubject> list=new ArrayList<>();

    }
}
