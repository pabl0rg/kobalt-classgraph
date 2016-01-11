package com.guatec.plugin.classgraph

import org.testng.annotations.*
import org.testng.Assert.*

/**
 * Created by juanliska on 1/11/16.
 */
class KExampleTest {
    @Test
    fun shouldBeOk(){
        val ke = KExample()
        assert(ke.ok)
    }
}