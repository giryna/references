package patterns.builder;

/**
 * Created by taras on 4/4/15.
 */
public class Person {

    private String name;
    private int age;
    private String email;
    private String maritalStatus;
    private String occupation;

    Person(Builder personBuilder){
        this.name = personBuilder.name;
        this.age = personBuilder.age;
        this.email = personBuilder.email;
        this.maritalStatus = personBuilder.maritalStatus;
        this.occupation = personBuilder.occupation;
    }

    public String getEmail() {
        return email;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public String getOccupation() {
        return occupation;
    }

    public static class Builder {
        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setMaritalStatus(String maritalStatus) {
            this.maritalStatus = maritalStatus;
            return this;
        }

        public Builder setOccupation(String occupation) {
            this.occupation = occupation;
            return this;
        }

        private String name;
        private int age;
        private String email;
        private String maritalStatus;
        private String occupation;

        Person build(){
            return new Person(this);
        }
    }

    @Override
    public String toString(){
        return this.name + " " + this.email + " " + this.age + " " + this.maritalStatus + " " + this.occupation;
    }
}
