package com.sample.fcmimplementation;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.media.RingtoneManager;
import android.net.Uri;
import android.support.v4.app.NotificationCompat;
import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

import java.util.Map;

/*
* Created by engr.erum on 6/20/16.
        * <p>
        * <p>
        * <p/> Class Description:
        *
        * @author engr.erum
        *         <p>
*         Company Name: abc
        *         <p>
*         Jira Ticket: NULL
        * @since 20 June, 2016
        */

public class MyFirebaseMessagingService extends FirebaseMessagingService {

    private final String TAG = MyFirebaseMessagingService.class.getName();

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {

        Log.d(TAG, "From: " + remoteMessage.getFrom());
        Map data = remoteMessage.getData();
        Log.d(TAG, "data:" + data);

        //if you have sample message notification like this :
        /*{"id":1011,
         "title": "This is sample title",
        "message": "This is sample message"}
        */
        //to print title from remote message if exists
        Log.d(TAG, "title:" + data.get(R.string.title));


        //to print message from remote message if exists
        Log.d(TAG, "title:" + data.get(R.string.message));

        //method to generate notification
        sendNotification(remoteMessage.getNotification().getBody());
    }

    //This method is to generate push notification
    private void sendNotification(String messageBody) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 0, intent,
                PendingIntent.FLAG_ONE_SHOT);

        Uri defaultSoundUri = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);
        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(this)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(String.valueOf(R.string.fcm))
                .setContentText(messageBody)
                .setAutoCancel(true)
                .setSound(defaultSoundUri)
                .setContentIntent(pendingIntent);

        NotificationManager notificationManager =
                (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        notificationManager.notify(0, notificationBuilder.build());
    }
}
