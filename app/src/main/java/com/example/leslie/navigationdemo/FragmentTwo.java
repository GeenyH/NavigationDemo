package com.example.leslie.navigationdemo;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentTwo extends Fragment {


    public FragmentTwo() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.btn_go_back_fragment_one).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentTwo_to_fragmentOne);
        });
        view.findViewById(R.id.btn_go_activity2).setOnClickListener(v -> {
            Navigation.findNavController(v).navigate(R.id.action_fragmentTwo_to_mainActivity2);
        });
    }
}
