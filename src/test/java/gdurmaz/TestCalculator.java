package gdurmaz;

import org.junit.*;

import static org.junit.Assert.*;

/**
 * @author Gaye DURMAZ
 * @date 7/8/2020
 */
public class TestCalculator {

    Calculator calculator;
    int firstNumber;
    int secondNumber;
    Integer sumResult;
    Integer multiplyResult;

    // Class metodları static olmalı.
    @BeforeClass
    public static void setUpTestClass(){
        System.out.println("Test class'ı çalıştığında bir kere çalışan BeforeClass anotasyonlu metod çalıştı!");
    }

    @Before
    public void setUpTest(){
        // Testlerde kullanılacak değişkenlerin oluşturulduğu metoddur.
        // Her test metodundan önce çalışır.

        calculator = new Calculator();
        firstNumber = 8;
        secondNumber = 15;
        System.out.println("Before metodu çalıştı. Değer ataması işlemleri yapıldı.");

    }

    @Test
    public void testSumMethod(){
        sumResult = firstNumber + secondNumber;
        Integer sum = calculator.sum(firstNumber, secondNumber);

        //Parametre sırası: Beklenen değer, Test edilen değer
        assertEquals(sumResult, sum);
        assertNotNull(sum);
        System.out.println("Toplama işlemi test metodu çalıştı.");
    }

    @Test
    public void testMulltiplyMethod(){
        multiplyResult = firstNumber * secondNumber;
        Integer multiply= calculator.multiply(firstNumber, secondNumber);

        //Parametre sırası: Beklenen değer, Test edilen değer
        assertEquals(multiplyResult, multiply);
        assertNotNull(multiply);
        System.out.println("Çarpma işlemi test metodu çalıştı.");
    }

    @After
    public void tearDownTest(){
        // Testlerde kullanılacak değişkenlerin silindiği metoddur.
        // Her test metodundan sonra çalışır.

        calculator = null;
        sumResult = null;
        multiplyResult = null;

    }

    @AfterClass
    public static void tearDownTestClass(){
        System.out.println("Test class'ı çalıştığında bir kere çalışan AfterClass anotasyonlu metod çalıştı!");
    }
}
