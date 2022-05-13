package com.funsamentos.srpintboot.fundamentos.configuration;

import com.funsamentos.srpintboot.fundamentos.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBean2Implement();
    }
    @Bean
    public MyOperation beanOperationSum(){
        return new MyOperationImplement();
    }
    @Bean
    public MyBeanWithDependency beanOperationSumWhithDependendcy(MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
