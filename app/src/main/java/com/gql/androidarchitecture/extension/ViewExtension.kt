package com.gql.androidarchitecture.extension

import android.view.View

fun View.onClick(click: () -> Unit) {
    this.setOnClickListener { click() }
}


fun View.onClickView(click: (View) -> Unit) {
    this.setOnClickListener { v -> click(v) }
}