// Summary2/Task8.kt
package summaryIIExercise8
import atomictest.eq
import summaryIIExercise7.intToRomanNumeralMap

val romanNumeralToIntMap: Map<String, Int> = mapOf(
  "I" to 1,
  "V" to 5,
  "X" to 10,
  "L" to 50,
  "C" to 100,
  "D" to 500,
  "M" to 1000
)

fun convertFromRoman(roman: String): Int {
  var result = 0
  var maximum = 0
  for (sign in roman.reversed()) {
    val currentNumber = romanNumeralToIntMap[sign.toString()]!!
    if(currentNumber >= maximum) {
      maximum = currentNumber
      result += currentNumber
    }
    else {
      result -= currentNumber
    }
  }

  return result
}

fun main() {
  convertFromRoman("XXIII") eq 23
  convertFromRoman("XLIV") eq 44
  convertFromRoman("C") eq 100
  convertFromRoman("MMXVIII") eq 2018
}