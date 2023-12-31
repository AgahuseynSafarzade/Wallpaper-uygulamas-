// Generated by view binder compiler. Do not edit!
package com.example.agahdeneme.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.agahdeneme.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityDecisionBinding implements ViewBinding {
  @NonNull
  private final RelativeLayout rootView;

  @NonNull
  public final ImageButton likedbtn;

  @NonNull
  public final ImageButton popupmenubtn;

  @NonNull
  public final ImageView titleImage;

  private ActivityDecisionBinding(@NonNull RelativeLayout rootView, @NonNull ImageButton likedbtn,
      @NonNull ImageButton popupmenubtn, @NonNull ImageView titleImage) {
    this.rootView = rootView;
    this.likedbtn = likedbtn;
    this.popupmenubtn = popupmenubtn;
    this.titleImage = titleImage;
  }

  @Override
  @NonNull
  public RelativeLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDecisionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDecisionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_decision, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDecisionBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.likedbtn;
      ImageButton likedbtn = ViewBindings.findChildViewById(rootView, id);
      if (likedbtn == null) {
        break missingId;
      }

      id = R.id.popupmenubtn;
      ImageButton popupmenubtn = ViewBindings.findChildViewById(rootView, id);
      if (popupmenubtn == null) {
        break missingId;
      }

      id = R.id.title_image;
      ImageView titleImage = ViewBindings.findChildViewById(rootView, id);
      if (titleImage == null) {
        break missingId;
      }

      return new ActivityDecisionBinding((RelativeLayout) rootView, likedbtn, popupmenubtn,
          titleImage);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
