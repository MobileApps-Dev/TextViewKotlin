package example.com.textviewkotlin

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.text.TextUtils
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    //Define textView
    lateinit var txt_message: TextView
    lateinit var btn_click: Button
    lateinit var btn_radio_checkbox: Button
    lateinit var btn_edit_text: Button
    lateinit var btn_spinner: Button
    lateinit var btn_seekbar: Button


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialization View's
        txt_message = findViewById(R.id.txt_message) as TextView
        btn_click = findViewById(R.id.btn_click) as Button
        btn_radio_checkbox = findViewById(R.id.btn_radio_checkbox) as Button
        btn_edit_text = findViewById(R.id.btn_edit_text) as Button
        btn_spinner = findViewById(R.id.btn_spinner) as Button
        btn_seekbar = findViewById(R.id.btn_seekbar) as Button


        //Set message to textView
        txt_message.text = "Welcome to Kotlin. Kotlin is new language of android application development"
        // text as a single line
        txt_message.setSingleLine()
        // add marquee to textview
        txt_message.ellipsize = TextUtils.TruncateAt.MARQUEE
        //marquee as continue
        txt_message.marqueeRepeatLimit = -1
        txt_message.isSelected = true


        //onCLick on Button
        btn_click.setOnClickListener(View.OnClickListener {
            //Set message to Button
            btn_click.text = "Clicked"

            Toast.makeText(this, "only click", Toast.LENGTH_LONG).show()

        })
        //onLongCLick on Button
        btn_click.setOnLongClickListener(View.OnLongClickListener {
            //Set message to Button
            btn_click.text = "Long Clicked"
            Toast.makeText(this, "Long click", Toast.LENGTH_LONG).show()
            //return value
            true
        })


        //OnClick  btn_radio_checkbox open new Activity using Intent
        btn_radio_checkbox.setOnClickListener(View.OnClickListener {
            val intent = Intent(this, RadioAndCheckBoxActivity::class.java)
            startActivity(intent)
        })

        //OnClick on btn_edit_text to open EditTextActivity
        btn_edit_text.setOnClickListener(View.OnClickListener {

            val intent = Intent(this, EditTextActivity::class.java)
            startActivity(intent)
        })

        //OnClick on btn_edit_text to open SpinnerActivity
        btn_spinner.setOnClickListener({
            val intent = Intent(this, SpinnerActivity::class.java)
            startActivity(intent)

        })

        //OnClick on btn_edit_text to open SeekBarActivity
        btn_seekbar.setOnClickListener({
            val intent = Intent(this, SeekBarActivity::class.java)
            startActivity(intent)
        })
    }
}
