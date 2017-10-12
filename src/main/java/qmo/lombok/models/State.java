package qmo.lombok.models;

public enum State {

    ALABAMA("AL", 1),
    ALASKA("AK", 2),
    ARIZONA("AZ", 3),
    ARKANSAS("AR", 4),
    CALIFORNIA("CA", 5),
    COLORADO("CO", 6);

    private final String shortName;
    private final int stateIndex;

    State(String shortName, int stateIndex) {
        this.shortName = shortName;
        this.stateIndex = stateIndex;
    }

    public String getShortName() {
        return shortName;
    }

    public int getStateIndex() {
        return stateIndex;
    }
}