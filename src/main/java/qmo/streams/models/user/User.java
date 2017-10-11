package qmo.streams.models.user;

import lombok.Data;

@Data
public class User {
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private int age;
    private String sex;

    private Address address;
}
