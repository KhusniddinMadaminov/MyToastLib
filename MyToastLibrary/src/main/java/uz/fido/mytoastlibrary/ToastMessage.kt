package uz.fido.mytoastlibrary

import android.content.Context
import android.widget.Toast

/**
 * Created by Husniddin Muhammad Amin on 11.01.2023
 * Tashkent, Uzbekistan.
 */
object ToastMessage {
    fun show(context: Context, message: String) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show()
    }
}