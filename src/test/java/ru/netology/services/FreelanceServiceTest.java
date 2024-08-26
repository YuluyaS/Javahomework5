package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FreelanceServiceTest {


    @ParameterizedTest
    @CsvSource({
            "3, 10000, 3000, 20000",
            "2, 100000, 60000, 150000"
    })
    public void test1(int expected, int income, int expenses, int threshold) {

        //int expected = 3;
        FreelanceService freelancer = new FreelanceService();
        int actual = freelancer.calculate(income, expenses, threshold); //

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //public void test2() {

    //    int expected = 2;
    //    FreelanceService freelancer = new FreelanceService();
    //    int actual = freelancer.calculate(100000, 60000, 150000); //

    //    Assertions.assertEquals(expected, actual);
    //}
}