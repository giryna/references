package qmo.slang.models.user;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {
    private final String name;
    private final Address address;
}
