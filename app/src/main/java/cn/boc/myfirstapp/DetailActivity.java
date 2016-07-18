package cn.boc.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView messageText = (TextView) findViewById(R.id.message_text);


        String message = getIntent().getStringExtra(MyActivity.MESSAGE_CONTENT);

        messageText.setText(message);

    }
}
