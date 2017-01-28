package ars.aplikasibangundatar;

/**
 * Created by SDW PC on 27/01/2017.
 */

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;


public class MenuBangunDatarActivity extends Activity {
    Button materi, latihan, about, exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu_bangun_datar);
        materi = (Button) findViewById(R.id.materi);
        latihan = (Button) findViewById(R.id.latihan);
        about = (Button) findViewById(R.id.about);
        exit = (Button) findViewById(R.id.exit);
        materi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuBangunDatarActivity.this, MenuMateriActivity.class);
                startActivity(il);
            }

        });
        latihan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuBangunDatarActivity.this, MenuLatihanActivity.class);
                startActivity(il);
            }

        });
        about.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuBangunDatarActivity.this, MenuAboutActivity.class);
                startActivity(il);
            }

        });
        exit.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                close();
            }

        });


    }

    public void close(){

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Apakah Anda Benar-Benar ingin keluar?")
                .setCancelable(false)
                .setPositiveButton("Ya",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog,
                                                int id) {
                                MenuBangunDatarActivity.this.finish();

                            }
                        })
                .setNegativeButton("Tidak",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,
                                        int id) {
                        dialog.cancel();

                    }
                }).show();
    }


    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            close();

        }
        return super.onKeyDown(keyCode, event);
    }
}
