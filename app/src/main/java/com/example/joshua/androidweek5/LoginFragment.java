package com.example.joshua.androidweek5;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstance) {
        Button loginbutton = (Button) getView().findViewById(R.id.LoginButton);
        TextView usernameText = getView().findViewById(R.id.loginText);
        TextView passwordText = getView().findViewById(R.id.passwordText);

        return inflater.inflate(R.layout.fragment_login, viewGroup,false);

    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }



    //TextView textView = (TextView)findViewById(R.id.loginText);
}
