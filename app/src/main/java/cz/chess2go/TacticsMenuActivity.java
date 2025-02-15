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

public class TacticsMenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tactics_menu);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Button btnTacticFork = findViewById(R.id.btnTacticFork);
        Button btnTacticAttackingF7F2 = findViewById(R.id.btnTacticAttackingF7F2);
        Button btnTacticSacrifice = findViewById(R.id.btnTacticSacrifice);
        Button btnTacticSimplification = findViewById(R.id.btnTacticSimplification);
        Button btnTacticPin = findViewById(R.id.btnTacticPin);
        Button btnTacticSkewer = findViewById(R.id.btnTacticSkewer);
        Button btnTacticDiscoveredAttackCheck = findViewById(R.id.btnTacticDiscoveredAttackCheck);
        Button btnTacticBackRank = findViewById(R.id.btnTacticBackRank);
        Button btnTacticMatingNet = findViewById(R.id.btnTacticMatingNet);
        Button btnTacticDoubleCheck = findViewById(R.id.btnTacticDoubleCheck);
        Button btnTacticPawnPromotion = findViewById(R.id.btnTacticPawnPromotion);
        Button btnTacticZugzwang = findViewById(R.id.btnTacticZugzwang);
        Button btnTacticExchangeSacrifice = findViewById(R.id.btnTacticExchangeSacrifice);
        Button btnTacticVulnerableKing = findViewById(R.id.btnTacticVulnerableKing);
        Button btnTacticDecoy = findViewById(R.id.btnTacticDecoy);
        Button btnTacticOverloading = findViewById(R.id.btnTacticOverloading);
        Button btnTacticTrappedPiece = findViewById(R.id.btnTacticTrappedPiece);
        Button btnTacticPerpetualCheck = findViewById(R.id.btnTacticPerpetualCheck);
        Button btnTacticStalemate = findViewById(R.id.btnTacticStalemate);
        Button btnTacticXRayAttack = findViewById(R.id.btnTacticXRayAttack);

        btnTacticFork.setOnClickListener(v -> openTactic("Fork", "A fork is when one piece attacks two or more of the opponent’s pieces at the same time, forcing them to make a tough decision about which piece to save.", Arrays.asList(
                R.drawable.fork_1,
                R.drawable.fork_2
        )));
        btnTacticAttackingF7F2.setOnClickListener(v -> openTactic("Attacking f7/f2", "Attacking the f7 (for Black) or f2 (for White) squares is a common tactic to target a weak spot in the opponent's pawn structure, often leading to a quick attack on the king.", Arrays.asList(
                R.drawable.attacking_f7_f2_1,
                R.drawable.attacking_f7_f2_2,
                R.drawable.attacking_f7_f2_3,
                R.drawable.attacking_f7_f2_4
        )));
    }

    private void openTactic(String title, String description, List<Integer> imageResIds) {
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