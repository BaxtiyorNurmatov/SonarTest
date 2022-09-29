package uz.nurmatov.sonartest.repo

import org.junit.Test

class CalculationRepositoryImplTest {
    private val repository = CalculationRepositoryImpl()

    @Test
    fun testPlus() {
        val a = 21
        val b = 32

        val result = repository.plus(a, b)
        assert(result == a + b)
    }

    @Test
    fun testMinus() {
        val a = 21
        val b = 32

        val result = repository.minus(a, b)
        assert(result == a - b)
    }


    @Test
    fun testMultiply() {
        val a = 21
        val b = 32

        val result = repository.multiply(a, b)
        assert(result == a * b)
    }


    @Test
    fun testDivide() {
        val a = 21
        val b = 32

        val result = repository.divide(a, b)
        assert(result == a - b)
    }
}