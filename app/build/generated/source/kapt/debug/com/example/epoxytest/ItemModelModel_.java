package com.example.epoxytest;

import android.content.Context;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.PluralsRes;
import androidx.annotation.StringRes;
import com.airbnb.epoxy.EpoxyController;
import com.airbnb.epoxy.EpoxyModel;
import com.airbnb.epoxy.EpoxyViewHolder;
import com.airbnb.epoxy.GeneratedModel;
import com.airbnb.epoxy.OnModelBoundListener;
import com.airbnb.epoxy.OnModelUnboundListener;
import com.airbnb.epoxy.OnModelVisibilityChangedListener;
import com.airbnb.epoxy.OnModelVisibilityStateChangedListener;
import com.airbnb.epoxy.StringAttributeData;
import java.lang.CharSequence;
import java.lang.IllegalArgumentException;
import java.lang.IllegalStateException;
import java.lang.Number;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.UnsupportedOperationException;
import java.util.BitSet;

/**
 * Generated file. Do not modify!
 */
public class ItemModelModel_ extends EpoxyModel<ItemModel> implements GeneratedModel<ItemModel>, ItemModelModelBuilder {
  private final BitSet assignedAttributes_epoxyGeneratedModel = new BitSet(2);

  private OnModelBoundListener<ItemModelModel_, ItemModel> onModelBoundListener_epoxyGeneratedModel;

  private OnModelUnboundListener<ItemModelModel_, ItemModel> onModelUnboundListener_epoxyGeneratedModel;

  private OnModelVisibilityStateChangedListener<ItemModelModel_, ItemModel> onModelVisibilityStateChangedListener_epoxyGeneratedModel;

  private OnModelVisibilityChangedListener<ItemModelModel_, ItemModel> onModelVisibilityChangedListener_epoxyGeneratedModel;

  /**
   * Bitset index: 0
   */
  private StringAttributeData image_StringAttributeData =  new StringAttributeData();

  /**
   * Bitset index: 1
   */
  private StringAttributeData name_StringAttributeData =  new StringAttributeData();

  @Override
  public void addTo(EpoxyController controller) {
    super.addTo(controller);
    addWithDebugValidation(controller);
    if (!assignedAttributes_epoxyGeneratedModel.get(1)) {
    	throw new IllegalStateException("A value is required for setName");
    }
    if (!assignedAttributes_epoxyGeneratedModel.get(0)) {
    	throw new IllegalStateException("A value is required for setImage");
    }
  }

  @Override
  protected int getViewType() {
    return 0;
  }

  @Override
  public ItemModel buildView(ViewGroup parent) {
    ItemModel v = new ItemModel(parent.getContext());
    v.setLayoutParams(new ViewGroup.MarginLayoutParams(ViewGroup.MarginLayoutParams.MATCH_PARENT, ViewGroup.MarginLayoutParams.WRAP_CONTENT));
    return v;
  }

  @Override
  public void handlePreBind(final EpoxyViewHolder holder, final ItemModel object,
      final int position) {
    validateStateHasNotChangedSinceAdded("The model was changed between being added to the controller and being bound.", position);
  }

  @Override
  public void bind(final ItemModel object) {
    super.bind(object);
    object.setName(name_StringAttributeData.toString(object.getContext()));
    object.setImage(image_StringAttributeData.toString(object.getContext()));
  }

  @Override
  public void bind(final ItemModel object, EpoxyModel previousModel) {
    if (!(previousModel instanceof ItemModelModel_)) {
      bind(object);
      return;
    }
    ItemModelModel_ that = (ItemModelModel_) previousModel;
    super.bind(object);

    if ((name_StringAttributeData != null ? !name_StringAttributeData.equals(that.name_StringAttributeData) : that.name_StringAttributeData != null)) {
      object.setName(name_StringAttributeData.toString(object.getContext()));
    }

    if ((image_StringAttributeData != null ? !image_StringAttributeData.equals(that.image_StringAttributeData) : that.image_StringAttributeData != null)) {
      object.setImage(image_StringAttributeData.toString(object.getContext()));
    }
  }

