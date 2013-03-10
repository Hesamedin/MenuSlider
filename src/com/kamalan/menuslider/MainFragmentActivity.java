package com.kamalan.menuslider;

import android.os.Bundle;
import android.util.Log;
import com.kamalan.slider.SlidingMenu;

/**
 * Created with IntelliJ IDEA.
 * User: Hesamedin
 * Date: 3/10/13
 * Time: 12:17 AM
 * To change this template use File | Settings | File Templates.
 */
public class MainFragmentActivity extends BaseFragmentActivity {

    private final String TAG = "MainFragmentActivity";

    public MainFragmentActivity() {
        super(R.string.left_and_right);
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "=========================");
        Log.d(TAG, "Try to create activity...");
        Log.d(TAG, "=========================");

        // Setup sliding frames
        getSlidingMenu().setMode(SlidingMenu.LEFT_RIGHT);
        getSlidingMenu().setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        setContentView(R.layout.slider_frame_content);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.slider_frame_content, new SlidingContentFragment())
                .commit();

        getSlidingMenu().setSecondaryMenu(R.layout.slider_frame_right);
        getSlidingMenu().setSecondaryShadowDrawable(R.drawable.shadowright);
        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.slider_frame_right, new SlidingRightFragment())
                .commit();
    }
}
