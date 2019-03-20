package com.lydone.bmstuandroid.data;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.lydone.bmstuandroid.R;

import java.util.List;

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuViewHolder> {

    private List<Item> mItems;

    public MenuAdapter(List<Item> items) {
        mItems = items;
    }
    @NonNull
    @Override
    public MenuViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_item,
                viewGroup, false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MenuViewHolder menuViewHolder, int i) {
        menuViewHolder.bind(i);
    }

    @Override
    public int getItemCount() {
        return mItems.size();
    }

    class MenuViewHolder extends RecyclerView.ViewHolder {
        private TextView mNameTV;
        private TextView mWeightTV;
        private TextView mPriceTV;
        private ImageView mImageView;
        private Button mButton;


        MenuViewHolder(View itemView) {
            super(itemView);
            mNameTV = itemView.findViewById(R.id.tv_name);
            mWeightTV = itemView.findViewById(R.id.tv_weight);
            mPriceTV = itemView.findViewById(R.id.tv_price);
            mImageView = itemView.findViewById(R.id.imageView);
            mButton = itemView.findViewById(R.id.btn_add_to_cart);

        }

        private void bind(int i) {
            Item item = mItems.get(i);
            mNameTV.setText(item.getName());
            mWeightTV.setText("Weight: " + item.getWeight());
            mPriceTV.setText("Price: " + item.getPrice());
            mImageView.setImageDrawable(mNameTV.getContext().getDrawable(R.drawable.ic_launcher_background));
            mButton.setOnClickListener((v) -> {
                Cart.getInstance().AddToCart(item);
                Toast.makeText(mNameTV.getContext(), "" + Cart.getInstance().GetSum(), Toast.LENGTH_SHORT).show();
            });
        }
    }
}
