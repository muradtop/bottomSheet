package com.example.geekmessenger.ui.fragments.bottomSheet

import android.view.View
import androidx.constraintlayout.widget.ConstraintLayout
import com.example.geekmessenger.R
import com.google.android.material.bottomsheet.BottomSheetDialogFragment


class BottomSheetGalleryFragment :  BottomSheetDialogFragment() {
    private lateinit var addProfilePhoto: ConstraintLayout

    private fun bottom() {
        addProfilePhoto.setOnClickListener {
            val view: View = layoutInflater.inflate(R.layout.fragment_bottom_sheet_gallery, null)
            val dialog = BottomSheetDialogFragment().dialog
            dialog?.setContentView(view)
            dialog?.show()
        }
    }
}

