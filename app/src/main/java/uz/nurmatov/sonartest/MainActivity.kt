package uz.nurmatov.sonartest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import uz.nurmatov.sonartest.repo.CalculationRepository
import uz.nurmatov.sonartest.repo.CalculationRepositoryImpl
import uz.nurmatov.sonartest.ui.theme.SonarTestTheme
import kotlin.random.Random

class MainActivity : ComponentActivity() {
    private val repository: CalculationRepository = CalculationRepositoryImpl()
    private val viewModel: CalculationViewModel = CalculationViewModelImpl(repository)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SonarTestTheme {
                // A surface container using the 'background' color from the theme
                Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colors.background) {
                    Greeting(viewModel)
                }
            }
        }
    }
}

@Composable
fun Greeting(viewModel: CalculationViewModel) {
    val a = Random(20).nextInt()
    val b = Random(20).nextInt()

    Column {
        Text(text = "$a + $b = ${viewModel.calculate(a, b, CalculationType.PLUS)}")
        Text(text = "$a - $b = ${viewModel.calculate(a, b, CalculationType.MINUS)}")
        Text(text = "$a * $b = ${viewModel.calculate(a, b, CalculationType.MULTIPLY)}")
        Text(text = "$a / $b = ${viewModel.calculate(a, b, CalculationType.DIVIDE)}")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SonarTestTheme {
//        Greeting("Android")
    }
}
