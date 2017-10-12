package qmo.lombok.builder;

public class BuilderTest {

    public static void main(String[] args) {
        Applicant
                .newApplicant()
                .address("")
                .address("")
                .build();
    }
}
