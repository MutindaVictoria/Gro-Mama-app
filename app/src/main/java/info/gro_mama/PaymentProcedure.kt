package info.gro_mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.gro_mama.databinding.ActivityPaymentProcedureBinding
import info.gro_mama.databinding.ActivitySignUpBinding

class PaymentProcedure : AppCompatActivity() {
    lateinit var binding: ActivityPaymentProcedureBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_procedure)
        binding = ActivityPaymentProcedureBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.button2.setOnClickListener {
            val intent = Intent(this, PaymentVerification::class.java)
            startActivity(intent)
        }
    }
}
