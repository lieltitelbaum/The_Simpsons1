package lielTitel.thesimpsons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GameOver extends AppCompatActivity {

    private TextView scoreLabel;
    private MediaPlayer gameOverSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_over);

        gameOverSong = MediaPlayer.create(GameOver.this, R.raw.game_over);
        gameOverSong.start();

        scoreLabel = (TextView) findViewById(R.id.scoreGameOver);

        String score = getIntent().getStringExtra("key");
        scoreLabel.setText("score : " + score);
    }

    public void startGame(View view)
    {
        gameOverSong.release();
        startActivity(new Intent(getApplicationContext(), MainActivity.class));
    }

}
