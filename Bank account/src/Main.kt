var accountType = ""
var accountBalance = (0..1000).random()
val money = (0..1000).random()

fun main() {
    println("Welcome to your banking system.\n" +
            "What type of account would you like to create?\n" +
            "1. Debit account\n" +
            "2. Credit account\n" +
            "3. Checking account")

    var userChoice = 0

    while (accountType == "") {
        print("Choose an option (1, 2, 3): ")
        userChoice = readln().toInt()
        println("The selected option is $userChoice")

        accountType = when(userChoice) {
            1 -> "debit"
            2 -> "credit"
            3 -> "checking"
            else -> continue
        }
    }

    println("You have created a $accountType account.")

    println("The checking balance is $accountBalance dollars.")
    println("The amount you transferred is $money dollars.")


    var isSystemOpen = true
    var option = 0

    while (isSystemOpen) {
        println("What would you like to do?\n" +
                "1. Check bank account balance\n" +
                "2. Withdraw money\n" +
                "3. Deposit money\n" +
                "4. Close the app\n" +
                "Which option do you choose? (1, 2, 3 or 4): ")

        option = readln().toInt()
        when(option) {
            1 -> println("The current balance is $accountBalance dollars.")
            2 -> transfer("withdraw")
            3 -> transfer("deposit")
            4 -> {
                isSystemOpen = false
                println("The system is closed")
            }
            else -> continue
        }
    }
}

fun transfer(mode: String) {
    val transferAmount: Int
    when(mode) {
        "withdraw" -> {
            transferAmount = if(accountType == "debit") debitWithdraw(money)
            else withdraw(money)

            println("The amount you withdrew is $transferAmount dollars. ")
        }
        "deposit" -> {
            transferAmount = if(accountType == "credit") creditDeposit(money)
            else deposit(money)

            println("The amount you deposited is $transferAmount dollars.")
        }
        else -> return
    }
}


fun withdraw(amount: Int): Int {
    accountBalance -= amount
    println("You successfully withdrew $amount dollars.")
    println("The current balance is $accountBalance dollars.")
    return amount
}

fun debitWithdraw(amount: Int): Int {

    if(accountBalance == 0) {
        println("Error : Can't withdraw, no money on this account!")
        return accountBalance
    }
    else if (amount > accountBalance) {
        println("Not enough money on this account! The checking balance is $accountBalance dollars.")
        return 0
    }
    else {
        return withdraw(amount)
    }
}

fun deposit(amount: Int): Int {
    accountBalance += amount
    println("You successfully deposited $amount dollars." +
                " The current balance is $accountBalance dollars"
    )
    return amount
}

fun creditDeposit(amount: Int): Int {
    if(accountBalance == 0) {
        println("You don’t need to deposit anything in order" +
                " to pay off the account since it has already been paid off.\n")
        return accountBalance
    }
    else if (amount + accountBalance > 0) {
        println("Deposit failed, you tried to pay off an amount greater than the credit balance." +
                " The checking balance is $accountBalance dollars.")
        return 0
    }
    else if (amount == -accountBalance) {
        accountBalance = 0
        println("You have paid off this account!")
        return amount
    }
    else {
        return deposit(amount)
    }
}












