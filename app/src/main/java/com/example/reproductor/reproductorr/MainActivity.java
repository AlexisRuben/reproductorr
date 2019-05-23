package com.example.reproductor.reproductorr;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MediaPlayer media;
    int rep= 5 , posicion=0;
    Button btnplay;
    ImageView ima;
    MediaPlayer vec [] = new MediaPlayer [6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


         btnplay = findViewById(R.id.btnplay);
        Button btnpause = findViewById(R.id.btnpause);
        Button btnstop = findViewById(R.id.btnstop);
        Button btnanterior = findViewById(R.id.btnanterior);
        Button btnsiguiente = findViewById(R.id.btnsiguiente);
         ima = findViewById(R.id.imageView);

       vec[0]= MediaPlayer.create(this, R.raw.sia);
        vec[1]= MediaPlayer.create(this, R.raw.sia2);
        vec[2]= MediaPlayer.create(this, R.raw.sia3);
        vec[3]= MediaPlayer.create(this, R.raw.sia4);
        vec[4]= MediaPlayer.create(this, R.raw.sia5);
        vec[5]= MediaPlayer.create(this, R.raw.sia6);

        btnplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(vec[posicion].isPlaying()){
                    Toast mensaje = Toast.makeText(getApplicationContext(),"Reproduccion en curso",Toast.LENGTH_SHORT);
                    mensaje.show();
                }else{
                vec[posicion].start();
                Toast mensaje = Toast.makeText(getApplicationContext(),"Play",Toast.LENGTH_SHORT);
                mensaje.show();}

            }
        });

        btnpause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                vec[posicion].pause();
                Toast mensaje = Toast.makeText(getApplicationContext(),"Pause",Toast.LENGTH_SHORT);
                mensaje.show();
            }
        });



    }


    public void Play(View view){
        if(vec[posicion].isPlaying()){
            vec[posicion].start();
            Toast.makeText(this, "play", Toast.LENGTH_SHORT).show();
        }
    }
    public void Pause(View view){

            vec[posicion].pause();
            Toast.makeText(this, "Pausa", Toast.LENGTH_SHORT).show();

    }
  public void Stop(View view){
      if(vec[posicion]!=null){
          vec[posicion].stop();

          vec[0] = MediaPlayer.create(this,R.raw.sia);
          vec[1]= MediaPlayer.create(this, R.raw.sia2);
          vec[2]= MediaPlayer.create(this, R.raw.sia3);
          vec[3]= MediaPlayer.create(this, R.raw.sia4);
          vec[4]= MediaPlayer.create(this, R.raw.sia5);
          vec[5]= MediaPlayer.create(this, R.raw.sia6);
          posicion= 0;
          Toast.makeText(this, "Stop", Toast.LENGTH_SHORT).show();
      }

    }
    public void Siguiente(View view){
        if(posicion < vec.length -1){

            if(vec[posicion].isPlaying()){
                vec[posicion].stop();
                vec[0] = MediaPlayer.create(this, R.raw.sia);
                vec[1] = MediaPlayer.create(this, R.raw.sia2);
                vec[2] = MediaPlayer.create(this, R.raw.sia3);
                vec[3]= MediaPlayer.create(this, R.raw.sia4);
                vec[4]= MediaPlayer.create(this, R.raw.sia5);
                vec[5]= MediaPlayer.create(this, R.raw.sia6);

                posicion++;
                if(posicion == 0){
                    ima.setImageResource(R.drawable.por1);
                } else if(posicion == 1){
                    ima.setImageResource(R.drawable.por2);
                }else if(posicion == 2){
                    ima.setImageResource(R.drawable.por3);
                }else if(posicion == 3){
                    ima.setImageResource(R.drawable.por4);
                }else if(posicion == 4){
                    ima.setImageResource(R.drawable.por5);
                }else if(posicion == 5){
                    ima.setImageResource(R.drawable.por6);
                }

            } else {
                posicion++;

                if(posicion == 0){
                    ima.setImageResource(R.drawable.por1);
                } else if(posicion == 1){
                    ima.setImageResource(R.drawable.por2);
                }else if(posicion == 2){
                    ima.setImageResource(R.drawable.por3);
                }else if(posicion == 3){
                    ima.setImageResource(R.drawable.por4);
                }else if(posicion == 4){
                    ima.setImageResource(R.drawable.por5);
                }else if(posicion == 5){
                    ima.setImageResource(R.drawable.por6);
                }
            }

        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }


    public void Anterior(View view){
        if(posicion >= 1){

            if(vec[posicion].isPlaying()){
                vec[posicion].stop();
                vec[0] = MediaPlayer.create(this, R.raw.sia);
                vec[1] = MediaPlayer.create(this, R.raw.sia2);
                vec[2] = MediaPlayer.create(this, R.raw.sia3);
                vec[3]= MediaPlayer.create(this, R.raw.sia4);
                vec[4]= MediaPlayer.create(this, R.raw.sia5);
                vec[5]= MediaPlayer.create(this, R.raw.sia6);
                posicion--;

                if(posicion == 0){
                    ima.setImageResource(R.drawable.por1);
                } else if(posicion == 1){
                    ima.setImageResource(R.drawable.por2);
                }else if(posicion == 2){
                    ima.setImageResource(R.drawable.por3);
                }else if(posicion == 3){
                    ima.setImageResource(R.drawable.por4);
                }else if(posicion == 4){
                    ima.setImageResource(R.drawable.por5);
                }else if(posicion == 5){
                    ima.setImageResource(R.drawable.por6);
                }

                vec[posicion].start();

            } else {
                posicion--;

                if(posicion == 0){
                    ima.setImageResource(R.drawable.por1);
                } else if(posicion == 1){
                    ima.setImageResource(R.drawable.por2);
                }else if(posicion == 2){
                    ima.setImageResource(R.drawable.por3);
                }else if(posicion == 3){
                    ima.setImageResource(R.drawable.por4);
                }else if(posicion == 4){
                    ima.setImageResource(R.drawable.por5);
                }else if(posicion == 5){
                    ima.setImageResource(R.drawable.por6);
                }
            }

        } else {
            Toast.makeText(this, "No hay más canciones", Toast.LENGTH_SHORT).show();
        }
    }


}
