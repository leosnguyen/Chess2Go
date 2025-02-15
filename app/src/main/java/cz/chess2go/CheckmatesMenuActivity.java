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

public class CheckmatesMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_checkmates_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnCheckmateTwoRooks = findViewById(R.id.btnCheckmateTwoRooks);
        Button btnCheckmateKingAndQueen = findViewById(R.id.btnCheckmateKingAndQueen);
        Button btnCheckmateKingAndRook = findViewById(R.id.btnCheckmateKingAndRook);
        Button btnCheckmateKingAndTwoBishops = findViewById(R.id.btnCheckmateKingAndTwoBishops);
        Button btnCheckmateKingBishopAndKnight = findViewById(R.id.btnCheckmateKingBishopAndKnight);
        Button btnCheckmateArabian = findViewById(R.id.btnCheckmateArabian);
        Button btnCheckmateFools = findViewById(R.id.btnCheckmateFools);
        Button btnCheckmateScholars = findViewById(R.id.btnCheckmateScholars);
        Button btnCheckmateLegals = findViewById(R.id.btnCheckmateLegals);
        Button btnCheckmateBackRank = findViewById(R.id.btnCheckmateBackRank);
        Button btnCheckmateSmothered = findViewById(R.id.btnCheckmateSmothered);
        Button btnCheckmateAnastasias = findViewById(R.id.btnCheckmateAnastasias);
        Button btnCheckmateEpaulette = findViewById(R.id.btnCheckmateEpaulette);
        Button btnCheckmateBodens = findViewById(R.id.btnCheckmateBodens);
        Button btnCheckmateDovetail = findViewById(R.id.btnCheckmateDovetail);
        Button btnCheckmateSwallowsTail = findViewById(R.id.btnCheckmateSwallowsTail);
        Button btnCheckmateOpera = findViewById(R.id.btnCheckmateOpera);
        Button btnCheckmateBlackburnes = findViewById(R.id.btnCheckmateBlackburnes);
        Button btnCheckmateDamianos = findViewById(R.id.btnCheckmateDamianos);
        Button btnCheckmateMorphys = findViewById(R.id.btnCheckmateMorphys);

        btnCheckmateTwoRooks.setOnClickListener(v -> openCheckmate("Two Rooks Mate", "A powerful and straightforward checkmate where two rooks work together to force the opposing king to the edge of the board and deliver checkmate.", Arrays.asList(
                R.drawable.two_rooks_1,
                R.drawable.two_rooks_2,
                R.drawable.two_rooks_3,
                R.drawable.two_rooks_4,
                R.drawable.two_rooks_5,
                R.drawable.two_rooks_6,
                R.drawable.two_rooks_7,
                R.drawable.two_rooks_8,
                R.drawable.two_rooks_9,
                R.drawable.two_rooks_10,
                R.drawable.two_rooks_11,
                R.drawable.two_rooks_12,
                R.drawable.two_rooks_13
        )));
        btnCheckmateKingAndQueen.setOnClickListener(v -> openCheckmate("King and Queen Mate", "A classic checkmate pattern, where the queen and king cooperate to trap the enemy king on the edge of the board, cutting off escape routes.", Arrays.asList(
                R.drawable.king_and_queen_1,
                R.drawable.king_and_queen_2,
                R.drawable.king_and_queen_3,
                R.drawable.king_and_queen_4,
                R.drawable.king_and_queen_5,
                R.drawable.king_and_queen_5,
                R.drawable.king_and_queen_6,
                R.drawable.king_and_queen_7,
                R.drawable.king_and_queen_8,
                R.drawable.king_and_queen_9,
                R.drawable.king_and_queen_10,
                R.drawable.king_and_queen_11,
                R.drawable.king_and_queen_12,
                R.drawable.king_and_queen_13,
                R.drawable.king_and_queen_14,
                R.drawable.king_and_queen_15,
                R.drawable.king_and_queen_16,
                R.drawable.king_and_queen_17,
                R.drawable.king_and_queen_18,
                R.drawable.king_and_queen_19,
                R.drawable.king_and_queen_20,
                R.drawable.king_and_queen_21,
                R.drawable.king_and_queen_22,
                R.drawable.king_and_queen_23,
                R.drawable.king_and_queen_24,
                R.drawable.king_and_queen_25,
                R.drawable.king_and_queen_26,
                R.drawable.king_and_queen_27,
                R.drawable.king_and_queen_28,
                R.drawable.king_and_queen_29
        )));
        btnCheckmateArabian.setOnClickListener(v -> openCheckmate("Arabian Mate", "A checkmate pattern where a knight and rook cooperate to trap the opposing king on the back rank, delivering checkmate.", Arrays.asList(
                R.drawable.arabian_1,
                R.drawable.arabian_2
        )));
    }

    private void openCheckmate(String title, String description, List<Integer> imageResIds) {
        Intent intent = new Intent(this, CheckmateDetailActivity.class);
        intent.putExtra("title", title);
        intent.putExtra("description", description);

        if (imageResIds != null && !imageResIds.isEmpty()) {
            intent.putIntegerArrayListExtra("imageResIds", new ArrayList<>(imageResIds));
        } else {
            intent.putIntegerArrayListExtra("imageResIds", new ArrayList<>(List.of(R.drawable.default_image)));
        }

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