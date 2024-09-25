package app.ubu.projectmycar;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

import app.ubu.projectmycar.model.Car;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private List<Car> values;
    private Context context;

    public MyAdapter(List<Car> values, Context context) {
        this.values = values;
        this.context = context;
}
    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        public TextView txtHeader;
        public TextView txtFooter;
        public View layout;

        public ViewHolder(View v) {
            super(v);
            layout = v;
            imageView = (ImageView) v.findViewById(R.id.icon);
            txtHeader = (TextView) v.findViewById(R.id.firstLine);
            txtFooter = (TextView) v.findViewById(R.id.secondLine);

    }
}
    @Override
    public MyAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View v = inflater.inflate(R.layout.row_layout, parent, false);

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, final int position) {

        final Car car = values.get(position);
        holder.txtHeader.setText(car.getCar_name());
        holder.txtFooter.setText(car.getCar_price() + " บาท");

        Glide.with(context)
                .load(car.getCar_image())
                .into(holder.imageView);
        holder.imageView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, car_detail.class);
                intent.putExtra("CarName", car.getCar_name());
                intent.putExtra("CarImgUrl", car.getCar_image());
                intent.putExtra("CarPrice", car.getCar_price());
                intent.putExtra("CarModel",car.getCar_model());
                intent.putExtra("CarYear",car.getCar_year());
                intent.putExtra("CarDescription",car.getCar_description());

                context.startActivity(intent);

            }
        });

    }

    @Override
    public int getItemCount() {
        return values.size();
    }

}