package com.zoriana.webdriver.tests.slider;

import com.zoriana.webdriver.tests.base.BaseTests;
import org.testng.annotations.Test;
import com.zoriana.webdriver.pages.SliderPage;

import static org.testng.Assert.assertEquals;

public class SliderTests extends BaseTests {

    @Test
    public void testHorizontalSlider(){
        String value = "4";
        SliderPage sliderPage = homePage.clickSlider();
        sliderPage.moveSliderBar(value);
        assertEquals(sliderPage.getResult(), value, "Slider value is not correct");
    }
}
