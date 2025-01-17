package com.edu.qnu.major.global;

import java.util.ArrayList;
import java.util.List;

import com.edu.qnu.major.model.Product;

public class GlobalData {
    //tao bien toan cuc
    public static List<Product> cart;

    static {
        cart = new ArrayList<>();
    }

}
