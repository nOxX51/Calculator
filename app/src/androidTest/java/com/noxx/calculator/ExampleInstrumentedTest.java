package com.noxx.calculator;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class ExampleInstrumentedTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void testAddition() {
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.buttonPlus)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.buttonEgal)).perform(click());

        onView(withId(R.id.text_field)).check(matches(withText("9.0")));
    }

    @Test
    public void testMoins() {
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.buttonMoins)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.buttonPlus)).perform(click());

        onView(withId(R.id.text_field)).check(matches(withText("10.0")));
    }
}
