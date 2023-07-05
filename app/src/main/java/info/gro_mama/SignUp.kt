package info.gro_mama

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintSet.Layout
import info.gro_mama.databinding.ActivitySignUpBinding

class SignUp : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.button.setOnClickListener {
            validateSignUp()
        }
        binding.textView36.setOnClickListener {
            val intent=Intent(this, LogIn::class.java)
            startActivity(intent)
        }

    }


    fun validateSignUp() {
        val name = binding.etName.text.toString()
        val phoneNo=binding.etPhoneNo.text.toString()
        val password =binding.etPassword .text.toString()
        val email =binding.etEmail .text.toString()
        var error = false
        if (name.isBlank()) {
//            binding.tilEnterName.error=null
            binding.tilName.error = "Name required"
            error=true
        }
        if (phoneNo.isBlank()) {
//            binding.tilPhoneNo.error=null
            binding.tilPhoneNo.error = "Phone Number required"
            error=true
        }
        if (password.isBlank()) {
//            binding.tilPassword.error=null
            binding.tilPassword.error = "Password name required"
            error=true
    val email =binding.etEmail .text.toString()
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email name required"
            error=true
        }
        if (password!=password){
            binding.tilPassword .error="Password confirmation does not match with the password"
            error=true
        }
//        to keep track if an error has occured
        if (!error){
            Toast.makeText(this,"$name$email $password",
                Toast.LENGTH_LONG).show()
//            to remove the validation
        }
    }
}

