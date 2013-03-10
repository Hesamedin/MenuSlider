package com.kamalan.menuslider;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created with IntelliJ IDEA.
 * User: Hesamedin
 * Date: 3/10/13
 * Time: 2:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class SlidingLeftFragment extends Fragment {

    private static final String TAG = "SlidingLeftFragment";

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.sliding_left, null);
    }

    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        Log.i(TAG, "Activity created");
    }
}
