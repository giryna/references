package qmo.lombok.builder;

public class Applicant {

    private String name;
    private int age;
    private String email;
    private String country;
    private String city;
    private String address;
    private int zip;
    private String education;

    private Applicant(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        this.country = builder.country;
        this.city = builder.city;
        this.address = builder.address;
        this.zip = builder.zip;
        this.education = builder.education;
    }

    public static Builder newApplicant() {
        return new Builder();
    }

    public static final class Builder {
        private String name;
        private int age;
        private String email;
        private String country;
        private String city;
        private String address;
        private int zip;
        private String education;

        private Builder() {
        }

        public Applicant build() {
            return new Applicant(this);
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(int age) {
            this.age = age;
            return this;
        }

        public Builder email(String email) {
            this.email = email;
            return this;
        }

        public Builder country(String country) {
            this.country = country;
            return this;
        }

        public Builder city(String city) {
            this.city = city;
            return this;
        }

        public Builder address(String address) {
            this.address = address;
            return this;
        }

        public Builder zip(int zip) {
            this.zip = zip;
            return this;
        }

        public Builder education(String education) {
            this.education = education;
            return this;
        }
    }
}
