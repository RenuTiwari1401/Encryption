package e.devi.encryption;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText et_pwd;
    Button btn_log_in;
    TextView textView;
    String pwd="Renu";
    int a=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_pwd = findViewById(R.id.editText);
        btn_log_in = findViewById(R.id.btn_log_in);
        textView = findViewById(R.id.editText2);

        btn_log_in.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = et_pwd.getText().toString();
                if (s.equals(pwd))
                {
                    textView.setText("You Have Logged in\n This is my web Page");
                }
                else
                {
                    a++;
                    if(a<=3)
                    {
                        textView.setText("try Again");
                    }
                    else
                    {
                        btn_log_in.setEnabled(false);
                        textView.setText("warning");
                    }
                }
            }
        });

    }
}
