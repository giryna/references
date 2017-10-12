package qmo.lombok.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum StateLombok {

    ALABAMA("AL", 1),
    ALASKA("AK", 2),
    ARIZONA("AZ", 3),
    ARKANSAS("AR", 4),
    CALIFORNIA("CA", 5),
    COLORADO("CO", 6);

    private final String shortName;
    private final int stateIndex;
}