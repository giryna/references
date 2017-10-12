package qmo.lombok;

import qmo.lombok.models.AutomationEngineer;
import qmo.lombok.models.AutomationEngineerLombok;

public class AutomationEngineerTest {

    public static void main(String[] args) {
        AutomationEngineer automationEngineer = new AutomationEngineer("me", true, true);
        String s = automationEngineer.getName();
        boolean b = automationEngineer.likesToBuildFrameworks();
        boolean b1 = automationEngineer.hatesBDD();

        AutomationEngineerLombok automationEngineerLombok = new AutomationEngineerLombok("me", true, true);
        boolean b2 = automationEngineerLombok.isHatesBDD();
        boolean b3 = automationEngineerLombok.isLikesToBuildFrameworks();
        String s1 = automationEngineerLombok.getName();
    }
}
