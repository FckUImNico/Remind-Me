package com.arcticon.remindme;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class Activity_main extends Activity implements OnClickListener {
	
	private TextView output;
	private int temp = 0;
	private Button plus, minus, change;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_main);
        
        plus = (Button)findViewById(R.id.buttonAdd);
        minus = (Button)findViewById(R.id.buttonSub);
        change = (Button)findViewById(R.id.buttonChange);
        output = (TextView)findViewById(R.id.textViewTestText);

        output.setText("");
        
        plus.setOnClickListener(this);
        minus.setOnClickListener(this);
        change.setOnClickListener(this);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    
    public void onClick(View v) {
    	switch(v.getId()){
    		case R.id.buttonAdd:
    			temp++;
    			output.setText("temp= " + temp + "!");
    			break;
    		case R.id.buttonSub:
    			temp--;
    			output.setText("temp= " + temp + "!");
    			break;
    		case R.id.buttonChange:
//    			Toast.makeText(this, "BLA", Toast.LENGTH_SHORT).show();
    			startActivity(new Intent(this, Activity_settings.class));
    			break;
    	}
	}
}
