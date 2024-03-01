// Sequences/Task5.kt
package sequencesExercise5

import listsExercise1.findMax

fun School.instructorsWithLargestClass(): Set<Instructor> {
  val maxClassSize = lessons
    .map { it.students.size }
    .maxOrNull()

  return lessons
    .filter { it.students.size == maxClassSize }
    .map { it.instructor }
    .toSet()
}