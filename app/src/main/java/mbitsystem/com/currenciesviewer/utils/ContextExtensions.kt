package mbitsystem.com.currenciesviewer.utils

import android.content.Context
import android.widget.Toast

fun Context.makeShortToast(message: String) = Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
