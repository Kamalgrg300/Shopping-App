package edu.qc.seclass.fim;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {
    ImageView imageView;
    TextView brandView, sizeView, colorView, typeView, priceView;
    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        imageView = itemView.findViewById(R.id.imageview);
        brandView = itemView.findViewById(R.id.brand);
        sizeView = itemView.findViewById(R.id.size);
        colorView = itemView.findViewById(R.id.color);
        typeView = itemView.findViewById(R.id.type);
        priceView = itemView.findViewById(R.id.price);
    }
}
