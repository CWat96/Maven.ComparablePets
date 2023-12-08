package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void TestConstruction() {
        //Given
        String expectedName = "";
        //When
        Cat cat = new Cat(expectedName);
        String actualName = cat.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);

    }

    @Test
    public void TestConstruction1() {
        //Given
        String expectedName = "Thomas";
        //When
        Cat cat = new Cat(expectedName);
        String actualName = cat.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);

    }
}
