package cz.chess2go;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

public class PuzzlesActivity extends AppCompatActivity {

    public static ArrayList<ImageView> squares = new ArrayList<>();
    public static ArrayList<String> squareNames = new ArrayList<>();
    public static HashMap<String, ImageView> imageViewMap = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_puzzles);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        ImageView a1 = findViewById(R.id.a1);
        ImageView a2 = findViewById(R.id.a2);
        ImageView a3 = findViewById(R.id.a3);
        ImageView a4 = findViewById(R.id.a4);
        ImageView a5 = findViewById(R.id.a5);
        ImageView a6 = findViewById(R.id.a6);
        ImageView a7 = findViewById(R.id.a7);
        ImageView a8 = findViewById(R.id.a8);

        ImageView b1 = findViewById(R.id.b1);
        ImageView b2 = findViewById(R.id.b2);
        ImageView b3 = findViewById(R.id.b3);
        ImageView b4 = findViewById(R.id.b4);
        ImageView b5 = findViewById(R.id.b5);
        ImageView b6 = findViewById(R.id.b6);
        ImageView b7 = findViewById(R.id.b7);
        ImageView b8 = findViewById(R.id.b8);

        ImageView c1 = findViewById(R.id.c1);
        ImageView c2 = findViewById(R.id.c2);
        ImageView c3 = findViewById(R.id.c3);
        ImageView c4 = findViewById(R.id.c4);
        ImageView c5 = findViewById(R.id.c5);
        ImageView c6 = findViewById(R.id.c6);
        ImageView c7 = findViewById(R.id.c7);
        ImageView c8 = findViewById(R.id.c8);

        ImageView d1 = findViewById(R.id.d1);
        ImageView d2 = findViewById(R.id.d2);
        ImageView d3 = findViewById(R.id.d3);
        ImageView d4 = findViewById(R.id.d4);
        ImageView d5 = findViewById(R.id.d5);
        ImageView d6 = findViewById(R.id.d6);
        ImageView d7 = findViewById(R.id.d7);
        ImageView d8 = findViewById(R.id.d8);

        ImageView e1 = findViewById(R.id.e1);
        ImageView e2 = findViewById(R.id.e2);
        ImageView e3 = findViewById(R.id.e3);
        ImageView e4 = findViewById(R.id.e4);
        ImageView e5 = findViewById(R.id.e5);
        ImageView e6 = findViewById(R.id.e6);
        ImageView e7 = findViewById(R.id.e7);
        ImageView e8 = findViewById(R.id.e8);

        ImageView f1 = findViewById(R.id.f1);
        ImageView f2 = findViewById(R.id.f2);
        ImageView f3 = findViewById(R.id.f3);
        ImageView f4 = findViewById(R.id.f4);
        ImageView f5 = findViewById(R.id.f5);
        ImageView f6 = findViewById(R.id.f6);
        ImageView f7 = findViewById(R.id.f7);
        ImageView f8 = findViewById(R.id.f8);

        ImageView g1 = findViewById(R.id.g1);
        ImageView g2 = findViewById(R.id.g2);
        ImageView g3 = findViewById(R.id.g3);
        ImageView g4 = findViewById(R.id.g4);
        ImageView g5 = findViewById(R.id.g5);
        ImageView g6 = findViewById(R.id.g6);
        ImageView g7 = findViewById(R.id.g7);
        ImageView g8 = findViewById(R.id.g8);

        ImageView h1 = findViewById(R.id.h1);
        ImageView h2 = findViewById(R.id.h2);
        ImageView h3 = findViewById(R.id.h3);
        ImageView h4 = findViewById(R.id.h4);
        ImageView h5 = findViewById(R.id.h5);
        ImageView h6 = findViewById(R.id.h6);
        ImageView h7 = findViewById(R.id.h7);
        ImageView h8 = findViewById(R.id.h8);

        imageViewMap.put("a1", a1);
        imageViewMap.put("a2", a2);
        imageViewMap.put("a3", a3);
        imageViewMap.put("a4", a4);
        imageViewMap.put("a5", a5);
        imageViewMap.put("a6", a6);
        imageViewMap.put("a7", a7);
        imageViewMap.put("a8", a8);

        imageViewMap.put("b1", b1);
        imageViewMap.put("b2", b2);
        imageViewMap.put("b3", b3);
        imageViewMap.put("b4", b4);
        imageViewMap.put("b5", b5);
        imageViewMap.put("b6", b6);
        imageViewMap.put("b7", b7);
        imageViewMap.put("b8", b8);

        imageViewMap.put("c1", c1);
        imageViewMap.put("c2", c2);
        imageViewMap.put("c3", c3);
        imageViewMap.put("c4", c4);
        imageViewMap.put("c5", c5);
        imageViewMap.put("c6", c6);
        imageViewMap.put("c7", c7);
        imageViewMap.put("c8", c8);

        imageViewMap.put("d1", d1);
        imageViewMap.put("d2", d2);
        imageViewMap.put("d3", d3);
        imageViewMap.put("d4", d4);
        imageViewMap.put("d5", d5);
        imageViewMap.put("d6", d6);
        imageViewMap.put("d7", d7);
        imageViewMap.put("d8", d8);

        imageViewMap.put("e1", e1);
        imageViewMap.put("e2", e2);
        imageViewMap.put("e3", e3);
        imageViewMap.put("e4", e4);
        imageViewMap.put("e5", e5);
        imageViewMap.put("e6", e6);
        imageViewMap.put("e7", e7);
        imageViewMap.put("e8", e8);

        imageViewMap.put("f1", f1);
        imageViewMap.put("f2", f2);
        imageViewMap.put("f3", f3);
        imageViewMap.put("f4", f4);
        imageViewMap.put("f5", f5);
        imageViewMap.put("f6", f6);
        imageViewMap.put("f7", f7);
        imageViewMap.put("f8", f8);

        imageViewMap.put("g1", g1);
        imageViewMap.put("g2", g2);
        imageViewMap.put("g3", g3);
        imageViewMap.put("g4", g4);
        imageViewMap.put("g5", g5);
        imageViewMap.put("g6", g6);
        imageViewMap.put("g7", g7);
        imageViewMap.put("g8", g8);

        imageViewMap.put("h1", h1);
        imageViewMap.put("h2", h2);
        imageViewMap.put("h3", h3);
        imageViewMap.put("h4", h4);
        imageViewMap.put("h5", h5);
        imageViewMap.put("h6", h6);
        imageViewMap.put("h7", h7);
        imageViewMap.put("h8", h8);


        squares.add(a1);
        squares.add(a2);
        squares.add(a3);
        squares.add(a4);
        squares.add(a5);
        squares.add(a6);
        squares.add(a7);
        squares.add(a8);

        squares.add(b1);
        squares.add(b2);
        squares.add(b3);
        squares.add(b4);
        squares.add(b5);
        squares.add(b6);
        squares.add(b7);
        squares.add(b8);

        squares.add(c1);
        squares.add(c2);
        squares.add(c3);
        squares.add(c4);
        squares.add(c5);
        squares.add(c6);
        squares.add(c7);
        squares.add(c8);

        squares.add(d1);
        squares.add(d2);
        squares.add(d3);
        squares.add(d4);
        squares.add(d5);
        squares.add(d6);
        squares.add(d7);
        squares.add(d8);

        squares.add(e1);
        squares.add(e2);
        squares.add(e3);
        squares.add(e4);
        squares.add(e5);
        squares.add(e6);
        squares.add(e7);
        squares.add(e8);

        squares.add(f1);
        squares.add(f2);
        squares.add(f3);
        squares.add(f4);
        squares.add(f5);
        squares.add(f6);
        squares.add(f7);
        squares.add(f8);

        squares.add(g1);
        squares.add(g2);
        squares.add(g3);
        squares.add(g4);
        squares.add(g5);
        squares.add(g6);
        squares.add(g7);
        squares.add(g8);

        squares.add(h1);
        squares.add(h2);
        squares.add(h3);
        squares.add(h4);
        squares.add(h5);
        squares.add(h6);
        squares.add(h7);
        squares.add(h8);

        squareNames.add("a1");
        squareNames.add("a2");
        squareNames.add("a3");
        squareNames.add("a4");
        squareNames.add("a5");
        squareNames.add("a6");
        squareNames.add("a7");
        squareNames.add("a8");

        squareNames.add("b1");
        squareNames.add("b2");
        squareNames.add("b3");
        squareNames.add("b4");
        squareNames.add("b5");
        squareNames.add("b6");
        squareNames.add("b7");
        squareNames.add("b8");

        squareNames.add("c1");
        squareNames.add("c2");
        squareNames.add("c3");
        squareNames.add("c4");
        squareNames.add("c5");
        squareNames.add("c6");
        squareNames.add("c7");
        squareNames.add("c8");

        squareNames.add("d1");
        squareNames.add("d2");
        squareNames.add("d3");
        squareNames.add("d4");
        squareNames.add("d5");
        squareNames.add("d6");
        squareNames.add("d7");
        squareNames.add("d8");

        squareNames.add("e1");
        squareNames.add("e2");
        squareNames.add("e3");
        squareNames.add("e4");
        squareNames.add("e5");
        squareNames.add("e6");
        squareNames.add("e7");
        squareNames.add("e8");

        squareNames.add("f1");
        squareNames.add("f2");
        squareNames.add("f3");
        squareNames.add("f4");
        squareNames.add("f5");
        squareNames.add("f6");
        squareNames.add("f7");
        squareNames.add("f8");

        squareNames.add("g1");
        squareNames.add("g2");
        squareNames.add("g3");
        squareNames.add("g4");
        squareNames.add("g5");
        squareNames.add("g6");
        squareNames.add("g7");
        squareNames.add("g8");

        squareNames.add("h1");
        squareNames.add("h2");
        squareNames.add("h3");
        squareNames.add("h4");
        squareNames.add("h5");
        squareNames.add("h6");
        squareNames.add("h7");
        squareNames.add("h8");

        Button startButton = findViewById(R.id.startButton);
    }

    public int startGame(View view) {
        Random rand = new Random();
        AtomicInteger rightAnswers = new AtomicInteger(0);
        int randomNumber;
        TextView guessingSquare = findViewById(R.id.guessingSquare);

        List<String> remainingSquares = new ArrayList<>(squareNames);
        List<ImageView> remainingImageViews = new ArrayList<>(squares);

        // Začneme debugováním
        Log.d("Game", "Game started");

        for (int i = 0; i < remainingSquares.size(); i++) {
            randomNumber = rand.nextInt(remainingSquares.size());
            String squareName = remainingSquares.get(randomNumber);
            ImageView square = remainingImageViews.get(randomNumber);

            guessingSquare.setText(squareName);

            // Logování pro kontrolu, že nastavení OnClickListener probíhá správně
            Log.d("Game", "Setting OnClickListener for " + squareName);

            if (square != null) {
                square.setOnClickListener(v -> {
                    // Debugging kliknutí
                    Log.d("Game", "Square clicked: " + squareName);

                    // Pokud je odpověď správná, inkrementujeme správné odpovědi
                    rightAnswers.incrementAndGet();
                    Log.d("Game", "Right answers: " + rightAnswers.get());
                });
            }

            remainingSquares.remove(randomNumber);
            remainingImageViews.remove(randomNumber);
        }

        // Na konci vrátíme počet správných odpovědí
        Log.d("Game", "Game finished. Right answers: " + rightAnswers.get());
        return rightAnswers.get();
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