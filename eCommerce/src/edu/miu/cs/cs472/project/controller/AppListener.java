package edu.miu.cs.cs472.project.controller;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import edu.miu.cs.cs472.project.repository.DataRepository;
public class AppListener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent sce) {
        ServletContext sc = sce.getServletContext();
        DataRepository globalData = new DataRepository();
        sc.setAttribute("data", globalData);
    }
    public void contextDestroyed(ServletContextEvent sce) {

    }
}