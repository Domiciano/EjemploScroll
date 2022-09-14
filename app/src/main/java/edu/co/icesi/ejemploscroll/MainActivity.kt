package edu.co.icesi.ejemploscroll

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import edu.co.icesi.ejemploscroll.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    val binding:ActivityMainBinding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



        val a = Course("Aplicaciones Móviles")
        val b = Course("Álgebra y funciones")
        val c = Course("A")
        val d = Course("B")
        val e = Course("C")
        val f = Course("D")
        val g = Course("E")

        val viewA = CourseAdapter(this).createView(a)
        val viewB = CourseAdapter(this).createView(b)
        val viewC = CourseAdapter(this).createView(c)
        val viewD = CourseAdapter(this).createView(d)
        val viewE = CourseAdapter(this).createView(e)
        val viewF = CourseAdapter(this).createView(f)
        val viewG = CourseAdapter(this).createView(g)

        binding.coursesContainer.addView(viewA)
        binding.coursesContainer.addView(viewB)
        binding.coursesContainer.addView(viewC)
        binding.coursesContainer.addView(viewD)
        binding.coursesContainer.addView(viewE)
        binding.activitiesContainer.addView(viewF)
        binding.activitiesContainer.addView(viewG)

    }
}