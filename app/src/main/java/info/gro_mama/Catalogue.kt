package info.gro_mama

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import info.gro_mama.databinding.ActivityCatalogueBinding
import info.gro_mama.databinding.ActivityHomePageBinding

class Catalogue : AppCompatActivity() {
    lateinit var binding: ActivityCatalogueBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogue)
        binding = ActivityCatalogueBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        binding.button3.setOnClickListener {
            var intent = Intent(this,AddCart::class.java)
            startActivity(intent)}
    }
}