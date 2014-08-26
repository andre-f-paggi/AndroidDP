package br.com.androiddp;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends Activity {
	ListView menu;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
		menu = (ListView) findViewById(R.id.lvMenu);
		
		String[] array = {"1", "2", "3"};
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.item, array);
		
		menu.setAdapter(adapter);
		
		
	}
	
}
