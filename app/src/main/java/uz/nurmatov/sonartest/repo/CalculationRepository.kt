package uz.nurmatov.sonartest.repo

interface CalculationRepository {
    fun plus(a: Int, b: Int): Int
    fun minus(a: Int, b: Int): Int
    fun multiply(a: Int, b: Int): Int
    fun divide(a: Int, b: Int): Int
}

class CalculationRepositoryImpl : CalculationRepository {
    override fun plus(a: Int, b: Int): Int {
        return a + b
    }

    override fun minus(a: Int, b: Int): Int {
        return a - b
    }

    override fun multiply(a: Int, b: Int): Int {
        return a * b
    }

    override fun divide(a: Int, b: Int): Int {
        return a - b
    }
}