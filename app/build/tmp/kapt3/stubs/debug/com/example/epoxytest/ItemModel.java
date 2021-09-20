package com.example.epoxytest;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.LayoutRes;
import com.airbnb.epoxy.ModelView;
import com.airbnb.epoxy.TextProp;
import com.example.epoxytest.databinding.ItemCarBinding;
import com.squareup.picasso.Picasso;

@com.airbnb.epoxy.ModelView(autoLayout = com.airbnb.epoxy.ModelView.Size.MATCH_WIDTH_WRAP_HEIGHT)
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\rH\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/epoxytest/ItemModel;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrRes", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "itemCarBinding", "Lcom/example/epoxytest/databinding/ItemCarBinding;", "setImage", "", "url", "", "setName", "nameCar", "app_debug"})
public final class ItemModel extends android.widget.LinearLayout {
    private final com.example.epoxytest.databinding.ItemCarBinding itemCarBinding = null;
    
    public ItemModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super(null);
    }
    
    public ItemModel(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.util.AttributeSet attrRes) {
        super(null);
    }
    
    @com.airbnb.epoxy.TextProp()
    public final void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence url) {
    }
    
    @com.airbnb.epoxy.TextProp()
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.CharSequence nameCar) {
    }
}