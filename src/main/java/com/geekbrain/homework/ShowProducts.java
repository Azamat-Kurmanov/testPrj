package com.geekbrain.homework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ShowProducts extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ShowProducts.class);

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Product> productList = getProductList();
        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().printf("<html><body>");
        for (int i = 0; i < productList.size(); i++) {
            resp.getWriter().printf("<h3>Id: "+productList.get(i).getId()+" Title: "+productList.get(i).getTitle()+" Cost: "+productList.get(i).getCost()+" </h3>");
        }
        resp.getWriter().printf("</html></body>");
        resp.getWriter().close();
    }

    @Override
    public void init()throws ServletException{
        logger.debug("Init");
    }

    private List<Product> getProductList(){
        List<Product> productList = new ArrayList<>();
        productList.add(new Product(1, "Apple", 200));
        productList.add(new Product(1, "Orange", 200));
        productList.add(new Product(1, "Bannana", 200));
        productList.add(new Product(1, "Grape", 200));
        productList.add(new Product(1, "Pineapple", 200));
        productList.add(new Product(1, "Melon", 200));
        productList.add(new Product(1, "Watermelon", 200));
        productList.add(new Product(1, "Peach", 200));
        productList.add(new Product(1, "Apricot", 200));
        productList.add(new Product(1, "Mandarin", 200));
        productList.add(new Product(1, "Pear", 200));
        return productList;
    }
}
