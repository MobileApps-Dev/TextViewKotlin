package example.com.textviewkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.*

class RadioAndCheckBoxActivity : AppCompatActivity() {

    //Define View
    lateinit var rdg_gender: RadioGroup
    lateinit var rdb_male: RadioButton
    lateinit var rdb_female: RadioButton
    lateinit var chk_lag_c: CheckBox
    lateinit var chk_lag_cpp: CheckBox
    lateinit var chk_lag_java: CheckBox
    lateinit var chk_lag_android: CheckBox
    lateinit var btn_submit: Button
    lateinit var txt_result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_and_check_box)

        //initialization View ID
        rdg_gender = findViewById(R.id.rdg_gender) as RadioGroup
        rdb_male = findViewById(R.id.rdb_male) as RadioButton
        rdb_female = findViewById(R.id.rdb_female) as RadioButton
        chk_lag_c = findViewById(R.id.chk_lag_c) as CheckBox
        chk_lag_cpp = findViewById(R.id.chk_lag_cpp) as CheckBox
        chk_lag_java = findViewById(R.id.chk_lag_java) as CheckBox
        chk_lag_android = findViewById(R.id.chk_lag_android) as CheckBox
        btn_submit = findViewById(R.id.btn_submit) as Button
        txt_result = findViewById(R.id.txt_result) as TextView

        //OnClick on button
        btn_submit.setOnClickListener(View.OnClickListener {

            var result = ""
            if (rdg_gender.checkedRadioButtonId != -1) {
                // declare string
                result += "Selected Gender :- "
                //check gender
                if (rdb_male.isChecked) {
                    //append value to string
                    result += "Male\n"
                } else if (rdb_female.isChecked) {
                    //append value to string
                    result += "Female\n"
                }
            }

            // declare string
            result += "Selected Language:-"
            //check Language append with checked Language
            if (chk_lag_c.isChecked) {
                result += "C,"
            }
            if (chk_lag_cpp.isChecked) {
                result += "C++,"
            }
            if (chk_lag_java.isChecked) {
                result += "JAVA,"
            }
            if (chk_lag_android.isChecked) {
                result += "Android"
            }

            // Set Result to TextView
            txt_result.text = result
        })


    }
}
