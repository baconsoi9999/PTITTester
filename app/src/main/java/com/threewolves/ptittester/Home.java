package com.threewolves.ptittester;


import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;




/**
 * A simple {@link Fragment} subclass.
 */
public class Home extends Fragment {
    private ProgressDialog infoDialog;

    public Home() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        /**logo click info dialog*/

        return inflater.inflate(R.layout.fragment_home, container, false);

    }

}
