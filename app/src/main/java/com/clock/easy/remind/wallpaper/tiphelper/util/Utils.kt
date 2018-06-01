package com.clock.easy.remind.wallpaper.tiphelper.util

import android.content.Context
import android.graphics.Point
import android.net.ConnectivityManager
import android.net.NetworkInfo
import java.util.regex.Pattern

/**
 * 获取手机高宽
 */
fun getScreen(context: Context): Point {
    val resources = context.resources
    val dm = resources.displayMetrics
    val point = Point(dm.widthPixels, dm.heightPixels)
    return point
}


/**
 * 检查网络是否可用
 */
fun checkNetWork(context: Context): Boolean {
    val manager = context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
    val networkInfo: NetworkInfo = manager.activeNetworkInfo
    return networkInfo.isAvailable
}

/**
 * 邮箱格式验证
 */
fun isEmail(email: String): Boolean {
    val str = "^([a-zA-Z0-9_\\-\\.]+)@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.)|(" + "([a-zA-Z0-9\\-]+\\.)+))([a-zA-Z]{2,4}|[0-9]{1,3})(\\]?)$"
    val p = Pattern.compile(str)
    val m = p.matcher(email)
    return m.matches()
}

/**
 * 根据手机分辨率从DP转成PX
 */
fun dip2px(context: Context, dpValue: Float): Int {
    val scale = context.resources.displayMetrics.density
    return (dpValue * scale + 0.5f).toInt()
}
