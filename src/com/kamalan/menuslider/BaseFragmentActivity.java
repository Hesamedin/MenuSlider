package com.kamalan.menuslider;

import android.os.Bundle;
import android.support.v4.app.*;

import android.widget.Toast;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;
import com.kamalan.slider.SlidingMenu;
import com.kamalan.slider.app.SlidingFragmentActivity;
import com.kamalan.utility.*;

/**
 * Created with IntelliJ IDEA.
 * User: Hesamedin
 * Date: 3/10/13
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseFragmentActivity extends SlidingFragmentActivity {

    private int mTitleRes;
    protected Fragment mFrag;

    public BaseFragmentActivity(int titleRes) {
        mTitleRes = titleRes;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setTitle(mTitleRes);

        // set the Behind View
        setBehindContentView(R.layout.slider_frame_left);
        FragmentTransaction t = this.getSupportFragmentManager().beginTransaction();
        mFrag = new SlidingLeftFragment();
        t.replace(R.id.slider_frame_left, mFrag);
        t.commit();

        // customize the SlidingMenu
        SlidingMenu sm = getSlidingMenu();
        sm.setShadowWidthRes(R.dimen.shadow_width);
        sm.setShadowDrawable(R.drawable.shadow);
        sm.setBehindOffsetRes(R.dimen.slidingmenu_offset);
        sm.setFadeDegree(0.35f);
        sm.setTouchModeAbove(SlidingMenu.TOUCHMODE_FULLSCREEN);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                toggle();
                return true;
            case R.id.github:
                Toast.makeText(getApplicationContext(), "Github clicked.", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getSupportMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
