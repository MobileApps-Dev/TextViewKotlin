package example.com.textviewkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class EditTextActivity : AppCompatActivity() {

    //Define View here
    lateinit var edt_data: EditText
    lateinit var txt_result: TextView
    lateinit var btn_show: Button
    lateinit var name: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit_text)

        //initialization View's Id
        edt_data = findViewById(R.id.edt_data) as EditText
        txt_result = findViewById(R.id.txt_result) as TextView
        btn_show = findViewById(R.id.btn_show) as Button

        //Onclick on button
        btn_show.setOnClickListener({
            // Get value from EditText
            name = edt_data.text.toString();
            //check view is empty or not
            if (name.isEmpty()) {
                //Display toast
                Toast.makeText(this, "Empty", Toast.LENGTH_SHORT).show()
            } else {
                // set Value to TextView
                txt_result.text = name
            }
        })

        // Add TextChangeListener to edit test
        edt_data.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(p0: Editable?) {
            }

            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
            }

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                //set vaue to textView on every word change
                txt_result.text = p0
            }

        })
    }
}
