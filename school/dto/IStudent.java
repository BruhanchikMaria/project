package school.dto;

import java.util.List;

public interface IStudent extends IPeople {
    String getSchoolClass();
    List<LearningSubject> getLearningSubject();
    double getAvg();
}
