package kr.co.marubook

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import kr.co.marubook.util.PixelRatio

@HiltAndroidApp
class MaruApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initPixelUtil()
    }

    private fun initPixelUtil() {
        pixelRatio = PixelRatio(this)
    }

    companion object {
        lateinit var pixelRatio: PixelRatio
    }
}