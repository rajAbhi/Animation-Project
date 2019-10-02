package com.example.animation_basic;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import java.util.LinkedList;
import java.util.Queue;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new func().execute();

    }

    Button btn;


    class func extends AsyncTask<Void, Integer, Void> {
        @Override
        protected Void doInBackground(Void... voids) {
            Log.e("Abhilash", "inDoInBackgorund");

            Queue<Integer> q = new LinkedList<>();

            q.add(1);
            q.add(-1);

            while (!q.isEmpty()) {
                int index = q.peek();
                q.remove();
                if (index == -1) {
                    if (!q.isEmpty()) {
                        q.add(-1);

                    }
                }else {
                        if (index == 1) {
                            publishProgress((int) (1));
                            q.add(2);
                            q.add(3);
                            q.add(4);
                            q.add(5);
                            try {
                                Thread.sleep(5000);
                            } catch (InterruptedException e) {
                                e.printStackTrace();
                            }
                        }
                        if (index == 2) {
                            publishProgress((int) (2));
                        }
                        if (index == 3) {
                            publishProgress((int) (3));
                        }
                        if (index == 4) {
                            publishProgress((int) (4));
                        }
                        if (index == 5) {
                            publishProgress((int) (5));
                        }
                    }
                }


            return null;
        }

        @Override
        protected void onProgressUpdate(Integer... values) {
            Log.e("Abhilash", "inProgress");
            if (values[0] == 1) {
                btn = (Button) findViewById(R.id.Button1);
                btn.setText("abcd");
            }
            if (values[0] == 2) {
                btn = (Button) findViewById(R.id.Button2);
                btn.setText("abcd");
            }
            if (values[0] == 3) {
                btn = (Button) findViewById(R.id.Button3);
                btn.setText("abcd");
            }
            if (values[0] == 4) {
                btn = (Button) findViewById(R.id.Button4);
                btn.setText("abcd");
            }
            if (values[0] == 5) {
                btn = (Button) findViewById(R.id.Button5);
                btn.setText("abcd");
            }
        }

    }
}


