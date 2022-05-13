package com.funsamentos.srpintboot.fundamentos.component;

import org.springframework.stereotype.Component;

@Component
public class ComponentTwouImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola mundo des de mi componente 2");
    }
}