  @Override
  public void handlePostBind(final ItemModel object, int position) {
    if (onModelBoundListener_epoxyGeneratedModel != null) {
      onModelBoundListener_epoxyGeneratedModel.onModelBound(this, object, position);
    }
    validateStateHasNotChangedSinceAdded("The model was changed during the bind call.", position);
  }

  /**
   * Register a listener that will be called when this model is bound to a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()}
   */
  public ItemModelModel_ onBind(OnModelBoundListener<ItemModelModel_, ItemModel> listener) {
    onMutation();
    this.onModelBoundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void unbind(ItemModel object) {
    super.unbind(object);
    if (onModelUnboundListener_epoxyGeneratedModel != null) {
      onModelUnboundListener_epoxyGeneratedModel.onModelUnbound(this, object);
    }
  }

  /**
   * Register a listener that will be called when this model is unbound from a view.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   * <p>
   * You may clear the listener by setting a null value, or by calling {@link #reset()}
   */
  public ItemModelModel_ onUnbind(OnModelUnboundListener<ItemModelModel_, ItemModel> listener) {
    onMutation();
    this.onModelUnboundListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityStateChanged(int visibilityState, final ItemModel object) {
    if (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityStateChangedListener_epoxyGeneratedModel.onVisibilityStateChanged(this, object, visibilityState);
    }
    super.onVisibilityStateChanged(visibilityState, object);
  }

  /**
   * Register a listener that will be called when this model visibility state has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public ItemModelModel_ onVisibilityStateChanged(
      OnModelVisibilityStateChangedListener<ItemModelModel_, ItemModel> listener) {
    onMutation();
    this.onModelVisibilityStateChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  @Override
  public void onVisibilityChanged(float percentVisibleHeight, float percentVisibleWidth,
      int visibleHeight, int visibleWidth, final ItemModel object) {
    if (onModelVisibilityChangedListener_epoxyGeneratedModel != null) {
      onModelVisibilityChangedListener_epoxyGeneratedModel.onVisibilityChanged(this, object, percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth);
    }
    super.onVisibilityChanged(percentVisibleHeight, percentVisibleWidth, visibleHeight, visibleWidth, object);
  }

  /**
   * Register a listener that will be called when this model visibility has changed.
   * <p>
   * The listener will contribute to this model's hashCode state per the {@link
   * com.airbnb.epoxy.EpoxyAttribute.Option#DoNotHash} rules.
   */
  public ItemModelModel_ onVisibilityChanged(
      OnModelVisibilityChangedListener<ItemModelModel_, ItemModel> listener) {
    onMutation();
    this.onModelVisibilityChangedListener_epoxyGeneratedModel = listener;
    return this;
  }

  public CharSequence getImage(Context context) {
    return image_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see ItemModel#setImage(CharSequence)
   */
  public ItemModelModel_ image(@NonNull CharSequence image) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    if (image == null) {
      throw new IllegalArgumentException("image cannot be null");
    }
    image_StringAttributeData.setValue(image);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see ItemModel#setImage(CharSequence)
   */
  public ItemModelModel_ image(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    image_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see ItemModel#setImage(CharSequence)
   */
  public ItemModelModel_ image(@StringRes int stringRes, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    image_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see ItemModel#setImage(CharSequence)
   */
  public ItemModelModel_ imageQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(0);
    image_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  public CharSequence getName(Context context) {
    return name_StringAttributeData.toString(context);
  }

  /**
   * <i>Required.</i>
   *
   * @see ItemModel#setName(CharSequence)
   */
  public ItemModelModel_ name(@NonNull CharSequence name) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    if (name == null) {
      throw new IllegalArgumentException("name cannot be null");
    }
    name_StringAttributeData.setValue(name);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see ItemModel#setName(CharSequence)
   */
  public ItemModelModel_ name(@StringRes int stringRes) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    name_StringAttributeData.setValue(stringRes);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see ItemModel#setName(CharSequence)
   */
  public ItemModelModel_ name(@StringRes int stringRes, Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    name_StringAttributeData.setValue(stringRes, formatArgs);
    return this;
  }

  /**
   * Throws if a value <= 0 is set.
   * <p>
   * <i>Required.</i>
   *
   * @see ItemModel#setName(CharSequence)
   */
  public ItemModelModel_ nameQuantityRes(@PluralsRes int pluralRes, int quantity,
      Object... formatArgs) {
    onMutation();
    assignedAttributes_epoxyGeneratedModel.set(1);
    name_StringAttributeData.setValue(pluralRes, quantity, formatArgs);
    return this;
  }

  @Override
  public ItemModelModel_ id(long id) {
    super.id(id);
    return this;
  }

  @Override
  public ItemModelModel_ id(@Nullable Number... ids) {
    super.id(ids);
    return this;
  }

  @Override
  public ItemModelModel_ id(long id1, long id2) {
    super.id(id1, id2);
    return this;
  }

  @Override
  public ItemModelModel_ id(@Nullable CharSequence key) {
    super.id(key);
    return this;
  }

  @Override
  public ItemModelModel_ id(@Nullable CharSequence key, @Nullable CharSequence... otherKeys) {
    super.id(key, otherKeys);
    return this;
  }

  @Override
  public ItemModelModel_ id(@Nullable CharSequence key, long id) {
    super.id(key, id);
    return this;
  }

  @Override
  public ItemModelModel_ layout(@LayoutRes int layoutRes) {
    throw new UnsupportedOperationException("Layout resources are unsupported with programmatic views.");
  }

  @Override
  public ItemModelModel_ spanSizeOverride(
      @Nullable EpoxyModel.SpanSizeOverrideCallback spanSizeCallback) {
    super.spanSizeOverride(spanSizeCallback);
    return this;
  }

  @Override
  public ItemModelModel_ show() {
    super.show();
    return this;
  }

  @Override
  public ItemModelModel_ show(boolean show) {
    super.show(show);
    return this;
  }

  @Override
  public ItemModelModel_ hide() {
    super.hide();
    return this;
  }

  @Override
  @LayoutRes
  protected int getDefaultLayout() {
    throw new UnsupportedOperationException("Layout resources are unsupported for views created programmatically.");
  }

  @Override
  public ItemModelModel_ reset() {
    onModelBoundListener_epoxyGeneratedModel = null;
    onModelUnboundListener_epoxyGeneratedModel = null;
    onModelVisibilityStateChangedListener_epoxyGeneratedModel = null;
    onModelVisibilityChangedListener_epoxyGeneratedModel = null;
    assignedAttributes_epoxyGeneratedModel.clear();
    this.image_StringAttributeData =  new StringAttributeData();
    this.name_StringAttributeData =  new StringAttributeData();
    super.reset();
    return this;
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (!(o instanceof ItemModelModel_)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    ItemModelModel_ that = (ItemModelModel_) o;
    if (((onModelBoundListener_epoxyGeneratedModel == null) != (that.onModelBoundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelUnboundListener_epoxyGeneratedModel == null) != (that.onModelUnboundListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityStateChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityStateChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if (((onModelVisibilityChangedListener_epoxyGeneratedModel == null) != (that.onModelVisibilityChangedListener_epoxyGeneratedModel == null))) {
      return false;
    }
    if ((image_StringAttributeData != null ? !image_StringAttributeData.equals(that.image_StringAttributeData) : that.image_StringAttributeData != null)) {
      return false;
    }
    if ((name_StringAttributeData != null ? !name_StringAttributeData.equals(that.name_StringAttributeData) : that.name_StringAttributeData != null)) {
      return false;
    }
    return true;
  }

  @Override
  public int hashCode() {
    int _result = super.hashCode();
    _result = 31 * _result + (onModelBoundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelUnboundListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityStateChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (onModelVisibilityChangedListener_epoxyGeneratedModel != null ? 1 : 0);
    _result = 31 * _result + (image_StringAttributeData != null ? image_StringAttributeData.hashCode() : 0);
    _result = 31 * _result + (name_StringAttributeData != null ? name_StringAttributeData.hashCode() : 0);
    return _result;
  }

  @Override
  public String toString() {
    return "ItemModelModel_{" +
        "image_StringAttributeData=" + image_StringAttributeData +
        ", name_StringAttributeData=" + name_StringAttributeData +
        "}" + super.toString();
  }

  @Override
  public int getSpanSize(int totalSpanCount, int position, int itemCount) {
    return totalSpanCount;
  }
}
