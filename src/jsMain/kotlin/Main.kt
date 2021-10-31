import androidx.compose.runtime.*
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Span
import org.jetbrains.compose.web.dom.Text
import org.jetbrains.compose.web.dom.TextArea
import org.jetbrains.compose.web.renderComposable

fun main() {
    renderComposable(rootElementId = "root") {
        App()
    }
}

@Composable
fun App() {
    var text by remember { mutableStateOf("") }
    val count = text.count()

    Div {
        TextArea(
            attrs = {
                onInput {
                    text = it.value
                }
            }
        )
    }
    Span {
        Text("Count: $count")
    }
}