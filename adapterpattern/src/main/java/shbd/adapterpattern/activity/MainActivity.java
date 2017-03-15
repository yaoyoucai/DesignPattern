package shbd.adapterpattern.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import shbd.adapterpattern.adapter.Hotel;
import shbd.adapterpattern.adapter.object.DbSocketInterface;
import shbd.adapterpattern.adapter.object.SocketAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        charge();
    }

    private void charge() {
        DbSocketInterface dbSocket = new SocketAdapter();
        Hotel hotel = new Hotel(dbSocket);
        hotel.charge();
    }
}
