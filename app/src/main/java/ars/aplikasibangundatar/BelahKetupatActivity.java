package ars.aplikasibangundatar;

import android.app.Activity;

import android.os.Bundle;

import android.view.Window;


/**
 * Created by SDW PC on 27/01/2017.
 */

public class BelahKetupatActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.belah_ketupat);

    }}