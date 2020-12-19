package ademar.soquestion

import android.app.Application
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AppCompatDelegate
import androidx.core.provider.FontRequest
import androidx.emoji.text.EmojiCompat
import androidx.emoji.text.FontRequestEmojiCompatConfig

class App : Application() {
    override fun onCreate() {
        super.onCreate()
        AppCompatDelegate.setCompatVectorFromResourcesEnabled(true)
        EmojiCompat.init(
            FontRequestEmojiCompatConfig(
                this,
                FontRequest(
                    "com.google.android.gms.fonts",
                    "com.google.android.gms",
                    "Noto Color Emoji Compat",
                    R.array.com_google_android_gms_fonts_certs
                )
            ).setReplaceAll(true)
                .registerInitCallback(object : EmojiCompat.InitCallback() {
                    override fun onInitialized() {
                        super.onInitialized()
                        Toast.makeText(this@App, "EmojiCompat was initialized", LENGTH_SHORT).show()
                    }

                    override fun onFailed(throwable: Throwable?) {
                        super.onFailed(throwable)
                        throw RuntimeException(throwable)
                    }
                })
        )
    }
}
