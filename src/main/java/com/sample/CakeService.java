package com.sample;
import com.sample.model.CakeType;

import java.util.ArrayList;
import java.util.List;

public class CakeService {
    public List getAvailableBrands(CakeType type){

        List brands = new ArrayList();

        if(type.equals(CakeType.CAKE)){
            brands.add("Whoopie pie");
            brands.add(("5000tg - kg"));

        }else if(type.equals(CakeType.PIE)){
            brands.add("Шарлотка");
            brands.add("2600 tg - kg");

        }else if(type.equals(CakeType.CUPCAKES)){
            brands.add("Кексы с шоколадной крошкой");

        }else {
            brands.add("No  Available");
        }
        return brands;
    }
}
