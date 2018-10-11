package com.example.leslie.navigationdemo;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

public class FragmentThree extends Fragment {

    public static FragmentThree newInstance() {
        return new FragmentThree();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_three, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_go_to_fragment_four).setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_fragmentFour);
        });
        view.findViewById(R.id.btn_go_to_nav_one).setOnClickListener(v -> {
            Navigation.findNavController(view).navigate(R.id.action_fragmentThree_to_nav_one);
        });
    }

}
