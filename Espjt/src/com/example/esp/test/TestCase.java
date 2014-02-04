package com.example.esp.test;

import com.example.esp.MainActivity;
import com.example.esp.R;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class TestCase extends ActivityInstrumentationTestCase2<MainActivity> {

	private EditText 	editTextPersonName, editTextPassword ;
	private TextView 	textViewHelloWorld;
	private Button 		button;
	private Activity 	activity;

	
	public TestCase(String pkg, Class<MainActivity> activityClass) {
		super(pkg, activityClass);
		// TODO Auto-generated constructor stub
	}
	
	public TestCase() {
		super("com.example.esp.MainActivity.MainActivity", MainActivity.class);
	}

	@Override
	protected void setUp() throws Exception {
	    // TODO Auto-generated method stub
	    super.setUp();

	    //アクティビティを取得する
	    activity = getActivity();
	    //各オブジェクトとリソースを紐付けする
	    editTextPersonName = (EditText) activity.findViewById(R.id.editText1);
	    editTextPassword = (EditText) activity.findViewById(R.id.editText2);
	    textViewHelloWorld = (TextView) activity.findViewById(R.id.textView3);
	    button = (Button) activity.findViewById(R.id.button1);
	}
	
	public void testInitEditText() {
	    assertTrue(editTextPersonName.getText().toString().length() == 0);
	}
}
