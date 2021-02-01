package com.sample;
import com.sample.model.CakeType;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet(
        name = "selectcakeservlet",
        urlPatterns = "/SelectCake"
)

public class SelectCakeServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String cakeType = req.getParameter("Type");

        CakeService cakeService = new CakeService();
        CakeType l = CakeType.valueOf(cakeType);

        List cakeBrands = cakeService.getAvailableBrands(l);

        req.setAttribute("brands", cakeBrands);
        RequestDispatcher view = req.getRequestDispatcher("result.jsp");
        view.forward(req, resp);

    }
}
