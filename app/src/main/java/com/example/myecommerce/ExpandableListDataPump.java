package com.example.myecommerce;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();
        HashMap<String,List<String>> images = new HashMap<>();


        List<String> ChinaStore = new ArrayList<String>();
        ChinaStore.add("AliExpress");
        ChinaStore.add("Gearbest");


        List<String> IndianStore = new ArrayList<String>();
        IndianStore.add("Amazon(India)");
        IndianStore.add("FlipKart");


        expandableListDetail.put("China Store", ChinaStore);
        expandableListDetail.put("Indian Store", IndianStore);

        return expandableListDetail;
    }

    public static HashMap<String, List<String>> getImage() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();
        HashMap<String,List<String>> images = new HashMap<>();


        List<String> ChinaStore = new ArrayList<String>();
       // ChinaStore.add("Shipping Time :10-20 days");
        //ChinaStore.add("Gearbest");
        ChinaStore.add("2");
        ChinaStore.add("3");


        List<String> IndianStore = new ArrayList<String>();
        //IndianStore.add("Amazon(India)");
        //IndianStore.add("FlipKart");
        IndianStore.add("0");
        IndianStore.add("1");

        expandableListDetail.put("China Store", ChinaStore);
        expandableListDetail.put("Indian Store", IndianStore);

        return expandableListDetail;
    }
}

