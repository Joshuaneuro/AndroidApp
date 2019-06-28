package com.example.joshua.androidweek5;

import android.app.Fragment;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class LoginFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstance) {
        View view = inflater.inflate(R.layout.fragment_login, viewGroup,false);

        Button loginbutton = (Button) view.findViewById(R.id.LoginButton);
        TextView usernameText = view.findViewById(R.id.loginText);
        TextView passwordText = view.findViewById(R.id.passwordText);

        loginbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(R.id.fragment, new FriendsFragment());
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });

        return view;
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);



    }

    //TextView textView = (TextView)findViewById(R.id.loginText);
}
