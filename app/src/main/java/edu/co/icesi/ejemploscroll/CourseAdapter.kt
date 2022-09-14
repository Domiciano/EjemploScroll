package edu.co.icesi.ejemploscroll

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup.LayoutParams.MATCH_PARENT
import android.widget.LinearLayout
import edu.co.icesi.ejemploscroll.databinding.CourseViewBinding

class CourseAdapter(activity: Activity) {

    private val activity = activity
    private val layoutInflater = activity.layoutInflater

    fun createView(course: Course): View {
        val metrics = activity.resources.displayMetrics
        val d = metrics.density
        val binding = CourseViewBinding.inflate(layoutInflater, null, false)
        val view = binding.root
        binding.nameTV.text = course.name
        binding.button.setOnClickListener {

        }
        val params = LinearLayout.LayoutParams(MATCH_PARENT, (120*d).toInt() )
        view.layoutParams = params
        return view
    }


}