package com.devtfvl.navsub.ui.contato;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.devtfvl.navsub.R;

import org.w3c.dom.Element;

import mehdi.sakout.aboutpage.AboutPage;

public class Contato extends Fragment {
    public Contato() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //return inflater.inflate(R.layout.fragment_contato, container, false);
   String descricao = "Lorem Ipsum é simplesmente um texto fictício da indústria tipográfica e de impressão";

   return new AboutPage(getContext())
           .setImage(R.drawable.logo)
           .setDescription(descricao)
           .addGroup("Entre em contato")
           .addEmail("atendimento@atmconsultoria.com")
           .addWebsite("https://www.google.com/", "Acesse nosso site")

           .addGroup("Redes Sociais")
           .addFacebook("atmconsultoria", "Facebook")
           .addTwitter("atmconsultoria", "Twitter")
           .addInstagram("etesenadorwilsoncampos", "Instagram")

           .create();

    }
}