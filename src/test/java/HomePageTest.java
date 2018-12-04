import common.BaseWebTest;
import org.junit.Test;

public class HomePageTest extends BaseWebTest {

    @Test
    public void HM_01() {
        steps("Login Github and create New Gist");
        homePage.clickSignInBtn();
        homePage.clickOption1();
        homePage.clickNewGist();
        homePage.inputNewGistField();
        homePage.inputGistDesc();
        homePage.clickSubmitGistBtn();

        steps("Edit Gist from list");
        homePage.clickEditGistBtn();
        homePage.inputUpdateNewGistField();
        homePage.clickUpdateGistBtn();

        steps("Delete Gist");
        homePage.clickDeleteGistBtn();

        steps("See List Gist");
        homePage.clickUsernameGist();
}

}
