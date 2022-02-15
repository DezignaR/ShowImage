package com.example.myapplication

import android.nfc.Tag
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

fun ViewGroup.inflate(@LayoutRes layoutResId: Int): View =
    LayoutInflater.from(context).inflate(layoutResId, this, false)

fun Fragment.navigateTo(fragment: Fragment,tag: String) {
    activity?.supportFragmentManager?.beginTransaction()
        ?.replace(R.id.container, fragment)
        ?.addToBackStack(tag)
        ?.commit()

}