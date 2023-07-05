package info.gro_mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.gro_mama.databinding.ActivityPaymentBinding
import info.gro_mama.databinding.ActivitySignUpBinding

class Payment : AppCompatActivity() {
    lateinit var binding: ActivityPaymentBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.button7.setOnClickListener {
            val intent = Intent(this,PaymentProcedure::class.java)
            startActivity(intent)
        }
    }
}