package com.rensisi.ariz.ariz;

import android.app.Activity;
import android.support.v4.app.Fragment;

/**
 * Created by kellen_home on 2016/11/16.
 */

public abstract class Flow extends Activity{
    Fragment mFragment;

    abstract void stepForword();
    abstract void stepBack();
    abstract boolean save();

}
