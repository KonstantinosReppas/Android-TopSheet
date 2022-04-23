package com.konstantinosreppas.topsheetfragment

import android.graphics.Color
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.konstantinosreppas.myapplication.makeTopSheet

class TopSheetFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        return makeTopSheet(
            inflater, container, R.layout.top_sheet_fragment,
            Color.parseColor("#99000000")
        ) {
            requireActivity().onBackPressed()
        }
    }
}