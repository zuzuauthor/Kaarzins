package zuzusoft.com.kaarzins.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatImageView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.bumptech.glide.Glide;


import java.util.ArrayList;

import zuzusoft.com.kaarzins.R;
import zuzusoft.com.kaarzins.model.Car;


/**
 * Created by mukeshnarayan on 30/07/18.
 */

public class CarAdapter extends RecyclerView.Adapter<CarAdapter.ViewHolder> {
    LayoutInflater inflater;
    Resources resources;
    Onclick listener;
    Context context;
    private ArrayList<Car> carArrayList;


    public CarAdapter(Context context, ArrayList<Car> _carArrayList) {
        this.carArrayList = _carArrayList;
        this.context = context;

    }

    public void setListener(Onclick listener) {
        this.listener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        resources = context.getResources();
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        final View view = LayoutInflater.from(context).inflate(R.layout.item_list, parent,
                false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;

    }

    @Override
    public void onBindViewHolder(final ViewHolder viewHolder, final int position) {

        Car car = carArrayList.get(position);

        if (car != null) {

            viewHolder.tv_name.setText(car.getName());
            viewHolder.tv_type.setText(car.getType());
            viewHolder.tv_features.setText(car.getFeatures());
            viewHolder.tv_price.setText(car.getPrice());

            Glide.with(context).load(car.getCarImageUrl()).into(viewHolder.iv_car);

        }

    }

    @Override
    public long getItemId(int position) {
        return (position);
    }

    @Override
    public int getItemViewType(int position) {
        return 0;
    }

    @Override
    public int getItemCount() {
        return carArrayList.size();
    }

    public interface Onclick {
        void onclick(View view, int position);
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_price, tv_name, tv_type, tv_features;
        private AppCompatImageView iv_car;

        public ViewHolder(View itemLayoutView) {
            super(itemLayoutView);
            tv_price = itemLayoutView.findViewById(R.id.tv_price);
            tv_name = itemLayoutView.findViewById(R.id.tv_name);
            tv_type = itemLayoutView.findViewById(R.id.tv_type);
            tv_features = itemLayoutView.findViewById(R.id.tv_features);
            iv_car = itemLayoutView.findViewById(R.id.iv_car);

        }
    }

}