package controller;

import DAO.DBQlSinh_vien;
import DAO.DBQl_muon;
import Model.Muon_sach;
import Model.Sinh_vien;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "XemchitietServlet", urlPatterns = {"/xemchitiet"})
public class XemchitietServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if(request.getParameter("xem")!=null){
            request.getSession().setAttribute("xem", request.getParameter("xem"));
            DBQlSinh_vien sinh_vien=new DBQlSinh_vien();
            DBQl_muon dbQl_muon=new DBQl_muon();
            List<Muon_sach> list=dbQl_muon.getDsmuon("1");
            request.setAttribute("muonList", list);
            request.getRequestDispatcher("ds_muon.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
