package com.pixelhubllc.childbook;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button bangBtn, engBtn, mathBtn,phyBtn;
    String[] title = {"A", "B", "C", "D", "E"};
    String[] description = {"Apple, Amazon, Ant", "Bat, Ball, Book", "Cat, Cry, Coffe",
            "Doll, Dog, Door", "Elephant, Egg, Eye"};

    String[] titleBan = {"অ", "আ", "ই", "ঈ", "উ"};
    String[] descriptionBan = {"অজগর, অকাজ, অকারণে", "আম, আকাশ, আঁখি", "ইচ্ছা, ইঁদুর, ইউরোপ",
            "ঈদ ,ঈগল, ঈথর", "উসা, উর্মি, উকিঝুঁকি"};

    String[] titlePhy = {"Isaac Newton", "Niels Bohr", "Galileo Galilei", "Albert Einstein", "Michael Faraday"};
    String[] descriptionPhy = {"Calculus, Telescopes, Orbital cannon", "Hydrogen atom, Quantum physics, Atomic Physics",
            "Celatone, Galileo's micrometer, Galileo's escapement",
            "E=mc2, Brownian movement, Avogadro's Number", "Diamagnetism, Chemical bonding, Electric current"};

    String[] titleMath = {"1", "2", "3", "4", "5"};
    String[] descriptionMath = {"One, One, One", "Two, Two, Two", "Three, Three, Three",
            "Four, Four, Four", "Five, Five, Five"};




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bangBtn = findViewById(R.id.banBtn);
        engBtn = findViewById(R.id.engBtn);
        mathBtn = findViewById(R.id.mathBtn);
        phyBtn = findViewById(R.id.phyBtn);

        bangBtn.setOnClickListener(this);
        engBtn.setOnClickListener(this);
        mathBtn.setOnClickListener(this);
        phyBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.banBtn){
            Intent intent = new Intent(MainActivity.this, StudyActivity.class);
            intent.putExtra("title",titleBan);
            intent.putExtra("description",descriptionBan);
            startActivity(intent);
        }

        if (v.getId()==R.id.engBtn){
            Intent intent = new Intent(MainActivity.this, StudyActivity.class);
            intent.putExtra("title",title);
            intent.putExtra("description",description);
            startActivity(intent);
        }
        if (v.getId()==R.id.mathBtn){
            Intent intent = new Intent(MainActivity.this, StudyActivity.class);
            intent.putExtra("title",titleMath);
            intent.putExtra("description",descriptionMath);
            startActivity(intent);
        }
        if (v.getId()==R.id.phyBtn){
            Intent intent = new Intent(MainActivity.this, StudyActivity.class);
            intent.putExtra("title",titlePhy);
            intent.putExtra("description",descriptionPhy);
            startActivity(intent);
        }

    }
}
