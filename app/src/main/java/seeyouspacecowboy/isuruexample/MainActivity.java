package seeyouspacecowboy.isuruexample;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String INTENT_KEY = "SOME_KEY";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                sendMessage(v);
            }
        });
    }

    public void sendMessage(View view) {
        Intent intent = new Intent(this, SecondActivityWithPassedInfo.class);
        EditText editText = (EditText) findViewById(R.id.editText);
        String message = editText.getText().toString();
        intent.putExtra(INTENT_KEY, message);
        startActivity(intent);
    }
}
