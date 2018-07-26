package young.project.android.com.libandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class JokeDisplayActivity extends AppCompatActivity {

    public static final String JOKE_EXTRA_INTENT_KEY = "joke_extra_intent_key";
    private TextView mJokeTextView;
    private String mJoke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke_display);
        mJokeTextView = (TextView) findViewById(R.id.tv_joke);
        if(getIntent().getStringExtra(JOKE_EXTRA_INTENT_KEY) != null) {
            mJoke = getIntent().getStringExtra(JOKE_EXTRA_INTENT_KEY);
            mJokeTextView.setText(mJoke);
        }

    }
}
