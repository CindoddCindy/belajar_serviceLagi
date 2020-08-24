package foodinger.project.testservislagi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.work.Constraints;
import androidx.work.NetworkType;
import androidx.work.OneTimeWorkRequest;
import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.concurrent.TimeUnit;

import foodinger.project.testservislagi.servis.WorkServisTest;

public class MainActivity extends AppCompatActivity {

    public TextView textView_satu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView_satu=findViewById(R.id.ke_dua);

        final OneTimeWorkRequest workRequest = new OneTimeWorkRequest.Builder(WorkServisTest.class).build();
        WorkManager.getInstance().enqueue(workRequest);

        textView_satu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);

              //  WorkManager.getInstance().enqueue(workRequest);

            }
        });
       // startWork();
    }
    /*
    private void startWork(){
        Constraints constraints = new Constraints.Builder()
                .setRequiresBatteryNotLow(true)
                .setRequiresCharging(true)
                .setRequiredNetworkType(NetworkType.CONNECTED)
                .build();
        PeriodicWorkRequest periodicWorkRequest = new PeriodicWorkRequest.Builder(WorkServisTest.class, 16, TimeUnit.MINUTES)
                .setConstraints(constraints).build();
        WorkManager.getInstance(this).enqueue(periodicWorkRequest);
    }

     */
}