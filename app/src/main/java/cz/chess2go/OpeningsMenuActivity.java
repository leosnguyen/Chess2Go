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



        btnOpeningKingsPawn.setOnClickListener(v -> openOpening("King's Pawn Opening", "One of the most classic and aggressive openings, 1.e4 opens up lines for quick development and control of the center. It's a favorite for players seeking open and dynamic positions.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.kings_pawn_1)));
        btnOpeningQueensGambit.setOnClickListener(v -> openOpening("Queen's Gambit", "White offers a pawn on d4 to control the center, leading to a rich, strategic battle. After 1.d4 d5 2.c4, Black must decide whether to accept or decline the gambit, often leading to solid, strategic play.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.queens_gambit_1,
                R.drawable.queens_gambit_2,
                R.drawable.queens_gambit_3)));
        btnOpeningSicilian.setOnClickListener(v -> openOpening("Sicilian Defense", "The most popular response to 1.e4, the Sicilian Defense creates asymmetrical positions. It’s sharp and tactical, giving Black dynamic counterplay and challenging White's central control.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.sicilian_1,
                R.drawable.sicilian_2)));
        btnOpeningFrench.setOnClickListener(v -> openOpening("French Defense", "A solid, defensive opening for Black, 1.e4 e6 aims to challenge White's center from the side. The French often leads to closed, strategic positions with counterattacking chances.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.french_1,
                R.drawable.french_2)));
        btnOpeningRuyLopez.setOnClickListener(v -> openOpening("Ruy López", "A classic opening that arises after 1.e4 e5 2.Nf3 Nc6 3.Bb5. It’s known for its deep positional complexity, where White pressures Black’s pawn structure while preparing for long-term central control.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.ruy_lopez_1,
                R.drawable.ruy_lopez_2,
                R.drawable.ruy_lopez_3,
                R.drawable.ruy_lopez_4,
                R.drawable.ruy_lopez_5)));
        btnOpeningSlav.setOnClickListener(v -> openOpening("Slav Defense", "After 1.d4 d5 2.c4 c6, Black adopts a solid pawn structure, aiming to defend and counter-attack. The Slav is highly respected for its reliability and resilience against White’s opening play.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.slav_1,
                R.drawable.slav_2,
                R.drawable.slav_3,
                R.drawable.slav_4)));
        btnOpeningCaroKann.setOnClickListener(v -> openOpening("Caro-Kann Defense", "A solid and flexible defense for Black after 1.e4 c6. It seeks to build a strong pawn structure and develop safely, often leading to a strategic and slower game.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.caro_kann_1,
                R.drawable.caro_kann_2)));
        btnOpeningItalian.setOnClickListener(v -> openOpening("Italian Game", "A straightforward opening where White plays 1.e4 e5 2.Nf3 Nc6 3.Bc4, aiming for rapid development and pressure on Black’s f7 pawn. It often leads to open positions and tactical play.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.italian_1,
                R.drawable.italian_2,
                R.drawable.italian_3,
                R.drawable.italian_4,
                R.drawable.italian_5)));
        btnOpeningKingsIndian.setOnClickListener(v -> openOpening("King's Indian Defense", "A hypermodern opening where Black fianchettos the king's bishop with 1.d4 Nf6 2.c4 g6, aiming to counterattack White’s center later in the game, often leading to complex, unbalanced positions.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.kings_indian_1,
                R.drawable.kings_indian_2,
                R.drawable.kings_indian_3,
                R.drawable.kings_indian_4)));
        btnOpeningEnglish.setOnClickListener(v -> openOpening("English Opening", "Starting with 1.c4, this opening focuses on controlling the center from the flanks, leading to slower, maneuvering games. It can transpose into many other structures and is known for its flexibility.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.english_1)));
        btnOpeningNimzoIndian.setOnClickListener(v -> openOpening("Nimzo-Indian Defense", "A sophisticated defense where Black plays 1.d4 Nf6 2.c4 e6 3.Nc3 Bb4. Black challenges White’s central control while maintaining flexible pawn structures and counterplay.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.nimzo_indian_1,
                R.drawable.nimzo_indian_2,
                R.drawable.nimzo_indian_3,
                R.drawable.nimzo_indian_4,
                R.drawable.nimzo_indian_5,
                R.drawable.nimzo_indian_6)));
        btnOpeningPirc.setOnClickListener(v -> openOpening("Pirc Defense", "A hypermodern defense where Black allows White to occupy the center with pawns, planning to undermine it later with moves like 1.e4 d6 2.d4 Nf6 3.Nc3 g6. It often leads to complex, tactical positions.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.pirc_1,
                R.drawable.pirc_2)));
        btnOpeningPetrov.setOnClickListener(v -> openOpening("Petrov Defense", "Also known as the Russian Defense, 1.e4 e5 2.Nf3 Nf6 is a solid choice for Black, aiming to neutralize White’s early initiative and create symmetrical positions that lead to strategic battles.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.petrov_1,
                R.drawable.petrov_2,
                R.drawable.petrov_3,
                R.drawable.petrov_4)));
        btnOpeningGrunfeld.setOnClickListener(v -> openOpening("Grünfeld Defense", "After 1.d4 Nf6 2.c4 g6, Black challenges White’s center with the idea of undermining it. The Grünfeld is sharp and counterattacking, leading to dynamic, imbalanced positions.",Arrays.asList(
                R.drawable.starting_position,
                R.drawable.grunfeld_1,
                R.drawable.grunfeld_2,
                R.drawable.grunfeld_3,
                R.drawable.grunfeld_4,
                R.drawable.grunfeld_5,
                R.drawable.grunfeld_6)));
        btnOpeningBenoni.setOnClickListener(v -> openOpening("Benoni Defense", "A sharp and unbalanced opening that arises after 1.d4 Nf6 2.c4 c5. Black sacrifices space early on but aims to counterattack White’s center and create dynamic imbalances.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.benoni_1,
                R.drawable.benoni_2,
                R.drawable.benoni_3,
                R.drawable.benoni_4)));
        btnOpeningDutch.setOnClickListener(v -> openOpening("Dutch Defense", "A hypermodern defense after 1.d4 f5, where Black seeks to control the e4 square and initiate a counteroffensive on the queenside. The Dutch is aggressive and often leads to asymmetrical positions.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.dutch_1,
                R.drawable.dutch_2)));
        btnOpeningScotch.setOnClickListener(v -> openOpening("Scotch Game", "An aggressive opening for White, starting with 1.e4 e5 2.Nf3 Nc6 3.d4, which leads to open and tactical positions. The Scotch offers both players many opportunities for early action.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.scotch_1,
                R.drawable.scotch_2,
                R.drawable.scotch_3,
                R.drawable.scotch_4,
                R.drawable.scotch_5)));
        btnOpeningReti.setOnClickListener(v -> openOpening("Reti Opening", "A flexible opening starting with 1.Nf3, often aiming to control the center from the sides. The Réti can transpose into a variety of systems and leads to strategic, positional play.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.reti_1)));
        btnOpeningAlekhine.setOnClickListener(v -> openOpening("Alekhine's Defense", "A provocative opening where Black plays 1.e4 Nf6, inviting White to overextend in the center. Black aims to undermine White's position later, creating tactical opportunities in the process.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.alekhine_1,
                R.drawable.alekhine_2)));
        btnOpeningTarrasch.setOnClickListener(v -> openOpening("Tarrasch Defense", "A solid and flexible system that arises after 1.d4 d5 2.c4 e6 3.Nc3, aiming to develop rapidly while maintaining a strong central presence. The Tarrasch often leads to slow, maneuvering battles.", Arrays.asList(
                R.drawable.starting_position,
                R.drawable.tarrasch_1,
                R.drawable.tarrasch_2,
                R.drawable.tarrasch_3,
                R.drawable.tarrasch_4,
                R.drawable.tarrasch_5,
                R.drawable.tarrasch_6)));
    }

    private void openOpening(String title, String description, List<Integer> imageResIds) {
        Intent intent = new Intent(this, OpeningDetailActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);
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