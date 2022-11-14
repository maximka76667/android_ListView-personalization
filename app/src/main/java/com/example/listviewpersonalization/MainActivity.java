package com.example.listviewpersonalization;

import android.os.Bundle;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = this.findViewById(R.id.listView);

        ArrayList<Article> articles = new ArrayList<Article>();
        articles.add(new Article("X1", "Article-1", 10));
        articles.add(new Article("X2", "Article-2", 5));
        articles.add(new Article("X3", "Article-3", 8));

        ArticlesAdapter adapter = new ArticlesAdapter(MainActivity.this, R.layout.article_layout, articles);

        listView.setAdapter(adapter);
    }
}