package com.tamnd.suzume

import com.tamnd.suzume.navigation.TopLevelDestination
import org.junit.Assert.assertEquals
import org.junit.Test

class SmokeTest {
    @Test
    fun `four top level destinations, home first`() {
        assertEquals(4, TopLevelDestination.entries.size)
        assertEquals(TopLevelDestination.Home, TopLevelDestination.entries.first())
    }
}
