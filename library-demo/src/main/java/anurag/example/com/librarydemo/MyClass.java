package anurag.example.com.librarydemo;

import android.util.Log;
import android.widget.Toast;

/**
 * Created by Neeraj on 12-Feb-18.
 */

public class MyClass {
    public static final String TAG="This is Awesome";

    public static void getMessage(String message){
        Log.d(TAG,message);
    }

    public static void getString(String message){
        Log.d(TAG,message);
    }
}
