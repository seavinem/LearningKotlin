// Maps/Task1.kt
package mapsExercise1
import atomictest.eq
import kotlin.time.measureTime

class Contact(val name: String, val number: String) {
  override fun toString(): String {
    return "Contact('$name', '$number')"
  }
}

fun buildNumberToContactMap(contactList: List<Contact>): Map<String, Contact> {
  val contactMap = mutableMapOf<String, Contact>()
  for (contact in contactList) {
    contactMap += contact.number to contact
  }

  return contactMap
}

fun main() {
  val contactList = listOf(
    Contact("Miffy", "1-234-567890"),
    Contact("Cleo", "098-765-4321"),
  )
  val contactsByNumber = buildNumberToContactMap(contactList)
  contactsByNumber eq "{1-234-567890=Contact('Miffy', '1-234-567890'), " +
    "098-765-4321=Contact('Cleo', '098-765-4321')}"
}