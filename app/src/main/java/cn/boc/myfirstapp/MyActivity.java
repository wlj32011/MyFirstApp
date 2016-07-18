package cn.boc.myfirstapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends AppCompatActivity {

    public static final String MESSAGE_CONTENT = "MESSAGE_CONTENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my);
    }



    public void sendMessage(View view){

        EditText messageInput = (EditText) findViewById(R.id.mesage_edit);
        String message = messageInput.getText().toString();
        Intent intent = new Intent(MyActivity.this,DetailActivity.class);
        intent.putExtra(MESSAGE_CONTENT,message);
        startActivity(intent);
    }
}
