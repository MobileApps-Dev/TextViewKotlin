package example.com.textviewkotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.SeekBar
import android.widget.TextView

class SeekBarActivity : AppCompatActivity() {
    //Define View
    lateinit var seek_rating: SeekBar
    lateinit var txt_result: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        //initialization View ID
        txt_result = findViewById(R.id.txt_result) as TextView
        seek_rating = findViewById(R.id.seek_rating) as SeekBar

        // set Max limit to seekBar
        seek_rating.max = 50 //Default 100

        //on SeekBarChangeListener
        seek_rating.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //Set value to View after change
                txt_result.text = "Selecting from :-" + p1.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                //Set value to View  start from
                txt_result.text = "Start from :-" + seekBar.progress
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                //Set value to View  Stop to
                txt_result.text = "Stop to :-" + seekBar.progress
            }
        })


    }
}
