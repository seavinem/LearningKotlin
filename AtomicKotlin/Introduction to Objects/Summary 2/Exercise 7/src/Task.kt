// Summary2/Task7.kt
package summaryIIExercise7
import atomictest.eq

val intToRomanNumeralMap: Map<Int, String> = mapOf(
  1 to "I",
  5 to "V",
  10 to "X",
  50 to "L",
  100 to "C",
  500 to "D",
  1000 to "M"
)



fun convertToRoman(number: Int): String {
  var num = number
  val result = StringBuilder()

  for ((key, value) in intToRomanNumeralMap.entries.reversed()) {
    while (num >= key) {
      num -= key
      result.append(value)
    }
  }

  return result.toString()
}


fun main() {
  convertToRoman(23) eq "XXIII"
  convertToRoman(44) eq "XLIV"
  convertToRoman(100) eq "C"
  convertToRoman(2018) eq "MMXVIII"
}