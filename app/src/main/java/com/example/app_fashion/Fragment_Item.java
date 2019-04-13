package com.example.app_fashion;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.text.Format;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Fragment_Item extends Fragment {
    private RecyclerView recyclerView;
    private List<Fashion> listF = new ArrayList<>();
    private  Adapter_Fashion adapterFhashion;

    public static Fragment_Item newInstance(int id) {

        Bundle args = new Bundle();
        args.putInt("id",id);
        Fragment_Item fragment = new Fragment_Item();
        fragment.setArguments(args);
        return fragment;
    }
    private  int idGR;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        idGR = getArguments().getInt("id");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item,container,false);

        recyclerView=view.findViewById(R.id.recyclerView);

        loadData();

        adapterFhashion= new Adapter_Fashion(getContext(),listF);
        RecyclerView.LayoutManager layoutManager= new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapterFhashion);
        return view;

    }

    private void loadData() {

        Api.getRetrofit().create(Api.Data_Service.class)
                .getFashio("t",idGR)
                .enqueue(new Callback<Fashion_ListResponse>() {
                    @Override
                    public void onResponse(Call<Fashion_ListResponse> call, Response<Fashion_ListResponse> response) {
                        //
                        if (response.isSuccessful()){
//                                    try {
//                                        Log.e("getCooking List",response.body().string());
//                                    } catch (IOException e) {
//                                        Log.e("getCooking List Err0 ",e.getMessage());
//                                        e.printStackTrace();
//                                    }
                            listF.clear();
                            listF.addAll(response.body().getNewsList());
                            adapterFhashion.notifyDataSetChanged();
                        }else {
                            Log.e("getFashio Error 1",response.message());
                        }
                    }

                    @Override
                    public void onFailure(Call<Fashion_ListResponse> call, Throwable throwable) {
                        Log.e("getFashio False Erro 2", throwable.getMessage());
                        throwable.printStackTrace();
                    }
                });

    }
}
