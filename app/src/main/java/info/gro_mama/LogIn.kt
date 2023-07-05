package info.gro_mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import info.gro_mama.databinding.ActivityLogInBinding
import info.gro_mama.databinding.ActivityMainBinding

class LogIn : AppCompatActivity() {
    lateinit var binding: ActivityLogInBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log_in)
        binding = ActivityLogInBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
            binding.button5.setOnClickListener {
               val intent =Intent(this,HomePage::class.java)
                startActivity(intent)
                validateLogIn()
            }

           binding.textView54.setOnClickListener {
                val intent=Intent(this,SignUp::class.java)
                startActivity(intent)
            }

        }

fun validateLogIn() {
    val password = binding.etPassword.text.toString()
    val email = binding.etEmail.text.toString()
    var error = false
    if (password.isBlank()) {
//   binding.tilEnterName.error=null
        binding.tilPassword.error = "Password required"
        error = true
    }
    if (email.isBlank()) {
//            binding.tilPhoneNo.error=null
        binding.tilEmail.error = "Email required"
        error = true
    }

}
}

