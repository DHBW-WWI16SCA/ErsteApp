package ersteapp.dietzm.de.ersteapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent i = getIntent();
        String user = i.getStringExtra("username");

        View v = findViewById(R.id.textView2);
        TextView tv = (TextView) v;
        tv.setText("Hallo " + user);



    }
}
