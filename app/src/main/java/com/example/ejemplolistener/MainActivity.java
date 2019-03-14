package com.example.ejemplolistener;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {


    private Button mBoton_action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBoton_action = findViewBuId(R.id.action_boton);

        mBoton_action.setOnClickListener(new View.OnClickListener(){
            @Override
            public void OnCLick(View v){
                mBoton_action.setText("Click");
            }
        });

    }
}
