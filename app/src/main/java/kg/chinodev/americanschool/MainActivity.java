package kg.chinodev.americanschool;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private ConstraintLayout serviceLanguage;
    private ConstraintLayout serviceCamp;
    private ConstraintLayout serviceTalking;
    private ConstraintLayout serviceToefl;
    private TextView callBtn; //sdadsad
    private ConstraintLayout banner;
    int x = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        serviceLanguage = findViewById(R.id.service_language);
        serviceCamp = findViewById(R.id.service_camp);
        serviceTalking = findViewById(R.id.service_talking);
        serviceToefl = findViewById(R.id.service_toefl);
        callBtn = findViewById(R.id.call_button);
        banner = findViewById(R.id.banner);

        banner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String link = "https://google.com";
                Uri myUri = Uri.parse(link);
                Intent myIntent = new Intent(Intent.ACTION_VIEW, myUri);
                startActivity(myIntent);
            }
        });

        callBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String number = "tel:+996555500500";
                Uri myUri = Uri.parse(number);
                Intent myIntent = new Intent(Intent.ACTION_DIAL, myUri);
                startActivity(myIntent);
            }
        });

        serviceLanguage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startInfoActivity(
                        R.string.service_language,
                        R.drawable.image_1,
                        R.string.service_language_descr
                );
            }
        });
        serviceCamp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        serviceTalking.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        serviceToefl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    private void startInfoActivity(int titleRes, int imageRes, int descrRes) {
        Intent myIntent = new Intent(this, InfoActivity.class);
        myIntent.putExtra("title", titleRes);
        myIntent.putExtra("image", imageRes);
        myIntent.putExtra("descr", descrRes);
        startActivity(myIntent);
    }
}