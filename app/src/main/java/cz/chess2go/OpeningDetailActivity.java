package cz.chess2go;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.List;

public class OpeningDetailActivity extends AppCompatActivity {

    private List<Integer> imageResIds;
    private int currentIndex = 0;
    private ImageView openingImage;
    private Button backwardButton;
    private Button forwardButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_opening_detail);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        openingImage = findViewById(R.id.openingImage);
        TextView openingTitle = findViewById(R.id.openingTitle);
        TextView openingDescription = findViewById(R.id.openingDescription);

        backwardButton = findViewById(R.id.backwardButton);
        forwardButton = findViewById(R.id.forwardButton);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String description = intent.getStringExtra("description");
        imageResIds = intent.getIntegerArrayListExtra("imageResIds");

        if (imageResIds == null || imageResIds.isEmpty()) {
            imageResIds = new ArrayList<>();
            imageResIds.add(R.drawable.default_image);
        }

        openingTitle.setText(title);
        openingDescription.setText(description);

        if (!imageResIds.isEmpty()) {
            updateImage();
        }

        backwardButton.setOnClickListener(v -> showPreviousImage());
        forwardButton.setOnClickListener(v -> showNextImage());

        updateButtons();
    }

    private void updateImage() {
        openingImage.setImageResource(imageResIds.get(currentIndex));
    }

    private void showPreviousImage() {
        if (currentIndex > 0) {
            currentIndex--;
            updateImage();
            updateButtons();
        }
    }

    private void showNextImage() {
        if (currentIndex < imageResIds.size() - 1) {
            currentIndex++;
            updateImage();
            updateButtons();
        }
    }

    private void updateButtons() {
        long animationDuration = 150;

        if (currentIndex == 0) {
            backwardButton.animate().alpha(0.3f).setDuration(animationDuration).start();
            backwardButton.setEnabled(false);
            backwardButton.setBackgroundColor(ContextCompat.getColor(this, R.color.button_disabled_color));
        } else {
            backwardButton.animate().alpha(1f).setDuration(animationDuration).start();
            backwardButton.setEnabled(true);
            backwardButton.setBackgroundColor(ContextCompat.getColor(this, R.color.button_enabled_color));
        }

        if (currentIndex == imageResIds.size() - 1) {
            forwardButton.animate().alpha(0.3f).setDuration(animationDuration).start();
            forwardButton.setEnabled(false);
            forwardButton.setBackgroundColor(ContextCompat.getColor(this, R.color.button_disabled_color));
        } else {
            forwardButton.animate().alpha(1f).setDuration(animationDuration).start();
            forwardButton.setEnabled(true);
            forwardButton.setBackgroundColor(ContextCompat.getColor(this, R.color.button_enabled_color));
        }
    }

    public void backToOpenings(View view) {
        Intent intent = new Intent(this, OpeningsMenuActivity.class);
        ActivityOptions options = ActivityOptions.makeCustomAnimation(
                this,
                R.anim.slide_in_left,
                R.anim.slide_out_right
        );
        startActivity(intent, options.toBundle());
    }
}
