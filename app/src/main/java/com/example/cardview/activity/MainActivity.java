package com.example.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.cardview.R;
import com.example.cardview.adapter.AdapterPostagem;
import com.example.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerPostagem);

        //Define layout
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayout.HORIZONTAL);
        //RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerPostagem.setLayoutManager(layoutManager);

        //define adapter
        this.prepararPostagens();
        AdapterPostagem adapter = new AdapterPostagem(postagens);
        recyclerPostagem.setAdapter(adapter);
    }

    public void prepararPostagens(){
        Postagem p = new Postagem("Rafael Quartaroli", "Viagem legal", R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("Hotel Quartaroli", "Viagem, aproveite os descontos", R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("Amelia", "#Paris", R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("Maria Lucia", "Que foto linda", R.drawable.imagem4);
        this.postagens.add(p);
    }
}
