package net.lrivas.s02dama.ui.main;

import static android.content.Intent.ACTION_VIEW;
import static android.content.Intent.CATEGORY_BROWSABLE;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import net.lrivas.s02dama.R;


public class FragmentoDos extends Fragment {

    Button btnU;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {


        View fragDos = inflater.inflate(R.layout.fragment_fragmento_dos, container, false);
        btnU = fragDos.findViewById(R.id.button);

        btnU.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String url = "https://www.univo.edu.sv/";
                String query = Uri.encode(url, "UTF-8");
                Intent intent = new Intent(CATEGORY_BROWSABLE, Uri.parse(Uri.decode(query)));
                intent.setAction(ACTION_VIEW);
                startActivity(intent);
            }
        });
        return fragDos;
    }
}