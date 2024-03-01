// Tests/unittesting/UnitTestingSoln2.kt
package unitTestingExercise2
import interfaces.Desktop
import interfaces.DeepThought
import interfaces.Quantum
import kotlin.test.*

class DesktopComputerTest {

    @Test
    fun `prompt test`() {
        assertEquals("Hello!", Desktop().prompt())
    }

    @Test
    fun `calculateAnswer test`() {
        assertEquals(11, Desktop().calculateAnswer())
    }

}

class DeepThoughtComputerTest {

    @Test
    fun `prompt test`() {
        assertEquals("Thinking...", DeepThought().prompt())
    }

    @Test
    fun `calculateAnswer test`() {
        assertEquals(42, DeepThought().calculateAnswer())
    }

}

class QuantumComputerTest {

    @Test
    fun `prompt test`() {
        assertEquals("Probably...", Quantum().prompt())
    }

    @Test
    fun `calculateAnswer test`() {
        assertEquals(-1, Quantum().calculateAnswer())
    }

}