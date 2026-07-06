package com.tamnd.suzume.engine

import org.junit.Assert.assertEquals
import org.junit.Test

class EngineTest {
    @Test
    fun `reports its version`() {
        assertEquals("0.1.0", Engine().version())
    }
}
