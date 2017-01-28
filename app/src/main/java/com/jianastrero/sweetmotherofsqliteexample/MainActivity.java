package com.jianastrero.sweetmotherofsqliteexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jianastrero.sweetmotherofsqlite.SweetSQLiteConfig;

public class MainActivity extends AppCompatActivity {

    private int ctr;
    private boolean loaded;
    private TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SweetSQLiteConfig.init(this, "sweetmotherofsqliteexample");

        ctr=0;
        loaded=false;
        tv=(TextView)findViewById(R.id.text);
    }

    public void save(View v) {
        SQLiteClass sqLiteClass=new SQLiteClass();
        sqLiteClass.setString("Count: "+ctr);
        sqLiteClass.save();
        ctr++;
        loaded=false;
    }

    public void load(View v) {
        if (!loaded) ctr=1;
        SQLiteClass sqLiteClass=new SQLiteClass();
        sqLiteClass.load("ID = "+ctr);
        tv.setText("SQLiteClass with id: "+ctr+"\n"+sqLiteClass.getString());
        ctr++;
        loaded=true;
    }
}
