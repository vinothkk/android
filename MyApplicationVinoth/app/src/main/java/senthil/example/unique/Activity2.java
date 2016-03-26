package senthil.example.unique;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by senthil on 26/3/16.
 */
public class Activity2 extends AppCompatActivity {
    TextView mTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity2);

        mTextView = (TextView) findViewById(R.id.passsed_data);

        mTextView.setText(getIntent().getExtras().getString("data"));
    }
}
