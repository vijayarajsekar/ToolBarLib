package com.hkm.advancedtoolbar.socialbar;

import android.support.annotation.DrawableRes;
import android.support.annotation.IdRes;

import com.hkm.advancedtoolbar.R;

/**
 * Created by hesk on 24/7/15.
 * <p/>
 * com.facebook.messenger.intents.ShareIntentHandler
 * com.facebook.orca
 * <p/>
 * jp.naver.line.android.activity.selectchat.SelectChatActivity
 * jp.naver.line.android
 * <p/>
 * com.pinterest.activity.create.PinItActivity
 * com.pinterest
 */
public enum Hg {
    pintrest("com.pinterest", R.drawable.pinterest, R.id.pinterest),
    facebook("com.facebook.katana", R.drawable.fb, R.id.facebook),
    whatsapp("com.whatsapp", R.drawable.whatsapp, R.id.whatsapp),
    twitter("com.twitter.android", R.drawable.twitter, R.id.twitter),
    message("com.tencent.mm.ui.tools.ShareToTimeLineUI", R.drawable.message, R.id.message);

    private String package_name;
    private int drawbable, extn;

    Hg(final String packagename, final @DrawableRes int fl, final @IdRes int extn) {
        this.package_name = packagename;
        this.drawbable = fl;
        this.extn = extn;
    }

    public String getPackageName() {
        return package_name;
    }

    public int getDrawable() {
        return drawbable;
    }

    public int Id() {
        return extn;
    }

    public static Hg reverseId(final @IdRes int id) throws Exception {
        final int l = Hg.values().length;
        for (int i = 0; i < l; i++) {
            if (Hg.values()[i].Id() == id) {
                return Hg.values()[i];
            }
        }
        throw new Exception("not found here");
    }
}