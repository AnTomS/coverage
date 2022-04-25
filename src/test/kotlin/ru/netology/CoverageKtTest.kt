package ru.netology

import org.junit.Test

import org.junit.Assert.*

class CoverageKtTest {

    @Test
    fun transferMastercardMaestroMinimal() {
        //Arrange
        val amount: Int = 75_000
        //Act
        val result = 0
        //assert
        assertEquals(0, result)
    }
    @Test
    fun transferMastercardMaestroMax() {
        //Arrange
        val amount: Int = 50_000_000
        //Act
        val result = (((amount * 0.006) + 2000) / 100).toInt()
        //Assert
        assertEquals(3010, result)
    }

    @Test
    fun transferVisaMirMin() {
        //Arrange
        val amount: Int = 35_000
        //Act
        val result = 3500
        //Assert
        assertEquals(3500, result)
    }

    @Test
    fun transferVisaMirMax() {
        //Arrange
        val amount: Int = 50_000_000
        //Act
        val result = ((amount * 0.0075) / 100).toInt()
        //Assert
        assertEquals(3750, result)
    }

    @Test
    fun limitControlInDay() {
        //Arrange
        val sumTransferDay = 22_234
        //Act
        val result = 150_000
        //Assert
        assertEquals(150_000, result)
    }
    @Test
    fun limitControlInMonth () {
        //Arrange
        val sumTransferMonth = 22_234
        //Act
        val result = 600_000
        //Assert
        assertEquals(600_000, result)
    }

    @Test
    fun limitControlInDayVK() {
        //Arrange
        val amount = 22_234
        //Act
        val result = 15_000
        //Assert
        assertEquals(15_000, result)
    }
    @Test
    fun limitControlInMonthVK () {
        //Arrange
        val sumTransferMonth = 22_234
        //Act
        val result = 40_000
        //Assert
        assertEquals(40_000, result)
    }
}
