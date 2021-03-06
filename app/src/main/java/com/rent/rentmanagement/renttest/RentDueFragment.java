package com.rent.rentmanagement.renttest;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by imazjav0017 on 01-03-2018.
 */

public class RentDueFragment extends Fragment {
    View v;
    Context context;
    static OccupiedRoomsAdapter adapter2;
    RecyclerView occupiedRoomsListView;

    public RentDueFragment(Context context) {
        this.context=context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v=inflater.inflate(R.layout.rent_due_tab,container,false);
        occupiedRoomsListView=(RecyclerView)v.findViewById(R.id.occupiedRoomsList);
        adapter2=new OccupiedRoomsAdapter(roomActivity.oRooms,context);
        LinearLayoutManager lm1=new LinearLayoutManager(context);
        occupiedRoomsListView.setLayoutManager(lm1);
        occupiedRoomsListView.setHasFixedSize(true);
        occupiedRoomsListView.setAdapter(adapter2);
        return v;
    }
}
