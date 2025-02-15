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

public class PiecesMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pieces_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnPiecePawn = findViewById(R.id.btnPiecePawn);
        Button btnPieceBishop = findViewById(R.id.btnPieceBishop);
        Button btnPieceKnight = findViewById(R.id.btnPieceKnight);
        Button btnPieceRook = findViewById(R.id.btnPieceRook);
        Button btnPieceQueen = findViewById(R.id.btnPieceQueen);
        Button btnPieceKing = findViewById(R.id.btnPieceKing);

        btnPiecePawn.setOnClickListener(v -> openPiece("Pawn", "1 point\n" +
                "Moves one square forward, but on its first move, it can move two squares.\n" +
                "Captures diagonally one square forward.\n" +
                "Special move: En passant (when a pawn moves two squares forward from its starting position and lands next to an opponent's pawn, the opponent can capture it as if it moved only one square).\n" +
                "Promotion: When a pawn reaches the opponent's back rank, it can be promoted to any other piece except a king.", Arrays.asList(
                        R.drawable.pawn_1,
                        R.drawable.pawn_2
        )));
    }

    private void openPiece(String title, String description, List<Integer> imageResIds) {
        Intent intent = new Intent(this, TacticDetailActivity.class);
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