package uz.nurmatov.sonartest

import uz.nurmatov.sonartest.repo.CalculationRepository

interface CalculationViewModel {
    fun calculate(a: Int, b: Int, type: CalculationType): Int
}

class CalculationViewModelImpl(
    private val repository: CalculationRepository
) : CalculationViewModel {
    override fun calculate(a: Int, b: Int, type: CalculationType): Int {
        return when (type) {
            CalculationType.PLUS -> repository.plus(a, b)
            CalculationType.MINUS -> repository.minus(a, b)
            CalculationType.MULTIPLY -> repository.multiply(a, b)
            CalculationType.DIVIDE -> repository.divide(a, b)
        }
    }

}

enum class CalculationType {
    PLUS, MINUS, MULTIPLY, DIVIDE
}