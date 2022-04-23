package com.konstantinosreppas.myapplication

import android.graphics.drawable.Drawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import com.google.android.material.appbar.AppBarLayout
import kotlin.math.absoluteValue

fun makeTopSheet(
    inflater: LayoutInflater,
    parentContainer: ViewGroup?,
    contentRedId: Int,
    backgroundColor: Int? = null,
    onDismiss: () -> Unit
): View {
    val view = inflater.inflate(R.layout.top_sheet_base_layout, parentContainer, false)

    val sheetContentContainer = view.findViewById<FrameLayout>(R.id.sheet_content_container)
    sheetContentContainer.addView(inflater.inflate(contentRedId, sheetContentContainer, false))

    if (backgroundColor != null) {

        view.findViewById<View>(R.id.sheet_background).setBackgroundColor(backgroundColor)
    }

    view.findViewById<AppBarLayout>(R.id.app_bar_layout)
        .addOnOffsetChangedListener(AppBarLayout.OnOffsetChangedListener { appBarLayout, verticalOffset ->

            if (verticalOffset.absoluteValue == appBarLayout.totalScrollRange) {
                onDismiss()
            }
        }
        )

    return view
}