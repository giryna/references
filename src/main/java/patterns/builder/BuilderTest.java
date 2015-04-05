package patterns.builder;

/**
 * Created by taras on 4/4/15.
 */
public class BuilderTest {
    public static void main(String[] args) {
        Person newPerson = new Person.Builder()
                .setName("Tom Nyskelo")
                .setAge(40)
                .setEmail("tom@mail")
                .setMaritalStatus("married")
                .setOccupation("IT")
        .build();

        System.out.println(newPerson);
    }
}
