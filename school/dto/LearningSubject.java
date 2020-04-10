package school.dto;

public class LearningSubject {
    private final String subject;
    private Double value;

    public LearningSubject(String subject, Double value) {
        this.subject = subject;
        this.value = value;
    }

    public String getSubject() {
        return subject;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }
}
