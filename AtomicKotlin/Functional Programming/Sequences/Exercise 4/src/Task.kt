// Sequences/Task4.kt
package sequencesExercise4

fun School.favoriteInstructor(student: Student): Instructor? =
  lessons
    .filter { student in it.students }
    .maxByOrNull {
      lessons
        .filter { x -> student in x.students }
        .count { y -> y.instructor == it.instructor }
    }
      ?.instructor