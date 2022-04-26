package ru.netology

import org.junit.Test

import org.junit.Assert.*

class CoverageKtTest {

    @Test
    fun transferMastercardMaestroMin() {
        //arrange
        val enterTransaction = 5_000_00
        //act
        val result = transferMastercardMaestro(sumTransactionMastercardMaestro = enterTransaction)
        //assert
        assertEquals(0, result)
    }

    @Test
    fun transferMastercardMaestroMax() {
        //arrange
        val enterTransaction = 100_000_00
        //act
        val result = transferMastercardMaestro(sumTransactionMastercardMaestro = enterTransaction)
        //assert
        assertEquals(620, result)
    }

    @Test
    fun transferVisaMirMin() {
        //arrange
        val enterTransaction = 12_000
        //act
        val result = transferVisaMir(sumTransactionVisaMir = enterTransaction)
        //assert
        assertEquals(3500, result)
    }

    @Test
    fun transferVisaMirMax() {
        //arrange
        val enterTransaction = 123_000_00
        //act
        val result = transferVisaMir(sumTransactionVisaMir = enterTransaction)
        //assert
        assertEquals(922, result)
    }

    @Test
    fun moneyTransferMASTERCARD() {
        //arrange
        val choice = MASTERCARD
        //act
        val amountKop = moneyTransfer(MASTERCARD)
        //assert
        assertEquals(922, amountKop)
    }

    @Test
    fun moneyTransferMAESTRO() {
        //arrange
        val choice = MAESTRO
        //act
        val amountKop = moneyTransfer(MAESTRO)
        //assert
        assertEquals(100, amountKop)
    }

    @Test
    fun moneyTransferVISA() {
        //arrange
        val choice = VISA
        //act
        val amountKop = moneyTransfer(VISA)
        //assert
        assertEquals(200, amountKop)
    }

    @Test
    fun moneyTransferMIR() {
        //arrange
        val choice = MIR
        //act
        val amountKop = moneyTransfer(MIR)
        //assert
        assertEquals(400, amountKop)
    }

    @Test
    fun moneyTransferVKPAY() {
        //arrange
        val choice = VKPAY
        //act
        val amountKop = moneyTransfer(VKPAY)
        //assert
        assertEquals(500, amountKop)
    }
}


