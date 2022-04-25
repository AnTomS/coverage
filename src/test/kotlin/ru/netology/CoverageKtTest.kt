package ru.netology

import org.junit.Test

import org.junit.Assert.*

class CoverageKtTest {

    @Test
    fun transferMastercardMaestroMin() {
        //arrange
        val enterTransaction = 5_000_00
        //act
        val result = transferMastercardMaestro(
            sumTransactionMastercardMaestro = enterTransaction
        )
        //assert
        assertEquals(10, result)
    }
    @Test
    fun transferMastercardMaestroMax() {
        val enterTransaction = 100_000_00
        val result=  transferMastercardMaestro(
            sumTransactionMastercardMaestro = enterTransaction
        )
        assertEquals(620, result)
    }

    @Test
    fun transferVisaMirMin() {
        val enterTransaction = 12_000
        val result = transferVisaMir(
            sumTransactionVisaMir = enterTransaction
        )
        assertEquals(3500, result)
    }

    @Test
    fun transferVisaMirMax() {
        val enterTransaction = 123_000_00
        val result = transferVisaMir(
            sumTransactionVisaMir = enterTransaction
        )
        assertEquals(922, result)
    }
}
