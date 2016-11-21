package com.noxx.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */

public class ExampleUnitTest {

    @Test
    public void addition_isCorrect() throws Exception {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void shouldDoAdditionIsCorrectWhenEqualButtonIsUsed() {
        //instancier la classe qui sert a faire les test
        MainActivity calculator = new MainActivity();
        calculator.chiffreClick("5");
        calculator.plusClick();
        calculator.chiffreClick("4");
        calculator.egalClick();
        assertEquals();


    }

    @Test
    public void shouldDoAdditionIsCorrectWhenEqualButtonIsUsed() {
        //instancier la classe qui sert a faire les test
        MainActivity calculator = new MainActivity();
        calculator.chiffreClick("15");
        calculator.moinsClick();
        calculator.chiffreClick("5");
        calculator.plusClick();
        assertEquals();


    }
}