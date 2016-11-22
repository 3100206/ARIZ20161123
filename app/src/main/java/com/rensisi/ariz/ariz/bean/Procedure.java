package com.rensisi.ariz.ariz.bean;

import java.util.ArrayList;

/**
 * Created by kellen_home on 2016/11/17.
 */

public class Procedure {
    ArrayList <String> data;

    public Procedure(ArrayList <String> data) {
        this.data = data;
    }

    public void setData(ArrayList<String> data) {
        this.data = data;
    }

    public ArrayList<String> getData() {
        return data;
    }
}
