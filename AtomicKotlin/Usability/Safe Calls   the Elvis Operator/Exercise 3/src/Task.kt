// SafeCallsAndElvis/Task3.kt
package safeCallsAndTheElvisOperatorExercise3

data class Client(
  val name: String,
  val personalInfo: PersonalInfo? = null)

data class PersonalInfo(
  val email: String? = null,
  val address: Address? = null)

data class Address(
  val country: String? = null,
  val city: String? = null,
  val street: String? = null)



fun Client.fullInfo(): String =
  "name: ${name}\n" +
  "email: ${personalInfo?.email ?: "Unspecified"}\n" +
  "country: ${personalInfo?.address?.country ?: "Unspecified"}\n" +
  "city: ${personalInfo?.address?.city ?: "Unspecified"}\n" +
  "street: ${personalInfo?.address?.street ?: "Unspecified"}"


fun main() {
  val alice = Client("Alice",
    PersonalInfo(
      email = "alice@gmail.com",
      address = Address("Germany", "Munich")))
  println(alice.fullInfo())
  println("---")
  println(Client("Bob").fullInfo())
}
/* Output:
name: Alice
email: alice@gmail.com
country: Germany
city: Munich
street: Unspecified
---
name: Bob
email: Unspecified
country: Unspecified
city: Unspecified
street: Unspecified
*/