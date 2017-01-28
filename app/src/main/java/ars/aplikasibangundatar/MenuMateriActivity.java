package ars.aplikasibangundatar;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.view.Window;
import android.widget.Button;


/**
 * Created by SDW PC on 28/01/2017.
 */

public class MenuMateriActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menu_materi);

        Button lingkaran, layanglayang, segitigasamakaki, segitigasikusiku, segitigasembarang, segitigasamasisi, persegi, persegipanjang, jajargenjang, trapesium, belahketupat;


        lingkaran = (Button) findViewById(R.id.lingkaran);
        layanglayang = (Button) findViewById(R.id.layanglayang);
        segitigasamakaki = (Button) findViewById(R.id.segitigasamakaki);
        segitigasamasisi = (Button) findViewById(R.id.segitigasamasisi);
        segitigasikusiku = (Button) findViewById(R.id.segitigasamasikusiku);
        segitigasembarang = (Button) findViewById(R.id.segitigasembarang);
        persegi = (Button) findViewById(R.id.persegi);
        persegipanjang = (Button) findViewById(R.id.persegipanjang);
        jajargenjang = (Button) findViewById(R.id.jajargenjang);
        trapesium = (Button) findViewById(R.id.trapesium);
        belahketupat = (Button) findViewById(R.id.belahketupat);

        lingkaran.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, LingkaranActivity.class);
                startActivity(il);
            }      });
        layanglayang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, LayangLayangActivity.class);
                startActivity(il);
            }      });
        segitigasamakaki.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, SegitigaSamaKakiActivity.class);
                startActivity(il);
            }      });
        segitigasamasisi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, SegitigaSamaSisiActivity.class);
                startActivity(il);
            }      });
        segitigasembarang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, SegitigaSembarangActivity.class);
                startActivity(il);
            }      });
        segitigasikusiku.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, SegitigaSikuSikuActivity.class);
                startActivity(il);
            }      });
        persegi.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, PersegiActivity.class);
                startActivity(il);
            }      });
        persegipanjang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, PersegiPanjangActivity.class);
                startActivity(il);
            }      });
        jajargenjang.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, JajarGenjangActivity.class);
                startActivity(il);
            }      });
        trapesium.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, TrapesiumActivity.class);
                startActivity(il);
            }      });
        belahketupat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent il = new Intent(MenuMateriActivity.this, BelahKetupatActivity.class);
                startActivity(il);
            }      });
    }}