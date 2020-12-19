package ademar.soquestion

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.emoji.widget.EmojiAppCompatTextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // The middle emoji will not be rendered
        findViewById<EmojiAppCompatTextView>(R.id.text_view).text = getString(R.string.three_emojis)
    }
}
