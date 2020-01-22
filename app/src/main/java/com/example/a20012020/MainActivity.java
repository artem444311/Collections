package com.example.a20012020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a20012020.Catpackage.Cat;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    private ArrayList<Cat> cats;
    private HashMap<Integer, Cat> map;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cats = catArrayList();
        map = catMashmap();
    }
    private ArrayList<Cat> catArrayList(){
        ArrayList cats = new ArrayList();
        for (int i=0; i<10; i++){
            cats.add(new Cat( "Simon",(int) (Math.random() * 10)));
        }
        return cats;
    }
    private HashMap<Integer,Cat> catMashmap(){
        HashMap<Integer,Cat> catHashMap = new HashMap<>();
        for (int i=0; i<10; i++){
            catHashMap.put(i,new Cat( "Alex",(int) (Math.random() * 10)));
        }
        System.out.print(cats.get(10));


        return catHashMap;


    }
}
