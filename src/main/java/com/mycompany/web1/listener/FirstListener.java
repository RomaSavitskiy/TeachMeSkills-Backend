package com.mycompany.web1.listener;


import jakarta.servlet.http.HttpSessionAttributeListener;
import jakarta.servlet.http.HttpSessionBindingEvent;

public class FirstListener implements HttpSessionAttributeListener {
    @Override
    public void attributeAdded(HttpSessionBindingEvent event) {
       // HttpSessionAttributeListener.super.attributeAdded(event);
        System.out.println("No added the following attribute: + " + event.getName() + " with value" + event.getValue());
    }

    @Override
    public void attributeRemoved(HttpSessionBindingEvent event) {
       // HttpSessionAttributeListener.super.attributeRemoved(event);
        System.out.println("No removed the following attribute: + " + event.getName() + " with value" + event.getValue());
    }

    @Override
    public void attributeReplaced(HttpSessionBindingEvent event) {
       // HttpSessionAttributeListener.super.attributeReplaced(event);
        System.out.println("No replaced the following attribute: + " + event.getName() + " with value" + event.getValue());
    }
}
