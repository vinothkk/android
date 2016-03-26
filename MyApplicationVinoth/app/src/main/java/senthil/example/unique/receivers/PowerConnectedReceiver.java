package senthil.example.unique.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

/**
 * Created by senthil on 26/3/16.
 */
public class PowerConnectedReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Toast.makeText(context, "Either power connected or disconnected", Toast.LENGTH_SHORT).show();
    }
}
