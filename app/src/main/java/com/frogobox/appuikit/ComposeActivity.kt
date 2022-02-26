package com.frogobox.appuikit

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.frogobox.appuikit.model.People
import com.frogobox.appuikit.ui.theme.FrogoAndroidUIKitTheme
import com.frogobox.recycler.compose.FrogoLazyColumn
import com.frogobox.uikit.DataBuilder
import com.frogobox.uikit.FrogoComposeListItemType1

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            FrogoAndroidUIKitTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    FrogoLazyColumn(setupData()) { data ->
                        FrogoComposeListItemType1(DataBuilder(textTitle = data.name)) {
                            startActivity(Intent(this@ComposeActivity, MainActivity::class.java))
                        }
                    }
                }
            }
        }
    }

    private fun setupData(): MutableList<People> {
        val data = mutableListOf<People>()
        data.add(People("Amir", "Programmer"))
        data.add(People("Amir", "Programmer"))
        data.add(People("Amir", "Programmer"))
        data.add(People("Amir", "Programmer"))
        data.add(People("Amir", "Programmer"))
        return data
    }

}

@Composable
fun Greeting(text: String) {
    Text(text = text)
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun DefaultPreview() {
    FrogoAndroidUIKitTheme {
        Greeting("Android")
    }
}