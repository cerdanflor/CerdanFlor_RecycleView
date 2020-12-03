package com.dam.dam_recyclerview;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 */
public class RestauranteFragment extends Fragment {
    RecyclerView recyclerView;
    MyRestauranteRecyclerViewAdapter adapterRestaurantes;
    List<Restaurante> restauranteList;

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public RestauranteFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static RestauranteFragment newInstance(int columnCount) {
        RestauranteFragment fragment = new RestauranteFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_item_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                // En este caso el listado será un listado lineal
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                // En este caso el listado será en columnas
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }
            // En este caso se utiliza un Adaptador Personalizado
            // Esto se puede visualizar en el fichero: MyRestauranteRecyclerViewApa

            // Lista de elementos (Restaurantes)
            restauranteList = new ArrayList<>();
            restauranteList.add(new Restaurante("Pollería Norkys","", 4.0f, "Av. Revolucion 555" ));
            restauranteList.add(new Restaurante("Cevichería Don Gonzalo","", 4.0f, "Av. Cesar Vallejos 123" ));
            restauranteList.add(new Restaurante("Chaufa El Chino","", 4.0f, "Av. Mariategui 111" ));
            restauranteList.add(new Restaurante("Caldo de Gallina Salvavidas","", 4.0f, "Av. Bolivar 844" ));

            //Ahora, asociamos el adaptador al RecyclerView
            adapterRestaurantes = new MyRestauranteRecyclerViewAdapter(restauranteList);
            recyclerView.setAdapter(adapterRestaurantes);
        }
        // Finalmente retornará la lista
        return view;
    }
}