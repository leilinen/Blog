package com.java.rpc.simple;

public class IProductServiceImpl implements IProductService {

    @Override
    public Product getProductById(Integer id) {
        return new Product(id, "手机");
    }

}
