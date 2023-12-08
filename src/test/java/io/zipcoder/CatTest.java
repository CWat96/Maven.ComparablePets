package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void TestConstruction() {
        //Given
        String expectedName = "";
        //When
        Cat cat = new Cat(null);
        cat.setName(expectedName);
        String actualName = cat.getName();
        //Then
        Assert.assertEquals(expectedName, actualName);

    }
}
