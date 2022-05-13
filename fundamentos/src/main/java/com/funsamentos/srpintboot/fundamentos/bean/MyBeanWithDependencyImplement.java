package com.funsamentos.srpintboot.fundamentos.bean;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    private MyOperation myOperation;

    public MyBeanWithDependencyImplement(MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependendcy() {
        int number = 1;
        System.out.println(myOperation.sum(number));
        System.out.println("Hola des de la implementacion de un bean con dependencia " + myOperation.sum(number));
    }
}
