package com.example.affirmations

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      //  text_view.text= Datasource().loadAffirmations().size.toString()
        val myDataset = Datasource().loadAffirmations()
        recycle_view.adapter = ItemAdapter(this, myDataset)
        recycle_view.setHasFixedSize(true)

    }
}