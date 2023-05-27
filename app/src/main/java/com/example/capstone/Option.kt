import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.capstone.MainActivity
import com.example.capstone.R

class SplashScreenActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT = 3000 // Durasi tampilan splash screen dalam milidetik (misalnya 3000ms = 3 detik)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_option)

        // Handler untuk menunda perpindahan ke aktivitas berikutnya
        Handler().postDelayed({
            // Intent untuk memulai aktivitas berikutnya setelah tampilan splash screen selesai
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish() // Menutup aktivitas splash screen agar tidak dapat dikembalikan dengan tombol "back"
        }, SPLASH_TIME_OUT.toLong())
    }
}
