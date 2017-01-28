package ars.aplikasibangundatar;

import android.app.Activity;
import android.os.Bundle;
import android.view.Window;

/**
 * Created by SDW PC on 28/01/2017.
 */
public class MenuAboutActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.about);

    }}