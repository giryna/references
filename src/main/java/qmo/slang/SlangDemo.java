package qmo.slang;

import lombok.val;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import qmo.slang.models.user.UserType;

import static javaslang.API.*;
import static javaslang.Predicates.isIn;
import static qmo.slang.models.user.UserType.*;

public class SlangDemo {

    private WebElement userLocator;
    private WebElement adminUserLocator;
    private WebElement memberUserLocator;
    private WebElement vendorUserLocator;
    private WebElement superAdminLocator;
    private WebElement searchButton;

    public void searchForUser(UserType user) {
        WebElement userLocator;

        switch (user) {
            case ADMIN:
                userLocator = adminUserLocator;
                break;
            case MEMBER:
                userLocator = memberUserLocator;
                break;
            case VENDOR:
                userLocator = memberUserLocator;
                break;
            default:
                userLocator = superAdminLocator;
                break;
        }

        select(userLocator);
        click(searchButton);
    }


    public void searchForUser8(UserType user) {
        val userLocator = Match(user).of(
                Case($(ADMIN), adminUserLocator),
                Case($(MEMBER), memberUserLocator),
                Case($(VENDOR), memberUserLocator),
                Case($(), superAdminLocator)
        );

        select(userLocator);
        click(searchButton);
    }

    public void doActionFor(UserType user) {
        Match(user).of(
                Case(isIn(ADMIN, SUPER_ADMIN), obj -> run(this::selectAdminUser)),      // multiple conditions
                Case($(MEMBER), obj -> run(this::selectMemberUser)),                    // side-effects
                Case($(), () -> {throw new IllegalArgumentException("Invalid user");})  // exception
        );
    }

    private void selectAdminUser(){
    }

    private void selectMemberUser(){
    }

    private void click(WebElement userLocator) {
    }

    private void select(WebElement userLocator) {
    }

}
