package com.beratates.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.beratates.kentsimgeleri.databinding.ActivityDetaylarBinding;

public class Detaylar extends AppCompatActivity {
    private ActivityDetaylarBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetaylarBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        Intent intent = getIntent();
        //Casting
        Landmark selectedLandmark =(Landmark) intent.getSerializableExtra("landmark");

        binding.nameText.setText(selectedLandmark.name);
        binding.countryText.setText(selectedLandmark.country);
        binding.imageView.setImageResource(selectedLandmark.image);
       // binding.dateText.setText(selectedLandmark.date);
        binding.architectText.setText(selectedLandmark.architect);

    }
}