package qmo.lombok.models;

public class AutomationEngineer {

    private final String name;
    private final boolean likesToBuildFrameworks;
    private final boolean hatesBDD;

    public AutomationEngineer(String name, boolean likesToBuildFrameworks,
                              boolean hatesBDD) {
        this.name = name;
        this.likesToBuildFrameworks = likesToBuildFrameworks;
        this.hatesBDD = hatesBDD;
    }

    public String getName() {return name;}

    public boolean likesToBuildFrameworks() { return likesToBuildFrameworks; }

    public boolean hatesBDD() { return hatesBDD; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AutomationEngineer that = (AutomationEngineer) o;

        if (likesToBuildFrameworks != that.likesToBuildFrameworks) return false;
        if (hatesBDD != that.hatesBDD) return false;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (likesToBuildFrameworks ? 1 : 0);
        result = 31 * result + (hatesBDD ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "AutomationEngineer{" +
                "name=" + name +
                ", likesToBuildFrameworks=" + likesToBuildFrameworks +
                ", hatesBDD=" + hatesBDD +
                '}';
    }
}
