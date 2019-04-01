package com.taonce.utilmodule


import android.util.Log


/**
 * Author: taoyongxiang
 * Date: 2019/3/28
 * Desc: 常用的日志打印类
 */

fun showDebug(
    tag: String = "taonce",
    msg: String
) {
    Log.d(tag, msg)
}

fun showError(
    tag: String = "taonce",
    msg: String
) {
    Log.e(tag, msg)
}

fun showInfo(
    tag: String = "taonce",
    msg: String
) {
    Log.i(tag, msg)
}

fun showWarning(
    tag: String = "taonce",
    msg: String
) {
    Log.w(tag, msg)
}