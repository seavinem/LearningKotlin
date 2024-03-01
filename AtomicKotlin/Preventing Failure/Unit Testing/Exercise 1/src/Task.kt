// Tests/unittesting/UnitTestingSoln1.kt
package unitTestingExercise1
import creatingClassesExercise5.cap
import exceptionhandling.capture
import sealedclasses.Bus
import sealedclasses.Train
import sealedclasses.travel
import kotlin.test.*

class SealedClassTest {

    @Test
    fun `train travel`() {
        assertEquals("Train 1", travel(Train("1")))
    }

    @Test
    fun `bus travel`() {
        assertEquals("Bus 1: size 10", travel(Bus("1", 10)))
    }
}