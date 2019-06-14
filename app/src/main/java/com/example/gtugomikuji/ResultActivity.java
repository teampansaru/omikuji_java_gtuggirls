package com.example.gtugomikuji;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        String unseiText;
        Random random = new Random();
        switch (random.nextInt(9)) {
            case 0:
                unseiText = "大凶";
                break;
            case 1:
                unseiText = "凶";
                break;
            case 2:
                unseiText = "吉";
                break;
            case 3:
                unseiText = "小吉";
                break;
            case 4:
                unseiText = "大吉♡";
                break;
            case 5:
                unseiText = "めっちゃ凶";
                break;
            case 6:
                unseiText = "すごい凶";
                break;
            case 7:
                unseiText = "なんとも言えないくらい凶";
                break;
            case 8:
                unseiText = "凶すぎて凶";
                break;
            default:
                unseiText = "凶すぎて凶";
        }
        TextView result = findViewById(R.id.result);
        result.setText(unseiText);

//        トーストの場合はコメントの文
//        Toast.makeText(this, unseiText, Toast.LENGTH_SHORT).show()

        Button returnButton = findViewById(R.id.return_button);
        returnButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}
