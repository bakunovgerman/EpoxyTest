package com.example.epoxytest;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyBuildScope;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import java.lang.CharSequence;
import java.lang.Number;
import java.lang.Object;

@EpoxyBuildScope
public interface ItemModelModelBuilder {
  ItemModelModelBuilder onBind(OnModelBoundListener<ItemModelModel_, ItemModel> listener);

  ItemModelModelBuilder onUnbind(OnModelUnboundListener<ItemModelModel_, ItemModel> listener);

  ItemModelModelBuilder onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ItemModelModel_, ItemModel> listener);

  ItemModelModelBuilder onVisibilityChanged(
      OnModelVisibilityChangedListener<ItemModelModel_, ItemModel> listener);

  ItemModelModelBuilder image(@NonNull CharSequence image);

  ItemModelModelBuilder image(@StringRes int stringRes);

  ItemModelModelBuilder image(@StringRes int stringRes, Object... formatArgs);

  ItemModelModelBuilder imageQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  ItemModelModelBuilder name(@NonNull CharSequence name);

  ItemModelModelBuilder name(@StringRes int stringRes);

  ItemModelModelBuilder name(@StringRes int stringRes, Object... formatArgs);

  ItemModelModelBuilder nameQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs);

  ItemModelModelBuilder id(long id);

  ItemModelModelBuilder id(@Nullable Number... ids);

  ItemModelModelBuilder id(long id1, long id2);

  ItemModelModelBuilder id(@Nullable CharSequence key);

  ItemModelModelBuilder id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys);

  ItemModelModelBuilder id(@Nullable CharSequence key, long id);

  ItemModelModelBuilder spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback);
}
