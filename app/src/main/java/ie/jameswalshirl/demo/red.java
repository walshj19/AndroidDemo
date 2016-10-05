package ie.jameswalshirl.demo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class Red extends Activity{

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_red);
    }

    void click(View v){
        finish();
    }
}
