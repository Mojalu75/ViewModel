package com.mojalu75.viewmodel.view

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import com.mojalu75.viewmodel.databinding.ActivityMainBinding
import com.mojalu75.viewmodel.model.QuoteModel
import com.mojalu75.viewmodel.viewmodel.AlumnesViewModel
import com.mojalu75.viewmodel.viewmodel.QuoteViewModel

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val quoteViewModel : QuoteViewModel by viewModels()
    private val alumnesViewModel : AlumnesViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        quoteViewModel.quoteModel.observe(this, Observer { currentQuote ->
            binding.tvQuote.text = currentQuote.quote
            binding.tvAuthor.text = currentQuote.author
        })

        alumnesViewModel.alumnesModel.observe(this, Observer{ currentAlumne->
            Toast.makeText(this,currentAlumne.nombre +
                    " edat : "+ currentAlumne.edat , Toast.LENGTH_SHORT).show()
        })

        binding.viewContainer.setOnClickListener {
            quoteViewModel.randomQuote()
            alumnesViewModel.randomAlumne()
        }
    }
}