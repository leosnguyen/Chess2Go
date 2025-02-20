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
import java.util.Random;

public class PuzzlesActivity extends AppCompatActivity {
    public static ArrayList<String> squareNames = new ArrayList<>();
    public static HashMap<String, ImageView> imageViewMap = new HashMap<>();
    public static boolean isGameStarted = false;
    public static int randomNumber;
    public TextView puzzleScoreText;
    public TextView guessingSquare;

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
    }

    public void startGame(View view) {
        isGameStarted = true;
        Random rand = new Random();
        randomNumber = rand.nextInt(64);
        guessingSquare = findViewById(R.id.guessingSquare);
        guessingSquare.setText(squareNames.get(randomNumber));
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        puzzleScoreText.setText(R.string.text_unrated);
        Log.d("GAME_STARTED", "Game started.");
    }

    public void showHints(View view) {
        Button showHintsButton = findViewById(R.id.showHintsButton);
        TextView hint1 = findViewById(R.id.txtHint1);
        TextView hint2 = findViewById(R.id.txtHint2);
        TextView hint3 = findViewById(R.id.txtHint3);
        TextView hint4 = findViewById(R.id.txtHint4);
        TextView hint5 = findViewById(R.id.txtHint5);
        TextView hint6 = findViewById(R.id.txtHint6);
        TextView hint7 = findViewById(R.id.txtHint7);
        TextView hint8 = findViewById(R.id.txtHint8);
        TextView hintA = findViewById(R.id.txtHintA);
        TextView hintB = findViewById(R.id.txtHintB);
        TextView hintC = findViewById(R.id.txtHintC);
        TextView hintD = findViewById(R.id.txtHintD);
        TextView hintE = findViewById(R.id.txtHintE);
        TextView hintF = findViewById(R.id.txtHintF);
        TextView hintG = findViewById(R.id.txtHintG);
        TextView hintH = findViewById(R.id.txtHintH);

        if (hint1.getVisibility() == View.VISIBLE) {
            hint1.setVisibility(View.INVISIBLE);
            hint2.setVisibility(View.INVISIBLE);
            hint3.setVisibility(View.INVISIBLE);
            hint4.setVisibility(View.INVISIBLE);
            hint5.setVisibility(View.INVISIBLE);
            hint6.setVisibility(View.INVISIBLE);
            hint7.setVisibility(View.INVISIBLE);
            hint8.setVisibility(View.INVISIBLE);
            hintA.setVisibility(View.INVISIBLE);
            hintB.setVisibility(View.INVISIBLE);
            hintC.setVisibility(View.INVISIBLE);
            hintD.setVisibility(View.INVISIBLE);
            hintE.setVisibility(View.INVISIBLE);
            hintF.setVisibility(View.INVISIBLE);
            hintG.setVisibility(View.INVISIBLE);
            hintH.setVisibility(View.INVISIBLE);
            showHintsButton.setText(R.string.btn_show_hints);
        } else {
            hint1.setVisibility(View.VISIBLE);
            hint2.setVisibility(View.VISIBLE);
            hint3.setVisibility(View.VISIBLE);
            hint4.setVisibility(View.VISIBLE);
            hint5.setVisibility(View.VISIBLE);
            hint6.setVisibility(View.VISIBLE);
            hint7.setVisibility(View.VISIBLE);
            hint8.setVisibility(View.VISIBLE);
            hintA.setVisibility(View.VISIBLE);
            hintB.setVisibility(View.VISIBLE);
            hintC.setVisibility(View.VISIBLE);
            hintD.setVisibility(View.VISIBLE);
            hintE.setVisibility(View.VISIBLE);
            hintF.setVisibility(View.VISIBLE);
            hintG.setVisibility(View.VISIBLE);
            hintH.setVisibility(View.VISIBLE);
            showHintsButton.setText(R.string.btn_hide_hints);
        }
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

    public void a8(View view) {
        ImageView a8 = findViewById(R.id.a8);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("a8", "a8 was pressed");
        if (isGameStarted && a8 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(a8 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void b8(View view) {
        ImageView b8 = findViewById(R.id.b8);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("b8", "b8 was pressed");
        if (isGameStarted && b8 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(b8 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void c8(View view) {
        ImageView c8 = findViewById(R.id.c8);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("c8", "c8 was pressed");
        if (isGameStarted && c8 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(c8 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void d8(View view) {
        ImageView d8 = findViewById(R.id.d8);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("d8", "d8 was pressed");
        if (isGameStarted && d8 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(d8 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void e8(View view) {
        ImageView e8 = findViewById(R.id.e8);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("e8", "e8 was pressed");
        if (isGameStarted && e8 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(e8 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void f8(View view) {
        ImageView f8 = findViewById(R.id.f8);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("f8", "f8 was pressed");
        if (isGameStarted && f8 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(f8 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void g8(View view) {
        ImageView g8 = findViewById(R.id.g8);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("g8", "g8 was pressed");
        if (isGameStarted && g8 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(g8 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void h8(View view) {
        ImageView h8 = findViewById(R.id.h8);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("h8", "h8 was pressed");
        if (isGameStarted && h8 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(h8 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void a7(View view) {
        ImageView a7 = findViewById(R.id.a7);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("a7", "a7 was pressed");
        if (isGameStarted && a7 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(a7 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void b7(View view) {
        ImageView b7 = findViewById(R.id.b7);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("b7", "b7 was pressed");
        if (isGameStarted && b7 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(b7 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void c7(View view) {
        ImageView c7 = findViewById(R.id.c7);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("c7", "c7 was pressed");
        if (isGameStarted && c7 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(c7 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void d7(View view) {
        ImageView d7 = findViewById(R.id.d7);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("d7", "d7 was pressed");
        if (isGameStarted && d7 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(d7 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void e7(View view) {
        ImageView e7 = findViewById(R.id.e7);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("e7", "e7 was pressed");
        if (isGameStarted && e7 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(e7 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void f7(View view) {
        ImageView f7 = findViewById(R.id.f7);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("f7", "f7 was pressed");
        if (isGameStarted && f7 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(f7 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void g7(View view) {
        ImageView g7 = findViewById(R.id.g7);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("g7", "g7 was pressed");
        if (isGameStarted && g7 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(g7 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void h7(View view) {
        ImageView h7 = findViewById(R.id.h7);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("h7", "h7 was pressed");
        if (isGameStarted && h7 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(h7 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void a6(View view) {
        ImageView a6 = findViewById(R.id.a6);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("a6", "a6 was pressed");
        if (isGameStarted && a6 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(a6 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void b6(View view) {
        ImageView b6 = findViewById(R.id.b6);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("b6", "b6 was pressed");
        if (isGameStarted && b6 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(b6 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void c6(View view) {
        ImageView c6 = findViewById(R.id.c6);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("c6", "c6 was pressed");
        if (isGameStarted && c6 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(c6 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void d6(View view) {
        ImageView d6 = findViewById(R.id.d6);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("d6", "d6 was pressed");
        if (isGameStarted && d6 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(d6 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void e6(View view) {
        ImageView e6 = findViewById(R.id.e6);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("e6", "e6 was pressed");
        if (isGameStarted && e6 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(e6 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void f6(View view) {
        ImageView f6 = findViewById(R.id.f6);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("f6", "f6 was pressed");
        if (isGameStarted && f6 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(f6 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void g6(View view) {
        ImageView g6 = findViewById(R.id.g6);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("g6", "g6 was pressed");
        if (isGameStarted && g6 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(g6 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void h6(View view) {
        ImageView h6 = findViewById(R.id.h6);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("h6", "h6 was pressed");
        if (isGameStarted && h6 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(h6 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void a5(View view) {
        ImageView a5 = findViewById(R.id.a5);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("a5", "a5 was pressed");
        if (isGameStarted && a5 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(a5 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void b5(View view) {
        ImageView b5 = findViewById(R.id.b5);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("b5", "b5 was pressed");
        if (isGameStarted && b5 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(b5 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void c5(View view) {
        ImageView c5 = findViewById(R.id.c5);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("c5", "c5 was pressed");
        if (isGameStarted && c5 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(c5 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void d5(View view) {
        ImageView d5 = findViewById(R.id.d5);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("d5", "d5 was pressed");
        if (isGameStarted && d5 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(d5 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void e5(View view) {
        ImageView e5 = findViewById(R.id.e5);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("e5", "e5 was pressed");
        if (isGameStarted && e5 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(e5 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void f5(View view) {
        ImageView f5 = findViewById(R.id.f5);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("f5", "f5 was pressed");
        if (isGameStarted && f5 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(f5 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void g5(View view) {
        ImageView g5 = findViewById(R.id.g5);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("g5", "g5 was pressed");
        if (isGameStarted && g5 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(g5 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void h5(View view) {
        ImageView h5 = findViewById(R.id.h5);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("h5", "h5 was pressed");
        if (isGameStarted && h5 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(h5 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void a4(View view) {
        ImageView a4 = findViewById(R.id.a4);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("a4", "a4 was pressed");
        if (isGameStarted && a4 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(a4 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void b4(View view) {
        ImageView b4 = findViewById(R.id.b4);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("b4", "b4 was pressed");
        if (isGameStarted && b4 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(b4 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void c4(View view) {
        ImageView c4 = findViewById(R.id.c4);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("c4", "c4 was pressed");
        if (isGameStarted && c4 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(c4 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void d4(View view) {
        ImageView d4 = findViewById(R.id.d4);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("d4", "d4 was pressed");
        if (isGameStarted && d4 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(d4 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void e4(View view) {
        ImageView e4 = findViewById(R.id.e4);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("e4", "e4 was pressed");
        if (isGameStarted && e4 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(e4 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void f4(View view) {
        ImageView f4 = findViewById(R.id.f4);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("f4", "f4 was pressed");
        if (isGameStarted && f4 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(f4 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void g4(View view) {
        ImageView g4 = findViewById(R.id.g4);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("g4", "g4 was pressed");
        if (isGameStarted && g4 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(g4 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void h4(View view) {
        ImageView h4 = findViewById(R.id.h4);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("h4", "h4 was pressed");
        if (isGameStarted && h4 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(h4 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void a3(View view) {
        ImageView a3 = findViewById(R.id.a3);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("a3", "a3 was pressed");
        if (isGameStarted && a3 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(a3 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void b3(View view) {
        ImageView b3 = findViewById(R.id.b3);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("b3", "b3 was pressed");
        if (isGameStarted && b3 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(b3 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void c3(View view) {
        ImageView c3 = findViewById(R.id.c3);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("c3", "c3 was pressed");
        if (isGameStarted && c3 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(c3 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void d3(View view) {
        ImageView d3 = findViewById(R.id.d3);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("d3", "d3 was pressed");
        if (isGameStarted && d3 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(d3 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void e3(View view) {
        ImageView e3 = findViewById(R.id.e3);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("e3", "e3 was pressed");
        if (isGameStarted && e3 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(e3 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void f3(View view) {
        ImageView f3 = findViewById(R.id.f3);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("f3", "f3 was pressed");
        if (isGameStarted && f3 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(f3 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void g3(View view) {
        ImageView g3 = findViewById(R.id.g3);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("g3", "g3 was pressed");
        if (isGameStarted && g3 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(g3 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void h3(View view) {
        ImageView h3 = findViewById(R.id.h3);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("h3", "h3 was pressed");
        if (isGameStarted && h3 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(h3 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void a2(View view) {
        ImageView a2 = findViewById(R.id.a2);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("a2", "a2 was pressed");
        if (isGameStarted && a2 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(a2 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void b2(View view) {
        ImageView b2 = findViewById(R.id.b2);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("b2", "b2 was pressed");
        if (isGameStarted && b2 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(b2 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void c2(View view) {
        ImageView c2 = findViewById(R.id.c2);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("c2", "c2 was pressed");
        if (isGameStarted && c2 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(c2 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void d2(View view) {
        ImageView d2 = findViewById(R.id.d2);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("d2", "d2 was pressed");
        if (isGameStarted && d2 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(d2 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void e2(View view) {
        ImageView e2 = findViewById(R.id.e2);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("e2", "e2 was pressed");
        if (isGameStarted && e2 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(e2 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void f2(View view) {
        ImageView f2 = findViewById(R.id.f2);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("f2", "f2 was pressed");
        if (isGameStarted && f2 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(f2 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void g2(View view) {
        ImageView g2 = findViewById(R.id.g2);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("g2", "g2 was pressed");
        if (isGameStarted && g2 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(g2 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void h2(View view) {
        ImageView h2 = findViewById(R.id.h2);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("h2", "h2 was pressed");
        if (isGameStarted && h2 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(h2 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void a1(View view) {
        ImageView a1 = findViewById(R.id.a1);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("a1", "a1 was pressed");
        if (isGameStarted && a1 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(a1 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void b1(View view) {
        ImageView b1 = findViewById(R.id.b1);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("b1", "b1 was pressed");
        if (isGameStarted && b1 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(b1 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void c1(View view) {
        ImageView c1 = findViewById(R.id.c1);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("c1", "c1 was pressed");
        if (isGameStarted && c1 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(c1 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void d1(View view) {
        ImageView d1 = findViewById(R.id.d1);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("d1", "d1 was pressed");
        if (isGameStarted && d1 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(d1 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void e1(View view) {
        ImageView e1 = findViewById(R.id.e1);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("e1", "e1 was pressed");
        if (isGameStarted && e1 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(e1 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void f1(View view) {
        ImageView f1 = findViewById(R.id.f1);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("f1", "f1 was pressed");
        if (isGameStarted && f1 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(f1 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void g1(View view) {
        ImageView g1 = findViewById(R.id.g1);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("g1", "g1 was pressed");
        if (isGameStarted && g1 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(g1 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }

    public void h1(View view) {
        ImageView h1 = findViewById(R.id.h1);
        puzzleScoreText = findViewById(R.id.puzzleScoreText);
        guessingSquare = findViewById(R.id.guessingSquare);
        Log.d("h1", "h1 was pressed");
        if (isGameStarted && h1 == imageViewMap.get(squareNames.get(randomNumber))) {
            puzzleScoreText.setText(R.string.text_correct);
            guessingSquare.setText(null);
            isGameStarted = false;
        } else if (isGameStarted && !(h1 == imageViewMap.get(squareNames.get(randomNumber)))) {
            puzzleScoreText.setText(R.string.text_wrong);
            guessingSquare.setText(null);
            isGameStarted = false;
        }
    }
}