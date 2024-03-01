// Tests/unittesting/UnitTestingSoln3.kt
package unitTestingExercise3
import classdelegation.Controls
import classdelegation.SpaceShipControls
import kotlin.test.*

infix fun <T> T.aeq(actual: T) =
  assertEquals(this, actual)

class SpaceShipControlsTest {

  private val controls = SpaceShipControls()
  init { println("init") }

  @Test
  fun up() {
    (0..10).forEach{ "up $it" aeq controls.up(it) }
  }

  @Test
  fun down() {
    (0..10).forEach{ "down $it" aeq controls.down(it) }
  }

  @Test
  fun left() {
    (0..10).forEach{ "left $it" aeq controls.left(it) }
  }

  @Test
  fun right() {
    (0..10).forEach{ "right $it" aeq controls.right(it) }
  }

  @Test
  fun forward() {
    (0..10).forEach{ "forward $it" aeq controls.forward(it) }
  }

  @Test
  fun back() {
    (0..10).forEach{ "back $it" aeq controls.back(it) }
  }

  @Test
  fun turboBoost() {
    "turbo boost" aeq controls.turboBoost()
  }

}