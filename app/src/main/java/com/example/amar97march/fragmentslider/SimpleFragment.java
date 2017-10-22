package com.example.amar97march.fragmentslider;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by amar97march on 03-09-2017.
 */

public class SimpleFragment extends Fragment{
    public static final String MESSAGE="";

    public static SimpleFragment newInstance(String message){
        SimpleFragment fragment=new SimpleFragment();
        //create a bundle for our message
        Bundle bundle=new Bundle(1);
        //load the bundle
        bundle.putString(MESSAGE,message);

        fragment.setArguments(bundle);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle savedInstanceState){
        //get id from the Bundle
        String message=getArguments().getString(MESSAGE);
        View view=inflater.inflate(R.layout.fragment_layout,container,false);
        TextView messageTextView=(TextView)view.findViewById(R.id.textView);

        //Display the id in the TextView
        messageTextView.setText(message);
        return view;
    }
}
