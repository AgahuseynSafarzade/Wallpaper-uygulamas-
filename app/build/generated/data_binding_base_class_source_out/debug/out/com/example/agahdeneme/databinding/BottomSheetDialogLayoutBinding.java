// Generated by view binder compiler. Do not edit!
package com.example.agahdeneme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.agahdeneme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class BottomSheetDialogLayoutBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView bottomSheetArrow;

  @NonNull
  public final LinearLayout bottomSheetLayout;

  @NonNull
  public final RecyclerView reccyclerview;

  private BottomSheetDialogLayoutBinding(@NonNull LinearLayout rootView,
      @NonNull ImageView bottomSheetArrow, @NonNull LinearLayout bottomSheetLayout,
      @NonNull RecyclerView reccyclerview) {
    this.rootView = rootView;
    this.bottomSheetArrow = bottomSheetArrow;
    this.bottomSheetLayout = bottomSheetLayout;
    this.reccyclerview = reccyclerview;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static BottomSheetDialogLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static BottomSheetDialogLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.bottom_sheet_dialog_layout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static BottomSheetDialogLayoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.bottom_sheet_arrow;
      ImageView bottomSheetArrow = ViewBindings.findChildViewById(rootView, id);
      if (bottomSheetArrow == null) {
        break missingId;
      }

      LinearLayout bottomSheetLayout = (LinearLayout) rootView;

      id = R.id.reccyclerview;
      RecyclerView reccyclerview = ViewBindings.findChildViewById(rootView, id);
      if (reccyclerview == null) {
        break missingId;
      }

      return new BottomSheetDialogLayoutBinding((LinearLayout) rootView, bottomSheetArrow,
          bottomSheetLayout, reccyclerview);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
