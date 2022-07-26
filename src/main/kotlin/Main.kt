import kotlin.system.exitProcess

var water = 400
var milk = 540
var coffee = 120
var cups = 9
var money = 550

fun machineStatus() {
    println(
        "The coffee machine has:\n" +
                "$water ml of water\n" +
                "$milk ml of milk\n" +
                "$coffee g of coffee beans\n" +
                "$cups disposable cups\n" +
                "$money of money"
    )
}

fun buy() {
    println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:")
    when (readln()) {
        "1" -> {
            if (water >= 250 && coffee >= 16 && cups >= 1) {
                water -= 250
                coffee -= 16
                money += 4
                cups -= 1
                println("I have enough resources, making you a coffee!")
            } else {
                if (water < 250) println("Sorry, not enough water!")
                if (coffee < 16) println("Sorry, not enough coffee!")
                if (cups < 1) println("Sorry, not enough cups!")
            }
        }
        "2" -> {
            if (water >= 350 && coffee >= 20 && milk >= 75 && cups >= 1) {
                water -= 350
                milk -= 75
                coffee -= 20
                money += 7
                cups -= 1
                println("I have enough resources, making you a coffee!")
            } else {
                if (water < 350) println("Sorry, not enough water!")
                if (milk < 75) println("Sorry, not enough milk!")
                if (coffee < 20) println("Sorry, not enough coffee!")
                if (cups < 1) println("Sorry, not enough cups!")
            }
        }
        "3" -> {
            if (water >= 200 && coffee >= 12 && milk >= 100 && cups >= 1) {
                water -= 200
                milk -= 100
                coffee -= 12
                money += 6
                cups -= 1
                println("I have enough resources, making you a coffee!")
            } else {
                if (water < 200) println("Sorry, not enough water!")
                if (milk < 100) println("Sorry, not enough milk!")
                if (coffee < 12) println("Sorry, not enough coffee!")
                if (cups < 1) println("Sorry, not enough cups!")
            }
        }
        "back" -> main()
    }
}

fun fill() {
    println("Write how many ml of water do you want to add:")
    water += readln().toInt()
    println("Write how many ml of milk do you want to add")
    milk += readln().toInt()
    println("Write how many grams of coffee beans do you want to add:")
    coffee += readln().toInt()
    println("Write how many disposable cups of coffee do you want to add:")
    cups += readln().toInt()
}

fun take() {
    println("I gave you $money")
    money -= money
}

fun main() {
    do {
        println("\nWrite action (buy, fill, take, remaining, exit):")
        val option = readln()
        when (option) {
            "buy" -> buy()
            "fill" -> fill()
            "take" -> take()
            "remaining" -> machineStatus()
            "exit" -> exitProcess(1)
        }
    } while (option != "exit")
}