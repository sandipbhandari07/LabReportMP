package example.files.labreport;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class labreport3_1 extends AppCompatActivity {

private CheckBox chkcsgo,chkvalo,chkgta;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labreport31);

        chkcsgo=findViewById(R.id.chkcs);
        chkvalo=findViewById(R.id.chkvalo);
        chkgta=findViewById(R.id.chkgta);
    }
    public void showSelected(View view){
        String selected = "You selected : \n";
        if (chkcsgo.isChecked())
            selected += "cs:go";
        if (chkvalo.isChecked())
            selected += "valorant";
        if (chkgta.isChecked())
            selected += "GTA V";

        Toast.makeText(this, "selected", Toast.LENGTH_SHORT).show();
    }
}