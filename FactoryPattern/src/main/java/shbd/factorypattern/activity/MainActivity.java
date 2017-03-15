package shbd.factorypattern.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import shbd.factorypattern.staticfactory.ChartProduct;
import shbd.factorypattern.staticfactory.StaticFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ChartProduct pie = StaticFactory.createProduct("pie");
        pie.addData();
        pie.display();
    }
}
