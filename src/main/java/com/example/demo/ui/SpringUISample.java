package com.example.demo.ui;


import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

@SpringUI(path="/hello")
public class SpringUISample extends UI {

    @Override
    protected void init(VaadinRequest request) {
	    setContent(new Label("Labeling can be dangerous"));
    }
}
