package lielTitel.thesimpsons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer openSong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button start = (Button) findViewById(R.id.startBtn);
        openSong = MediaPlayer.create(MainActivity.this, R.raw.start_music);

        openSong.start();
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSong.release();
                Intent intent = new Intent(v.getContext(), MainGame.class);
                v.getContext().startActivity(intent);
                finish();
            }
        });
    }
}

