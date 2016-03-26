package senthil.example.unique;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {

    private TextView mTextView;
    private EditText mEditText;
    private Button mBtn, mBtn2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity1);


        mEditText = (EditText) findViewById(R.id.input);
        mBtn = (Button) findViewById(R.id.btn);
        mBtn2 = (Button) findViewById(R.id.btn2);

        mBtn.setOnClickListener(this);
        mBtn2.setOnClickListener(this);
        Log.i("Present state: ", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("Present state: ", "onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("Present state: ", "onRestart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("Present state: ", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("Present state: ", "onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("Present state: ", "onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("Present state: ", "onDestroy");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i("Present state: ", "onBackPressed");
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btn) {
            Intent intent = new Intent(this, Activity2.class);
            intent.putExtra("data", mEditText.getText().toString());
            startActivity(intent);
        } else if(v.getId() == R.id.btn2) {
            Intent intent = new Intent(this, Activity32.class);
            intent.putExtra("data", mEditText.getText().toString());
            startActivity(intent);
        }
    }
}
