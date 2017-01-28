package ars.aplikasibangundatar;

import android.app.Activity;
import android.content.Intent;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MenuUtamaActivity extends Activity {
 Button tekan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);


        setContentView(R.layout.menu_utama);
        tekan = (Button) findViewById(R.id.mulai);
        tekan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuUtamaActivity.this, MenuBangunDatarActivity.class);
                startActivity(il);
            }

        });

    }
}
