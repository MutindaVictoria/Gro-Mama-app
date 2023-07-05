package info.gro_mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.gro_mama.databinding.ActivityAddCartBinding
import info.gro_mama.databinding.ActivityLogInBinding

class AddCart : AppCompatActivity() {
    lateinit var binding: ActivityAddCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_cart)
        binding = ActivityAddCartBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.button6.setOnClickListener {
            var intent = Intent(this,Payment::class.java)
            startActivity(intent)}
        binding.imageView14.setOnClickListener {
            var intent =Intent(this,Catalogue::class.java)
            startActivity(intent)
        }
               }
}