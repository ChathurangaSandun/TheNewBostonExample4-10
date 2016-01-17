package com.clivekumara.thenewbostonexample1;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button btAdd,btReduse;
    TextView tvDisplay;
    int total;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initComponents();

        total = Integer.parseInt(tvDisplay.getText().toString().split(":")[1].trim());





    }

    private void initComponents() {
        btAdd = (Button) findViewById(R.id.btAdd);
        btReduse = (Button) findViewById(R.id.btReduse);
        tvDisplay = (TextView) findViewById(R.id.tvDisplay);

        btAdd.setOnClickListener(this);
        btReduse.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    @Override
    public void onClick(View v) {




        switch (v.getId()){
            case R.id.btAdd:
                total += 1;
                tvDisplay.setText("Your Total is : "+String.valueOf(total));
                break;
            case R.id.btReduse:
                total -= 1;
                tvDisplay.setText("Your Total is : "+String.valueOf(total));
                break;

        }

    }
}
