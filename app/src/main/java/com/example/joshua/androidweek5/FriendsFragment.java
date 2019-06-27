package com.example.joshua.androidweek5;

import android.app.ListFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class FriendsFragment extends ListFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup,Bundle savedInstance) {
        return inflater.inflate(R.layout.fragment_friends, viewGroup,false);
    }
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<String> friends = new ArrayList<>();
        friends.add("Chef");
        friends.add("Hanna");
        friends.add("Jeroen");
        friends.add("Laurens");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,friends);
        setListAdapter(adapter);

    }
}
