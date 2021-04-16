package kg.chinodev.americanschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;

public class ShareActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_share);

        Intent myIntent = getIntent();
        String sendText = myIntent.getData().getEncodedQuery();
        TextView myTextView = findViewById(R.id.textshare);
        myTextView.setText(sendText);
    }
}