package id.agung.resepmakan.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import id.agung.resepmakan.databinding.ActivityLoginBinding


class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val uname = "aldy"
        val paswd = "123456"

        binding = ActivityLoginBinding.inflate(layoutInflater)

        binding.loginSubmit.setOnClickListener {
            val username = binding.loginUsername.text.toString()
            val password = binding.loginPassword.text.toString()

            if (username.equals(uname) && password.equals(paswd)) {
                System.out.println("HOREEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
                val intent = Intent(this@LoginActivity, HomeActivity::class.java)
                startActivity(intent)
                finish()

            } else {
                System.out.println("GAGAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAALLLLLL");
            }

        }

        val view = binding.root;
        setContentView(view);
    }
}