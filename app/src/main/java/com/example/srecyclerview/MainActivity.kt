package com.example.srecyclerview

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import androidx.core.widget.NestedScrollView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
     var count = 0
  var arrayList : ArrayList<Modal> = arrayListOf()
    @SuppressLint("SuspiciousIndentation", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var rcv : RecyclerView = findViewById(R.id.rcv)
      var nestedSV : NestedScrollView = findViewById(R.id.nestedSV)
      var loadingPB:ProgressBar = findViewById(R.id.loading)

        rcv.layoutManager = LinearLayoutManager(this)


         getData()
      var adapter : RcvAdapter = RcvAdapter(arrayList)
      rcv.adapter = adapter

      nestedSV.setOnScrollChangeListener(NestedScrollView.OnScrollChangeListener { v, scrollX, scrollY, oldScrollX, oldScrollY ->
        // on scroll change we are checking when users scroll as bottom.
        if (scrollY == v.getChildAt(0).measuredHeight - v.measuredHeight) {
          // in this method we are incrementing page number,
          // making progress bar visible and calling get data method.
          count++
          // on below line we are making our progress bar visible.
          loadingPB.setVisibility(View.VISIBLE)
          if (count < 20) {
            // on below line we are again calling
            // a method to load data in our array list.
            getData()
            var adapter : RcvAdapter = RcvAdapter(arrayList)
            rcv.adapter = adapter
          }
        }
      })

    }

  fun getData(){
    arrayList.add(Modal("Pratyush",R.drawable.img))
    arrayList.add(Modal("Sneha",R.drawable.img_4))
    arrayList.add(Modal("Shristi",R.drawable.img_2))
    arrayList.add(Modal("Sangam",R.drawable.img_3))
    arrayList.add(Modal("Pratyush",R.drawable.img))
    arrayList.add(Modal("Vivek",R.drawable.img_1))
    arrayList.add(Modal("Shristi",R.drawable.img_2))
    arrayList.add(Modal("Sangam",R.drawable.img_3))
//    arrayList.add(Modal("Pratyush",R.drawable.img))
//    arrayList.add(Modal("Sneha",R.drawable.img_1))
//    arrayList.add(Modal("Shristi",R.drawable.img_2))
//    arrayList.add(Modal("Sangam",R.drawable.img_3))
//    arrayList.add(Modal("Pratyush",R.drawable.img))
//    arrayList.add(Modal("Sneha",R.drawable.img_1))
//    arrayList.add(Modal("Shristi",R.drawable.img_2))
//    arrayList.add(Modal("Sangam",R.drawable.img_3))
//    arrayList.add(Modal("Pratyush",R.drawable.img))
//    arrayList.add(Modal("Sneha",R.drawable.img_1))
//    arrayList.add(Modal("Shristi",R.drawable.img_2))
//    arrayList.add(Modal("Sangam",R.drawable.img_3))
//    arrayList.add(Modal("Pratyush",R.drawable.img))
//    arrayList.add(Modal("Sneha",R.drawable.img_1))
//    arrayList.add(Modal("Shristi",R.drawable.img_2))
//    arrayList.add(Modal("Sangam",R.drawable.img_3))
//    arrayList.add(Modal("Pratyush",R.drawable.img))
//    arrayList.add(Modal("Sneha",R.drawable.img_1))
//    arrayList.add(Modal("Shristi",R.drawable.img_2))
//    arrayList.add(Modal("Sangam",R.drawable.img_3))


  }
}