package com.mycompany.web1.listener;

import com.mycompany.web1.entity.User;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;

public class SecondListener implements ServletContextListener {
    //Всё происходящие в этом методе будет выполняться перед запуском приложения
    //ServletContext - хранилище общего для всего приложения
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        String username = sce.getServletContext().getInitParameter("username");
        String password = sce.getServletContext().getInitParameter("password");


        User user = new User("roma", 18);

        //Добавили в наш мешок user
        sce.getServletContext().setAttribute("user", user);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        ServletContextListener.super.contextDestroyed(sce);
    }
}
