package com.aurelhubert.ahbottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.support.annotation.ColorInt;
import android.support.annotation.ColorRes;
import android.support.annotation.DrawableRes;
import android.support.annotation.StringRes;
import android.support.v4.content.ContextCompat;
import android.support.v7.content.res.AppCompatResources;

/**
 * AHBottomNavigationItem
 * The item is display in the AHBottomNavigation layout
 */
public class AHBottomNavigationItem {

    private String title = "";
    private Drawable activeDrawable;
    private Drawable unactiveDrawable;
    private int color = Color.GRAY;

    private
    @StringRes
    int titleRes = 0;
    private
    @DrawableRes
    int activeDrawableRes = 0;
    @DrawableRes
    int unactiveDrawableRes = 0;
    private
    @ColorRes
    int colorRes = 0;

    @ColorRes
    private int activeIconColorRes = 0;
    @ColorRes
    private int inactiveIconColorRes = 0;

    /**
     * Constructor
     *
     * @param title    Title
     * @param resource Drawable resource
     */
    public AHBottomNavigationItem(String title, @DrawableRes int resource) {
        this.title = title;
        this.activeDrawableRes = resource;
    }

    /**
     * @param title    Title
     * @param resource Drawable resource
     * @param color    Background color
     */
    @Deprecated
    public AHBottomNavigationItem(String title, @DrawableRes int resource, @ColorRes int color) {
        this.title = title;
        this.activeDrawableRes = resource;
        this.color = color;
    }

    /**
     * Constructor
     *
     * @param titleRes    String resource
     * @param activeDrawableRes Drawable resource
     * @param colorRes    Color resource
     */
    public AHBottomNavigationItem(@StringRes int titleRes, @DrawableRes int activeDrawableRes, @DrawableRes int unactiveDrawableRes, @ColorRes int colorRes) {
        this.titleRes = titleRes;
        this.activeDrawableRes = activeDrawableRes;
        this.unactiveDrawableRes = unactiveDrawableRes;
        this.colorRes = colorRes;
    }

    /**
     * Constructor
     *
     * @param title    String
     * @param activeDrawable Drawable
     */
    public AHBottomNavigationItem(String title, Drawable activeDrawable) {
        this.title = title;
        this.activeDrawable = activeDrawable;
    }

    /**
     * Constructor
     *
     * @param title    String
     * @param activeDrawable Drawable
     * @param color    Color
     */
    public AHBottomNavigationItem(String title, Drawable activeDrawable, @ColorInt int color) {
        this.title = title;
        this.activeDrawable = activeDrawable;
        this.color = color;
    }

    public String getTitle(Context context) {
        if (titleRes != 0) {
            return context.getString(titleRes);
        }
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.titleRes = 0;
    }

    public void setTitle(@StringRes int titleRes) {
        this.titleRes = titleRes;
        this.title = "";
    }

    public int getColor(Context context) {
        if (colorRes != 0) {
            return ContextCompat.getColor(context, colorRes);
        }
        return color;
    }

    public int getInactiveIconColor(Context context) {
        if (inactiveIconColorRes != 0) {
            return ContextCompat.getColor(context, inactiveIconColorRes);
        }
        return color;
    }

    public int getInactiveIconColorRes() {
        return inactiveIconColorRes;
    }

    public void setInactiveIconColorRes(@ColorRes int colorRes) {
        this.inactiveIconColorRes=colorRes;
    }

    public int getActiveIconColor(Context context) {
        if (activeIconColorRes != 0) {
            return ContextCompat.getColor(context, activeIconColorRes);
        }
        return color;
    }

    public int getActiveIconColorRes() {
        return activeIconColorRes;
    }

    public void setActiveIconColorRes(@ColorRes int colorRes) {
        this.activeIconColorRes=colorRes;
    }

    public void setColor(@ColorInt int color) {
        this.color = color;
        this.colorRes = 0;
    }

    public void setColorRes(@ColorRes int colorRes) {
        this.colorRes = colorRes;
        this.color = 0;
    }

    public Drawable getActiveDrawable(Context context) {
        if (activeDrawableRes != 0) {
            try {
                return AppCompatResources.getDrawable(context, activeDrawableRes);
            } catch (Resources.NotFoundException e) {
                return ContextCompat.getDrawable(context, activeDrawableRes);
            }
        }
        return activeDrawable;
    }

    public void setActiveDrawable(@DrawableRes int drawableRes) {
        this.activeDrawableRes = drawableRes;
        this.activeDrawable = null;
    }

    public void setActiveDrawable(Drawable drawable) {
        this.activeDrawable = drawable;
        this.activeDrawableRes = 0;
    }

    public Drawable getUnactiveDrawable(Context context) {
        if (unactiveDrawableRes != 0) {
            try {
                return AppCompatResources.getDrawable(context, unactiveDrawableRes);
            } catch (Resources.NotFoundException e) {
                return ContextCompat.getDrawable(context, unactiveDrawableRes);
            }
        }
        return unactiveDrawable;
    }

    public void setUnactiveDrawable(@DrawableRes int drawableRes) {
        this.unactiveDrawableRes = drawableRes;
        this.unactiveDrawable = null;
    }

    public void setUnactiveDrawable(Drawable drawable) {
        this.unactiveDrawable = drawable;
        this.unactiveDrawableRes = 0;
    }
}
