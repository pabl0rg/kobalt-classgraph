package com.guatec.plugin.classgraph;

import org.testng.annotations.*;
import org.testng.Assert.*;

/**
 * Created by juanliska on 1/11/16.
 */
public class ExampleTest {
    @Test
    public void shouldBeOk(){
        Example example = new Example();
        assert(example.isOk());
    }
}
