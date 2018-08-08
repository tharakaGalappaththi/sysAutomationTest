package com.sysco.auto_test.functions;

import com.sysco.auto_test.pages.ProductCategoryPage;

public class ProductCategory {
    public static ProductCategoryPage productCategoryPage = new ProductCategoryPage();

    public static void selectProductRumUpAddToCart(){
        productCategoryPage.clickOnViewMore();
        productCategoryPage.clickAddToCart();
    }

}
