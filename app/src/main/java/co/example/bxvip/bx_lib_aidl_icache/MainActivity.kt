package co.example.bxvip.bx_lib_aidl_icache

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.qihoo360.replugin.sdk.binder.ICache

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val binder = ICache.Stub.asInterface(null)
    }
}