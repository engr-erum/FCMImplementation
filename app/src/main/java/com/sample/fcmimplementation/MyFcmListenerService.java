package com.sample.fcmimplementation;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

/**
 * Created by engr.erum on 6/20/16.
 * <p/>
 * <p/>
 * <p/> Class Description:
 *
 * @author engr.erum
 *         <p/>
 *         Company Name: abc
 *         <p/>
 *         Jira Ticket: NULL
 * @since 20 June, 2016
 */
public class MyFcmListenerService extends FirebaseInstanceIdService {

    private  final String TAG = MyFcmListenerService.class.getName();

    @Override
    public void onTokenRefresh() {

        //this line will give registration token
        String refreshedToken = FirebaseInstanceId.getInstance().getToken();

        //log registration token to verify you are not getting null.
        Log.d(TAG, "Refreshed token: " + refreshedToken);

    }

    private void sendRegistrationToServer(String token) {
        //here write logic to send Registration Token to Server and save it in SharedPreferences For later use
    }
}
