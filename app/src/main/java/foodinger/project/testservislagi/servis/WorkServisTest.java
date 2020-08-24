package foodinger.project.testservislagi.servis;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.media.MediaPlayer;
import android.os.Build;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.core.app.NotificationCompat;
import androidx.work.Worker;
import androidx.work.WorkerParameters;

import foodinger.project.testservislagi.R;
import foodinger.project.testservislagi.pojo.Post;
import foodinger.project.testservislagi.pojo.ResponGetDataUSer;
import foodinger.project.testservislagi.retrofit.RetrofitLinkApi;
import foodinger.project.testservislagi.retrofit.RetrofitMethod;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class WorkServisTest extends Worker {

    private MediaPlayer player;
    private static final String CHANNEL_ID = "work_chanel";
    public WorkServisTest(@NonNull Context context, @NonNull WorkerParameters workerParams) {
        super(context, workerParams);
    }

    @NonNull
    @Override
    public Result doWork() {
       // showNotification("Inducesmile", "Hello world, work completed");
        getDataRetrofit();
        return Result.success();
        //return null;
    }

    public void getDataRetrofit(){

        RetrofitMethod retrofitMethod =  RetrofitLinkApi.getRetrofitLogin().create(RetrofitMethod.class);
        Call<ResponGetDataUSer> call= retrofitMethod.getOrder();
        call.enqueue(new Callback<ResponGetDataUSer>() {
            @Override
            public void onResponse(Call<ResponGetDataUSer> call, Response<ResponGetDataUSer> response) {

                ResponGetDataUSer responTerimaOrder=response.body();
               // Post post =responTerimaOrder.getData();
                if(response.isSuccessful()){
                    //playMusic();
                    //nanti dulu
                    // sharedPrefHandle.saveIdUserPost(SharedPrefHandle.SP_ID_POST_USER, (int) post.getID());
                  //  addNotification();
                    showNotification("Inducesmile", "Hello world, work completed");
                }
                else {
                    // error case
                    switch (response.code()) {
                        case 404:
                            Toast.makeText(getApplicationContext(), "404 order not found", Toast.LENGTH_SHORT).show();
                            break;
                        case 500:
                            Toast.makeText(getApplicationContext(), "500 internal server error", Toast.LENGTH_SHORT).show();
                            break;
                        default:
                            Toast.makeText(getApplicationContext(), "unknown error ", Toast.LENGTH_SHORT).show();
                            break;
                    }
                }

            }

            @Override
            public void onFailure(Call<ResponGetDataUSer> call, Throwable t) {
                Toast.makeText(getApplicationContext(), "network failure :( inform the user and possibly retry eror dari kelas ForegroundServies", Toast.LENGTH_SHORT).show();

            }
        });


    }

    private void showNotification(String title, String task){
        NotificationManager notificationManager = (NotificationManager) getApplicationContext().getSystemService(Context.NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O){
            NotificationChannel notificationChannel = new NotificationChannel("inducesmile", "inducesmile", NotificationManager.IMPORTANCE_DEFAULT);
            notificationManager.createNotificationChannel(notificationChannel);
        }
        NotificationCompat.Builder notification = new NotificationCompat.Builder(getApplicationContext(),"inducesmile")
                .setContentTitle(title)
                .setContentText(task)
                .setSmallIcon(R.mipmap.ic_launcher);
        notificationManager.notify(1, notification.build());
    }
}
