package br.com.etecia.maufuturo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class InfraestruturaActivity extends AppCompatActivity {
  MaterialToolbar idtoolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.infraestrutura_layout);
    idtoolbar= findViewById(R.id.bottom_navigation);

    idtoolbar.setNavigationOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

        }
    });


    idtoolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
        @Override
        public boolean onMenuItemClick(MenuItem item) {
            switch (item.getItemId()) {
                case R.id.page_1:
                    Toast.makeText(getApplicationContext(),
                            "Cliquei no favorite",
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.page_2:
                    Toast.makeText(getApplicationContext(),
                            "Cliquei no Search",
                            Toast.LENGTH_SHORT).show();
                    break;
                case R.id.page_3:
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em More",
                            Toast.LENGTH_SHORT).show();
                    break;

                case R.id.page_4:
                    Toast.makeText(getApplicationContext(),
                            "Cliquei em More",
                            Toast.LENGTH_LONG)
                            .show();
                    break;
            }
            return true;
        }
    });
    }
}