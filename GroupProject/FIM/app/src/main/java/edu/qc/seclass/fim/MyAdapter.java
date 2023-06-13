package edu.qc.seclass.fim;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<ViewHolder> implements Filterable {

    Context context;
    List<Item> items;
    List<Item> itemsAll;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
        this.itemsAll = new ArrayList<>(items);
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_view, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.brandView.setText(items.get(position).getBrand());
        holder.colorView.setText(items.get(position).getColor());
        holder.imageView.setImageResource(items.get(position).getImage());
       // holder.priceView.setText(items.get(position).getPrice());
       // holder.sizeView.setText(items.get(position).getSize());
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    @Override
    public Filter getFilter() {
        return filter;
    }

    Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence charSequence) {
            List<Item> filteredList = new ArrayList<>();
            if(charSequence.toString().isEmpty()){
                filteredList.addAll(itemsAll);
            }else{
                for(Item item: itemsAll){
                    if(item.getBrand().toLowerCase().contains(charSequence.toString().toLowerCase())){
                        filteredList.add(item);
                    }
                }
            }

            FilterResults filterResults = new FilterResults();
            filterResults.values = filteredList;
            return filterResults;
        }

        @Override
        protected void publishResults(CharSequence charSequence, FilterResults filterResults) {
            items.clear();
            items.addAll((Collection<? extends Item>) filterResults.values);
            notifyDataSetChanged();
        }
    };
}
