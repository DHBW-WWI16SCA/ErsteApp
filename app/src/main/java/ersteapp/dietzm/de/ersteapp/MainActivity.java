package ersteapp.dietzm.de.ersteapp;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextClock;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        System.out.println("APPSTATUS:  onCreate");
    }


    protected void buttonPressed(View v){

        //Print the click to the log
        System.out.println("APPSTATUS:  CLICKED");

        /*
        // Cast the view v to a button and adapt it
        if(v instanceof Button) {
            Button button = (Button) v;
            button.setText("Test");
            button.setBackgroundColor(getResources().getColor(R.color.colorAccent));
        }

        //Get the textview by id and change the text
        View textview = findViewById(R.id.textview1);
        TextView tv = (TextView) textview;
        tv.setText("Hallo Du!");

*/

/*
        //Intent that open another activity (explicit) and passes a value
        Intent i = new Intent(this, Main3Activity.class);
        i.putExtra("username", "Peter");
        startActivity(i);

        //Intent that wants to open settings (implicit)
        Intent i2 = new Intent();
        i2.setAction("SHOW_SETTINGS");
        startActivity(i2);

*/

        //Show a toast
        Toast t = Toast.makeText(this,"Settings started", Toast.LENGTH_LONG);
        t.show();



    }



    @Override
    protected void onStart() {
        super.onStart();
        System.out.println("APPSTATUS:  onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        System.out.println("APPSTATUS:  onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        System.out.println("APPSTATUS:  onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        System.out.println("APPSTATUS:  onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        System.out.println("APPSTATUS:  onDestroy");
    }
}
