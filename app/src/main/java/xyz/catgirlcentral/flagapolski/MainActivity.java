package xyz.catgirlcentral.flagapolski;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    int deleto = 0;

    public void delete(View view) {
        view.setVisibility(view.INVISIBLE); // solid snake omagod
        deleto++;
        if (deleto == 4) {
            Toast.makeText(this, R.string.win, Toast.LENGTH_SHORT).show();
        }
    }

    public void nope(View view) {
        if (deleto != 4) {
            Toast.makeText(this, R.string.comune, Toast.LENGTH_SHORT).show();
        }
        else {
            Toast.makeText(this,R.string.win,Toast.LENGTH_SHORT).show();
        }
    }
}