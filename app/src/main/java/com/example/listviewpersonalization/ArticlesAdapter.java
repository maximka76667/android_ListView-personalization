package com.example.listviewpersonalization;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ArticlesAdapter extends ArrayAdapter<Article> {

    protected Activity activity;
    protected int itemId;
    protected List<Article> articles;

    public ArticlesAdapter(@NonNull Context context, int resource, @NonNull List<Article> objects) {
        super(context, resource, objects);
        this.activity = (Activity) context;
        this.itemId = resource;
        this.articles = objects;
    }

    public void setArticle(View view, Article article) {
        Refs refs = (Refs) view.getTag();

        refs.textView_name.setText(article.getName());
        refs.textView_code.setText(article.getCode());
        refs.textView_stock.setText("" + article.getStock());

        if (article.getStock() == 0) {
            refs.textView_stock.setTextColor(Color.RED);
        } else {
            refs.textView_stock.setTextColor(Color.BLACK);
        }
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View itemView, @NonNull ViewGroup parent) {

        if (itemView == null) {
            itemView = activity.getLayoutInflater().inflate(itemId, null);
            itemView.setTag(new Refs(itemView, R.id.name, R.id.code, R.id.stock));
        }

        setArticle(itemView, articles.get(position));

        return itemView;
    }

    public static class Refs {
        TextView textView_name;
        TextView textView_code;
        TextView textView_stock;

        public Refs(View itemView, int idTextView_name, int idTextView_code, int idTextView_stock) {
            this.textView_name = itemView.findViewById(idTextView_name);
            this.textView_code = itemView.findViewById(idTextView_code);
            this.textView_stock = itemView.findViewById(idTextView_stock);
        }
    }
}
