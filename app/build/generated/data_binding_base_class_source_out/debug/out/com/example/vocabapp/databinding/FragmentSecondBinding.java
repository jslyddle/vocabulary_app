// Generated by view binder compiler. Do not edit!
package com.example.vocabapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.example.vocabapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSecondBinding implements ViewBinding {
  @NonNull
  private final FrameLayout rootView;

  @NonNull
  public final RecyclerView recylerView;

  @NonNull
  public final TextView tvExplore;

  @NonNull
  public final TextView tvYouruniverse;

  private FragmentSecondBinding(@NonNull FrameLayout rootView, @NonNull RecyclerView recylerView,
      @NonNull TextView tvExplore, @NonNull TextView tvYouruniverse) {
    this.rootView = rootView;
    this.recylerView = recylerView;
    this.tvExplore = tvExplore;
    this.tvYouruniverse = tvYouruniverse;
  }

  @Override
  @NonNull
  public FrameLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSecondBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_second, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSecondBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.recyler_view;
      RecyclerView recylerView = rootView.findViewById(id);
      if (recylerView == null) {
        break missingId;
      }

      id = R.id.tv_explore;
      TextView tvExplore = rootView.findViewById(id);
      if (tvExplore == null) {
        break missingId;
      }

      id = R.id.tv_youruniverse;
      TextView tvYouruniverse = rootView.findViewById(id);
      if (tvYouruniverse == null) {
        break missingId;
      }

      return new FragmentSecondBinding((FrameLayout) rootView, recylerView, tvExplore,
          tvYouruniverse);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}