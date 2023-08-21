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
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onResume() {
        super.onResume()
        setContentView(binding.root)
        binding.btnSignUp.setOnClickListener {
            validateSignUp()
        }
        binding.textView36.setOnClickListener {
            val intent = Intent(this, LogIn::class.java)
            startActivity(intent)
        }

    }


    fun validateSignUp() {
        val firstName = binding.etName.text.toString()
        val lastName=binding.etNamee.text.toString()
        val phoneNo = binding.etPhoneNo.text.toString()
        val password = binding.etPassword.text.toString()
        val confirmPassword=binding.etPasswordConfirm.text.toString()
        val email = binding.etEmail.text.toString()
        var error = false
        if (firstName.isBlank()) {
            binding.tilName.error = "FirstName required"
            error = true
        }
        if (lastName.isBlank()) {
            binding.tilNamee.error = "LastName required"
            error = true
        }
        if (phoneNo.isBlank()) {
            binding.tilPhoneNo.error = "Phone Number required"
            error = true
        }
        if (password.isBlank()) {
            binding.tilPassword.error = "Password name required"
            error = true
            val email = binding.etEmail.text.toString()
        }
        if (email.isBlank()) {
            binding.tilEmail.error = "Email required"
            error = true
        }
        if (confirmPassword.isBlank()) {
            binding.tilPasswordconfirm.error = "Confirm your password"
            error = true
            val confirmPassword = binding.etPasswordConfirm.text.toString()
        }
        if (password != password) {
            binding.tilPassword.error = "Password confirmation does not match with the password"
            error = true
        }
        if (!error) {
            val intent = Intent(this, HomePage::class.java)
            startActivity(intent)
        }

    }
}





