package aShopTest;

import org.testng.annotations.BeforeTest;

public class BaseTest {
    @BeforeTest
    public void openSite(){
        System.out.println("Открытие сайта");
    }
}
