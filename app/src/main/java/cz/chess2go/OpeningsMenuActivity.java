package cz.chess2go;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OpeningsMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_openings_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnOpeningKingsPawn = findViewById(R.id.btnOpeningKingsPawn);
        Button btnOpeningQueensGambit = findViewById(R.id.btnOpeningQueensGambit);
        Button btnOpeningSicilian = findViewById(R.id.btnOpeningSicilian);
        Button btnOpeningFrench = findViewById(R.id.btnOpeningFrench);

        btnOpeningKingsPawn.setOnClickListener(v -> openOpening("King's Pawn Opening", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.kings_pawn_1)));
        btnOpeningQueensGambit.setOnClickListener(v -> openOpening("Queen's Gambit", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.queens_gambit_1,
                R.drawable.queens_gambit_2,
                R.drawable.queens_gambit_3)));
        btnOpeningSicilian.setOnClickListener(v -> openOpening("Sicilian Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.sicilian_1,
                R.drawable.sicilian_2)));
        btnOpeningFrench.setOnClickListener(v -> openOpening("French Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.french_1,
                R.drawable.french_2)));
    }

    private void openOpening(String title, List<Integer> imageResIds) {
        Intent intent = new Intent(this, OpeningDetailActivity.class);
        intent.putExtra("title", title);
        intent.putIntegerArrayListExtra("imageResIds", new ArrayList<>(imageResIds));
        startActivity(intent);
    }

    public void backToMenu(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        ActivityOptions options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_left,
                R.anim.slide_out_right
        );
        startActivity(intent, options.toBundle());
    }
}