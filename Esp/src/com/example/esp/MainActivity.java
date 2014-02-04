package com.example.esp;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * http://y-anz-m.blogspot.jp/2013/11/android-ui-testing-framework-espresso.html
 * @author keko
 *
 */
public class MainActivity extends Activity {

	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.activity_main);

	        final EditText idView = (EditText) findViewById(R.id.editText1);
	        final EditText passView = (EditText) findViewById(R.id.editText2);
	        final TextView statusView = (TextView) findViewById(R.id.textView3);

	        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {

	            @Override
	            public void onClick(View v) {
	                statusView.setText("");
	                String id = idView.getText().toString();
	                if (TextUtils.isEmpty(id)) {
	                    statusView.setText("IDが入力されていません");
	                    return;
	                }
	                String pass = passView.getText().toString();
	                if (TextUtils.isEmpty(pass)) {
	                    statusView.setText("Passwordが入力されていません");
	                    return;
	                }

	                if (check(id, pass)) {
	                    Intent intent = new Intent(MainActivity.this, MainActivity2.class);
	                    intent.putExtra("id", id);
	                    startActivity(intent);
	                } else {
	                    statusView.setText("IDとPasswordの組み合わせが違います");
	                }
	            }
	        });
	    }

	    boolean check(String id, String pass) {
	        // dummy
	        return true;
	    };
}
