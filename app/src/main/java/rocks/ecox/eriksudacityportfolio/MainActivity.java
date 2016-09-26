package rocks.ecox.eriksudacityportfolio;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static rocks.ecox.eriksudacityportfolio.R.id.btnPopularMovies;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Button btnPopularMovies = (Button) findViewById(btnPopularMovies);
//        Button btnStockHawk = (Button) findViewById(R.id.btnStockHawk);
//        Button btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
//        Button btnMakeYourAppMaterial = (Button) findViewById(R.id.btnMakeYourAppMaterial);
//        Button btnGoUbiquitous = (Button) findViewById(R.id.btnGoUbiquitous);
//        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);

    }

    // When the user touches a button display a toast
    public void btnToast(View v) {
        String appName = "";
        switch (v.getId()) {
            case R.id.btnPopularMovies:
                appName = "Popular Movies";
                break;
            case R.id.btnStockHawk:
                appName = "Stock Hawk";
                break;
            case R.id.btnBuildItBigger:
                appName = "Build It Bigger";
                break;
            case R.id.btnMakeYourAppMaterial:
                appName = "Make Your App Material";
                break;
            case R.id.btnGoUbiquitous:
                appName = "Go Ubiquitous";
                break;
            case R.id.btnCapstone:
                appName = "Capstone";
                break;
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        String msg = String.format("This button will launch my %s app!", appName);

        Toast toast = Toast.makeText(context, msg, duration);
        toast.show();
    }

}
