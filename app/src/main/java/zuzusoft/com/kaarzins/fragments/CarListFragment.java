package zuzusoft.com.kaarzins.fragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

import zuzusoft.com.kaarzins.R;
import zuzusoft.com.kaarzins.adapter.CarAdapter;
import zuzusoft.com.kaarzins.model.Car;

/**
 * Created by mukeshnarayan on 30/07/18.
 */

public class CarListFragment extends Fragment {


    private RecyclerView rv_cars;
    private CarAdapter adapter;
    private ArrayList<Car> carArrayList = new ArrayList<>();
    private String[] carImgUrl = {"http://pngimg.com/uploads/cadillac/cadillac_PNG69.png",
            "http://pngimg.com/uploads/camaro/camaro_PNG34.png",
            "http://pngimg.com/uploads/fiat/fiat_PNG11899.png",
            "http://pngimg.com/uploads/mercedes/mercedes_PNG1840.png",
            "http://pngimg.com/uploads/toyota/toyota_PNG1913.png"};

    private String[] carName = {"Cadillac",
            "Camaro",
            "Fiat",
            "Mercedes",
            "Toyota"};

    private String[] carType = {"Big",
            "Medium",
            "Small",
            "Medium",
            "Medium"};

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.layout_car_list, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        initView(view);
    }

    private void initView(View view) {

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());

        rv_cars = view.findViewById(R.id.rv_cars);
        rv_cars.setLayoutManager(mLayoutManager);
        DividerItemDecoration itemDecor = new DividerItemDecoration(getActivity(), DividerItemDecoration.VERTICAL);
        rv_cars.addItemDecoration(itemDecor);
        rv_cars.setItemAnimator(new DefaultItemAnimator());

        generateCarList();

        adapter = new CarAdapter(getActivity(), carArrayList);
        rv_cars.setAdapter(adapter);


    }


    private void generateCarList() {

        for (int i = 0; i < carImgUrl.length; i++) {
            Car car = new Car(carImgUrl[i],
                    carName[i], carType[i], getString(R.string.str_car_feature),
                    getString(R.string.sign_euro) + " " + (30.00 + (i + 1) * 2) + " Per Day");
            carArrayList.add(car);
        }

    }
}