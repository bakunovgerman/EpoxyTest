package com.example.epoxytest;

import android.view.View;
import com.airbnb.epoxy.EpoxyHolder;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\rB\u0005\u00a2\u0006\u0002\u0010\u0002J&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0007*\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0004J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0004H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/example/epoxytest/KotlinEpoxyHolder;", "Lcom/airbnb/epoxy/EpoxyHolder;", "()V", "view", "Landroid/view/View;", "bind", "Lkotlin/properties/ReadOnlyProperty;", "V", "id", "", "bindView", "", "itemView", "Lazy", "app_debug"})
public abstract class KotlinEpoxyHolder extends com.airbnb.epoxy.EpoxyHolder {
    private android.view.View view;
    
    public KotlinEpoxyHolder() {
        super(null);
    }
    
    @java.lang.Override()
    protected void bindView(@org.jetbrains.annotations.NotNull()
    android.view.View itemView) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final <V extends android.view.View>kotlin.properties.ReadOnlyProperty<com.example.epoxytest.KotlinEpoxyHolder, V> bind(int id) {
        return null;
    }
    
    /**
     * Taken from Kotterknife.
     * https://github.com/JakeWharton/kotterknife
     */
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001\u000eB#\u0012\u001c\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00028\u00000\u0005\u00a2\u0006\u0002\u0010\u0007J\"\u0010\n\u001a\u00028\u00002\u0006\u0010\u000b\u001a\u00020\u00032\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u0006H\u0096\u0002\u00a2\u0006\u0002\u0010\rR$\u0010\u0004\u001a\u0018\u0012\u0004\u0012\u00020\u0003\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0006\u0012\u0004\u0012\u00028\u00000\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/example/epoxytest/KotlinEpoxyHolder$Lazy;", "V", "Lkotlin/properties/ReadOnlyProperty;", "Lcom/example/epoxytest/KotlinEpoxyHolder;", "initializer", "Lkotlin/Function2;", "Lkotlin/reflect/KProperty;", "(Lkotlin/jvm/functions/Function2;)V", "value", "", "getValue", "thisRef", "property", "(Lcom/example/epoxytest/KotlinEpoxyHolder;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "EMPTY", "app_debug"})
    static final class Lazy<V extends java.lang.Object> implements kotlin.properties.ReadOnlyProperty<com.example.epoxytest.KotlinEpoxyHolder, V> {
        private final kotlin.jvm.functions.Function2<com.example.epoxytest.KotlinEpoxyHolder, kotlin.reflect.KProperty<?>, V> initializer = null;
        private java.lang.Object value;
        
        public Lazy(@org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function2<? super com.example.epoxytest.KotlinEpoxyHolder, ? super kotlin.reflect.KProperty<?>, ? extends V> initializer) {
            super();
        }
        
        @java.lang.Override()
        public V getValue(@org.jetbrains.annotations.NotNull()
        com.example.epoxytest.KotlinEpoxyHolder thisRef, @org.jetbrains.annotations.NotNull()
        kotlin.reflect.KProperty<?> property) {
            return null;
        }
        
        @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u00c2\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/epoxytest/KotlinEpoxyHolder$Lazy$EMPTY;", "", "()V", "app_debug"})
        static final class EMPTY {
            @org.jetbrains.annotations.NotNull()
            public static final com.example.epoxytest.KotlinEpoxyHolder.Lazy.EMPTY INSTANCE = null;
            
            private EMPTY() {
                super();
            }
        }
    }
}