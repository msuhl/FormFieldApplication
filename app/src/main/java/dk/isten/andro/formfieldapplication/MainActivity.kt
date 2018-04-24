package dk.isten.andro.formfieldapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TextInputLayout
import android.util.Log
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        username.setOnFocusChangeListener { view, hasFocus ->
            if(!hasFocus && ((username as EditText).text).toString().isBlank()){
                Log.d("onFocusChangeListener", "unfocused")
                (usernameWrapper as TextInputLayout).error = "Svend"
            }else{
                Log.d("onFocusChangeListener", "focused")
                (usernameWrapper as TextInputLayout).error = null
            }
        }
    }
}
