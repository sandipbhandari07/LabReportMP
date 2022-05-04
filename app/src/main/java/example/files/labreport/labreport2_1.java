package example.files.labreport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class labreport2_1 extends AppCompatActivity {

    EditText user,password;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labreport21);

        btn=findViewById(R.id.submit2_1);
        user=findViewById(R.id.username2_1);
        password=findViewById(R.id.password2_1);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (user.getText().toString().equals("sandip")&password.getText().toString().equals("sandip")){
                    Toast.makeText(labreport2_1.this, "Login success", Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(labreport2_1.this, "login unsucessful", Toast.LENGTH_SHORT).show();
                }

            }
        });
    }
}