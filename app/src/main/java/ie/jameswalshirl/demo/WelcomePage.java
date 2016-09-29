package ie.jameswalshirl.demo;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class WelcomePage extends Activity implements View.OnClickListener{
    View button1, button2;
    TextView label;
    EditText textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_page);

        button1 = findViewById(R.id.mybutton1);
        button2 = findViewById(R.id.mybutton2);
        label = (TextView) findViewById(R.id.label);
        textBox = (EditText) findViewById(R.id.text_area);

        textBox.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}
            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {}
            @Override
            public void afterTextChanged(Editable s) {
                label.setText(textBox.getText());
            }
        });
    }

    public void onClick(View v) {
        String viewId = String.valueOf(v.getId());

        Toast.makeText(this, viewId, Toast.LENGTH_SHORT).show();
    }
}