package info.gro_mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.gro_mama.databinding.ActivityHomePageBinding

class HomePage : AppCompatActivity() {
    lateinit var binding: ActivityHomePageBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        binding = ActivityHomePageBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        binding.button4.setOnClickListener {
            var intent =Intent(this,Catalogue::class.java)
            startActivity(intent)
        }
    }
}



