import androidx.compose.material.MaterialTheme
import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

data class UserModel(var name: MutableState<String>) {
    constructor(name: String) : this(mutableStateOf(name))
}

@Composable
@Preview
fun userView(text: String, onValueChange: (String) -> Unit) {
    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            TextField(value = text, onValueChange = onValueChange)
        }
    }
}

fun main() = application {
    val user = UserModel("Hello, SE_03!")

    fun handleTextChanged(newText: String) {
        user.name.value = newText
    }

    Window(onCloseRequest = ::exitApplication, title = "SE_03") {
        userView(user.name.value, ::handleTextChanged)
    }
}
