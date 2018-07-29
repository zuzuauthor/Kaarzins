package zuzusoft.com.kaarzins;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import zuzusoft.com.kaarzins.adapters.CarAdapter;
import zuzusoft.com.kaarzins.models.Car;

public class HomeActivity extends AppCompatActivity {

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
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        initView();
    }

    private void initView() {

        LinearLayoutManager mLayoutManager = new LinearLayoutManager(HomeActivity.this);

        rv_cars = findViewById(R.id.rv_cars);
        rv_cars.setLayoutManager(mLayoutManager);
        DividerItemDecoration itemDecor = new DividerItemDecoration(HomeActivity.this, DividerItemDecoration.VERTICAL);
        rv_cars.addItemDecoration(itemDecor);
        rv_cars.setItemAnimator(new DefaultItemAnimator());

        generateCarList();

        adapter = new CarAdapter(HomeActivity.this, carArrayList);
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
