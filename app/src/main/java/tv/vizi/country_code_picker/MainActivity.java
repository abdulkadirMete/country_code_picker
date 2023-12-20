package tv.vizi.country_code_picker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import tv.vizi.ccp.CountryCodePicker;

public class MainActivity extends AppCompatActivity {

    CountryCodePicker ccp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ccp = findViewById(R.id.countryCodePicker);
        ccp.requestFocus();

    }
}