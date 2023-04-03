package aShopTest;

import org.testng.annotations.Test;

public class Function1 extends BaseTest {
    @Test (description = "Этот тест отвечает за открытие")
    public void test1(){
        System.out.println("Открытие сайта");
        System.out.println();
        System.out.println("Проверка продукта в корзине");
    }
}
