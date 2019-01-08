package comk.kelompok.foodballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class berikutnya extends AppCompatActivity {

    private static final Class<?> Lanjutkan = ;
    private static final Object StarActivity = ;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berikutnya);

        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                openLanjutkan();

            }

            private void openLanjutkan() {
            }
        });
        public void openlanjutkan() {
            Intent intent = new Intent(this, Lanjutkan.Class);
            StarActivity(intent);
        }
    }

    private void StarActivity(Intent intent) {
    }

    private Button findViewById() {
    }
}
