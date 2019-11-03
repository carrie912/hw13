package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

@SuppressWarnings("ControlFlowStatementWithoutBraces")
public class MainActivity extends AppCompatActivity {

    private Button button;

    private EditText a;

    public ImageView mage1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mage1 = (ImageView) findViewById(R.id.imageView2);
        button = (Button) findViewById(R.id.button);
        a = (EditText)findViewById(R.id.editText);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                float fh = Float.parseFloat(a.getEditableText().toString());
                float fresult;
                fresult = fh;
                if (fresult==1)
                    (mage1).setImageResource(R.drawable.a1);

                else if (fresult==2)
                    (mage1).setImageResource(R.drawable.a2);

                else if (fresult==3)
                    (mage1).setImageResource(R.drawable.a3);

                else if (fresult==4)
                    (mage1).setImageResource(R.drawable.a4);

                else if (fresult==5)
                    (mage1).setImageResource(R.drawable.a5);

                else if (fresult==6)
                    (mage1).setImageResource(R.drawable.a6);

                else if (fresult==7)
                    (mage1).setImageResource(R.drawable.a7);

                else if (fresult==8)
                    (mage1).setImageResource(R.drawable.a8);

                else if (fresult==9)
                    (mage1).setImageResource(R.drawable.a9);

                else if (fresult==10)
                    (mage1).setImageResource(R.drawable.a10);



            }
    });

    }

}

