package qmo.streams.models.user;

import lombok.Data;

@Data
public class Address {
    private String country;
    private String city;
    private String street;
    private String building;
    private int zip;
}
