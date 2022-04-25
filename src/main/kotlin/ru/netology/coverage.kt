package ru.netology

const val MASTERCARD = "MasterCard"
const val MAESTRO = "Maestro"
const val VISA = "Visa"
const val MIR = "МИР"
const val VKPAY = "VKPay"



fun choicePaymentSystem(): String {
    print(
        "Введите номер для выбора платёжной системы: \n" +
                "1. MasterCard \n" +
                "2. Maestro \n" +
                "3. Visa \n" +
                "4. Мир \n" +
                "5. VKPay \n"
    )
    val choice = when (readln().toInt()) {
        1 -> {
            MASTERCARD
        }
        2 -> {
            MAESTRO
        }
        3 -> {
            VISA
        }
        4 -> {
            MIR
        }
        else -> {
            VKPAY
        }
    }
    return choice
}

fun transferMastercardMaestro(sumTransactionMastercardMaestro : Int): Int {

    return if (sumTransactionMastercardMaestro < 75_000_00) 0
    else (((sumTransactionMastercardMaestro * 0.006) + 20_00) / 100).toInt()
}


fun transferVisaMir(sumTransactionVisaMir : Int): Int {
    return if ((sumTransactionVisaMir * 0.0075).toInt() < 35_00) 35_00
    else ((sumTransactionVisaMir * 0.0075) / 100).toInt()
}

fun moneyTransfer(): Int {
    val amountKop = when (choicePaymentSystem()) {
        MASTERCARD -> transferMastercardMaestro(5_000_00)
        MAESTRO -> transferMastercardMaestro(100_000_00)
        VISA -> transferVisaMir(12_000)
        MIR -> transferVisaMir(123_000_00)
        else -> 0
    }
    return amountKop
}
fun main() {

    println("Комиссия за перевод ${moneyTransfer()} коп.")
}
