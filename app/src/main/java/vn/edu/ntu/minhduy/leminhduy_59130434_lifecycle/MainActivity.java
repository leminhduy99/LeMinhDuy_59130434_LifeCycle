package vn.edu.ntu.minhduy.leminhduy_59130434_lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
    TextView txtMD;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtMD = findViewById(R.id.txtMD);
        Toast.makeText(getApplicationContext(), "onCreate", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onCreate called");
    }

    @Override
    protected void onStart() {
        super.onStart();
        SimpleDateFormat spf = new SimpleDateFormat("HH:mm:ss");
        String strDate = spf.format(new Date());
        txtMD.setText(strDate);
        Toast.makeText(getApplicationContext(), "onStart", Toast.LENGTH_SHORT).show();
        Log.d("LifeCycle", "onStart called");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle", "onStop called");
        Toast.makeText(getApplicationContext(), "onStop", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle", "onDestroy called");
        Toast.makeText(getApplicationContext(), "onDestroy", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle", "onPause called");
        Toast.makeText(getApplicationContext(), "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle", "oResume called");
        Toast.makeText(getApplicationContext(), "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle", "onRestart called");
        Toast.makeText(getApplicationContext(), "onRestart", Toast.LENGTH_SHORT).show();
    }
}
