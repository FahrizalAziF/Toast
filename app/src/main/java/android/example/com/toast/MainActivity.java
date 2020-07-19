package android.example.com.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    LinearLayout container;
    Context context;
    CharSequence text;
    View layout;
    int duration= Toast.LENGTH_SHORT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context=getApplicationContext();
        text="Hello Azi";

        final Toast toast=Toast.makeText(context,text,duration);
        Button btn_toast=findViewById(R.id.btn_toast);
        btn_toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toast.show();
            }
        });


        /*Custom Toast*/

        container=findViewById(R.id.custom_toast_container);
        LayoutInflater layoutInflater=getLayoutInflater();
        layout=layoutInflater.inflate(R.layout.custom_dialog, container);


        TextView text = layout.findViewById(R.id.text);
        text.setText("Hellas Azi!");
        Button btn_toast_custom=findViewById(R.id.btn_toast_custom);
        btn_toast_custom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(context);
                toast.setGravity(Gravity.BOTTOM,0,50);
                toast.setDuration(duration);
                toast.setView(layout);
                toast.show();
            }
        });




    }


}
