package com.example.final_project.ui.about;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.final_project.R;
import com.example.final_project.databinding.FragmentAboutBinding;

public class AboutFragment extends Fragment {

    private FragmentAboutBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentAboutBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        Button btnShowImage = binding.btnShowImage;
        ImageView imageView = binding.imageView;

        btnShowImage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int drawableId = R.drawable.cv;


                imageView.setImageResource(drawableId);
            }
        });

        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}