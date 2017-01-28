package ars.aplikasibangundatar;

/**
 * Created by SDW PC on 27/01/2017.
 */
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;


public class MenuHasilActivity extends Activity {
    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.menuhasil);

        mGrade = (TextView)findViewById(R.id.grade);
        mFinalScore = (TextView)findViewById(R.id.outOf);
        mRetryButton = (Button)findViewById(R.id.retry);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        mFinalScore.setText("Score Anda " + score + " Dari " + LibraryPertanyaan.questions.length);

        if (score >= 10){
            mGrade.setText("SANGAT BAIK");
        }else if (score <= 8){
            mGrade.setText("Baik");
        }else if (score <= 6) {
            mGrade.setText("CUKUP");
        }else {
            mGrade.setText("MOHON BELAJAR LAGI");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MenuHasilActivity.this, MenuLatihanActivity.class));
                MenuHasilActivity.this.finish();
            }
        });

    }
}
