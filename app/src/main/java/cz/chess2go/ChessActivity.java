package cz.chess2go;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ChessActivity extends AppCompatActivity {
    ImageView squareA1;
    ImageView squareA2;
    ImageView squareA3;
    ImageView squareA4;
    ImageView squareA5;
    ImageView squareA6;
    ImageView squareA7;
    ImageView squareA8;

    ImageView squareB1;
    ImageView squareB2;
    ImageView squareB3;
    ImageView squareB4;
    ImageView squareB5;
    ImageView squareB6;
    ImageView squareB7;
    ImageView squareB8;

    ImageView squareC1;
    ImageView squareC2;
    ImageView squareC3;
    ImageView squareC4;
    ImageView squareC5;
    ImageView squareC6;
    ImageView squareC7;
    ImageView squareC8;

    ImageView squareD1;
    ImageView squareD2;
    ImageView squareD3;
    ImageView squareD4;
    ImageView squareD5;
    ImageView squareD6;
    ImageView squareD7;
    ImageView squareD8;

    ImageView squareE1;
    ImageView squareE2;
    ImageView squareE3;
    ImageView squareE4;
    ImageView squareE5;
    ImageView squareE6;
    ImageView squareE7;
    ImageView squareE8;

    ImageView squareF1;
    ImageView squareF2;
    ImageView squareF3;
    ImageView squareF4;
    ImageView squareF5;
    ImageView squareF6;
    ImageView squareF7;
    ImageView squareF8;

    ImageView squareG1;
    ImageView squareG2;
    ImageView squareG3;
    ImageView squareG4;
    ImageView squareG5;
    ImageView squareG6;
    ImageView squareG7;
    ImageView squareG8;

    ImageView squareH1;
    ImageView squareH2;
    ImageView squareH3;
    ImageView squareH4;
    ImageView squareH5;
    ImageView squareH6;
    ImageView squareH7;
    ImageView squareH8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_chess);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        squareA1 = findViewById(R.id.squareA1);
        squareA2 = findViewById(R.id.squareA2);
        squareA3 = findViewById(R.id.squareA3);
        squareA4 = findViewById(R.id.squareA4);
        squareA5 = findViewById(R.id.squareA5);
        squareA6 = findViewById(R.id.squareA6);
        squareA7 = findViewById(R.id.squareA7);
        squareA8 = findViewById(R.id.squareA8);

        squareB1 = findViewById(R.id.squareB1);
        squareB2 = findViewById(R.id.squareB2);
        squareB3 = findViewById(R.id.squareB3);
        squareB4 = findViewById(R.id.squareB4);
        squareB5 = findViewById(R.id.squareB5);
        squareB6 = findViewById(R.id.squareB6);
        squareB7 = findViewById(R.id.squareB7);
        squareB8 = findViewById(R.id.squareB8);

        squareC1 = findViewById(R.id.squareC1);
        squareC2 = findViewById(R.id.squareC2);
        squareC3 = findViewById(R.id.squareC3);
        squareC4 = findViewById(R.id.squareC4);
        squareC5 = findViewById(R.id.squareC5);
        squareC6 = findViewById(R.id.squareC6);
        squareC7 = findViewById(R.id.squareC7);
        squareC8 = findViewById(R.id.squareC8);

        squareD1 = findViewById(R.id.squareD1);
        squareD2 = findViewById(R.id.squareD2);
        squareD3 = findViewById(R.id.squareD3);
        squareD4 = findViewById(R.id.squareD4);
        squareD5 = findViewById(R.id.squareD5);
        squareD6 = findViewById(R.id.squareD6);
        squareD7 = findViewById(R.id.squareD7);
        squareD8 = findViewById(R.id.squareD8);

        squareE1 = findViewById(R.id.squareE1);
        squareE2 = findViewById(R.id.squareE2);
        squareE3 = findViewById(R.id.squareE3);
        squareE4 = findViewById(R.id.squareE4);
        squareE5 = findViewById(R.id.squareE5);
        squareE6 = findViewById(R.id.squareE6);
        squareE7 = findViewById(R.id.squareE7);
        squareE8 = findViewById(R.id.squareE8);

        squareF1 = findViewById(R.id.squareF1);
        squareF2 = findViewById(R.id.squareF2);
        squareF3 = findViewById(R.id.squareF3);
        squareF4 = findViewById(R.id.squareF4);
        squareF5 = findViewById(R.id.squareF5);
        squareF6 = findViewById(R.id.squareF6);
        squareF7 = findViewById(R.id.squareF7);
        squareF8 = findViewById(R.id.squareF8);

        squareG1 = findViewById(R.id.squareG1);
        squareG2 = findViewById(R.id.squareG2);
        squareG3 = findViewById(R.id.squareG3);
        squareG4 = findViewById(R.id.squareG4);
        squareG5 = findViewById(R.id.squareG5);
        squareG6 = findViewById(R.id.squareG6);
        squareG7 = findViewById(R.id.squareG7);
        squareG8 = findViewById(R.id.squareG8);

        squareH1 = findViewById(R.id.squareH1);
        squareH2 = findViewById(R.id.squareH2);
        squareH3 = findViewById(R.id.squareH3);
        squareH4 = findViewById(R.id.squareH4);
        squareH5 = findViewById(R.id.squareH5);
        squareH6 = findViewById(R.id.squareH6);
        squareH7 = findViewById(R.id.squareH7);
        squareH8 = findViewById(R.id.squareH8);
    }

    public void backToMenu(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}