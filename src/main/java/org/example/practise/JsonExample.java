package org.example.practise;

import org.example.objects.ExcludedProducts;
import org.example.objects.Product;
import org.example.objects.Response;

import java.util.List;

public class JsonExample {

    public static Response working(Product product){
        List<ExcludedProducts> excludedProducts = product.getExcludedProducts();

return null;
    }


}
