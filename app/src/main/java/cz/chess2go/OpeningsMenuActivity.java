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
        Button btnOpeningRuyLopez = findViewById(R.id.btnOpeningRuyLopez);
        Button btnOpeningSlav = findViewById(R.id.btnOpeningSlav);
        Button btnOpeningCaroKann = findViewById(R.id.btnOpeningCaroKann);
        Button btnOpeningItalian = findViewById(R.id.btnOpeningItalian);
        Button btnOpeningKingsIndian = findViewById(R.id.btnOpeningKingsIndian);
        Button btnOpeningEnglish = findViewById(R.id.btnOpeningEnglish);
        Button btnOpeningNimzoIndian = findViewById(R.id.btnOpeningNimzoIndian);
        Button btnOpeningPirc = findViewById(R.id.btnOpeningPirc);
        Button btnOpeningPetrov = findViewById(R.id.btnOpeningPetrov);
        Button btnOpeningGrunfeld = findViewById(R.id.btnOpeningGrunfeld);
        Button btnOpeningBenoni = findViewById(R.id.btnOpeningBenoni);
        Button btnOpeningDutch = findViewById(R.id.btnOpeningDutch);
        Button btnOpeningScotch = findViewById(R.id.btnOpeningScotch);
        Button btnOpeningReti = findViewById(R.id.btnOpeningReti);
        Button btnOpeningAlekhine = findViewById(R.id.btnOpeningAlekhine);
        Button btnOpeningTarrasch = findViewById(R.id.btnOpeningTarrasch);



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
        btnOpeningRuyLopez.setOnClickListener(v -> openOpening("Ruy López", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.ruy_lopez_1,
                R.drawable.ruy_lopez_2,
                R.drawable.ruy_lopez_3,
                R.drawable.ruy_lopez_4,
                R.drawable.ruy_lopez_5)));

        btnOpeningSlav.setOnClickListener(v -> openOpening("Slav Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.slav_1,
                R.drawable.slav_2,
                R.drawable.slav_3,
                R.drawable.slav_4)));

        btnOpeningCaroKann.setOnClickListener(v -> openOpening("Caro-Kann Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.caro_kann_1,
                R.drawable.caro_kann_2)));

        btnOpeningItalian.setOnClickListener(v -> openOpening("Italian Game", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.italian_1,
                R.drawable.italian_2,
                R.drawable.italian_3,
                R.drawable.italian_4,
                R.drawable.italian_5)));

        btnOpeningKingsIndian.setOnClickListener(v -> openOpening("King's Indian Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.kings_indian_1,
                R.drawable.kings_indian_2,
                R.drawable.kings_indian_3,
                R.drawable.kings_indian_4)));

        btnOpeningEnglish.setOnClickListener(v -> openOpening("English Opening", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.english_1)));

        btnOpeningNimzoIndian.setOnClickListener(v -> openOpening("Nimzo-Indian Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.nimzo_indian_1,
                R.drawable.nimzo_indian_2,
                R.drawable.nimzo_indian_3,
                R.drawable.nimzo_indian_4,
                R.drawable.nimzo_indian_5,
                R.drawable.nimzo_indian_6)));

        btnOpeningPirc.setOnClickListener(v -> openOpening("Pirc Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.pirc_1,
                R.drawable.pirc_2)));

        btnOpeningPetrov.setOnClickListener(v -> openOpening("Petrov Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.petrov_1,
                R.drawable.petrov_2,
                R.drawable.petrov_3,
                R.drawable.petrov_4)));

        btnOpeningGrunfeld.setOnClickListener(v -> openOpening("Grünfeld Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.grunfeld_1,
                R.drawable.grunfeld_2,
                R.drawable.grunfeld_3,
                R.drawable.grunfeld_4,
                R.drawable.grunfeld_5,
                R.drawable.grunfeld_6)));

        btnOpeningBenoni.setOnClickListener(v -> openOpening("Benoni Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.benoni_1,
                R.drawable.benoni_2,
                R.drawable.benoni_3,
                R.drawable.benoni_4)));

        btnOpeningDutch.setOnClickListener(v -> openOpening("Dutch Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.dutch_1,
                R.drawable.dutch_2)));

        btnOpeningScotch.setOnClickListener(v -> openOpening("Scotch Game", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.scotch_1,
                R.drawable.scotch_2,
                R.drawable.scotch_3,
                R.drawable.scotch_4,
                R.drawable.scotch_5)));

        btnOpeningReti.setOnClickListener(v -> openOpening("Reti Opening", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.reti_1)));

        btnOpeningAlekhine.setOnClickListener(v -> openOpening("Alekhine's Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.alekhine_1,
                R.drawable.alekhine_2)));

        btnOpeningTarrasch.setOnClickListener(v -> openOpening("Tarrasch Defense", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.tarrasch_1,
                R.drawable.tarrasch_2,
                R.drawable.tarrasch_3,
                R.drawable.tarrasch_4,
                R.drawable.tarrasch_5,
                R.drawable.tarrasch_6)));
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