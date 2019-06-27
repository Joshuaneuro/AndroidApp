package com.example.joshua.androidweek5;

import android.app.ListFragment;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MusicFragment extends ListFragment implements AdapterView.OnItemClickListener{
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup viewGroup, Bundle savedInstance) {
        return inflater.inflate(R.layout.fragment_music, viewGroup,false);
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        ArrayList<String> songs = new ArrayList<>();
        songs.add("Smells like Teen spirit");
        songs.add("On Bloom");
        songs.add("Nevermind");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,songs);
        setListAdapter(adapter);
        getListView().setOnItemClickListener(this);

    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id ) {
        Log.d("Klikkie","Je hebt geklikt" + position);
    }

}
