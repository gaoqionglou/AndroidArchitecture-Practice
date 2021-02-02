package com.gql.androidarchitecture.extension

import android.view.View

fun View.visible() {
    this.visibility = View.VISIBLE
}

fun View.gone() {
    this.visibility = View.GONE
}

fun View.invisible() {
    this.visibility = View.INVISIBLE
}

fun View.onClick(click: () -> Unit) {
    this.setOnClickListener { click() }
}


fun View.onClickView(click: (View) -> Unit) {
    this.setOnClickListener { v -> click(v) }
}