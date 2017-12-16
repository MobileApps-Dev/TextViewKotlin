package example.com.textviewkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView

class SpinnerActivity : AppCompatActivity() {
    //Declare view
    lateinit var spn_data: Spinner
    lateinit var txt_result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        //initialization view ID
        txt_result = findViewById(R.id.txt_result) as TextView
        spn_data = findViewById(R.id.spn_data) as Spinner

        //create String[]
        var arrayData = arrayOf("Marathi", "Hindi", "English")
        //array set to arrayAdapter
        spn_data.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, arrayData)

        //spinner onItemSelectedListener
        spn_data.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onNothingSelected(p0: AdapterView<*>?) {
                txt_result.text = "please Select an option "
            }

            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, p3: Long) {
                //spinner selected data set to view
                txt_result.text = arrayData.get(position)
            }
        }
    }
}
