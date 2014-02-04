package com.example.esp.test;

import com.example.esp.MainActivity;
import com.example.esp.MainActivity2;
import com.example.esp.R;

import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.EditText;
import android.widget.TextView;

public class TestCase2 extends ActivityInstrumentationTestCase2<MainActivity2> {

	private TextView tv;
	private Activity 	activity;

	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
	    //アクティビティを取得する
	    activity = getActivity();
	    //各オブジェクトとリソースを紐付けする
	    tv = (TextView) activity.findViewById(R.id.textView1);
	}

	public TestCase2(String pkg, Class<MainActivity2> activityClass) {
		super(pkg, activityClass);
		// TODO Auto-generated constructor stub
	}
	
	public TestCase2() {
		super("com.example.esp.MainActivity.MainActivity2", MainActivity2.class);
	}
	
	public void testGettingName() {
//		assertNull(tv.getText());
		assertTrue(tv.getText().length() != 0);
	}

}
