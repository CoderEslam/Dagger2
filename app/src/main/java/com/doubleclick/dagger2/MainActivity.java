package com.doubleclick.dagger2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {


    @Inject
    Coffee coffee;

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * com.doubleclick.dagger2.CoffeeModule must be set
         * CoffeeComponent coffeeComponent0 = DaggerCoffeeComponent.builder().build();
         * */
        CoffeeComponent coffeeComponent = DaggerCoffeeComponent.builder().sugar(55).milk(6).build();
        coffeeComponent.injectActivity(this);
        TextView t = findViewById(R.id.text);
        t.setText(coffee.getCoffeeCup());


    }
}