package com.sd.oc.serviceproxy;

import com.sd.oc.serviceproxy.generated.bookAPI.BookAPI;
import com.sd.oc.serviceproxy.generated.bookAPI.BookServiceAPI;
import com.sd.oc.serviceproxy.generated.borrowingAPI.BorrowingAPI;
import com.sd.oc.serviceproxy.generated.borrowingAPI.BorrowingServiceAPI;
import com.sd.oc.serviceproxy.generated.userAPI.UserAPI;
import com.sd.oc.serviceproxy.generated.userAPI.UserServiceAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.sd.oc.serviceproxy")
public class ConfigurationServiceAPI {

    @Bean
    public BookServiceAPI bookServiceAPI(){
        BookAPI bookAPI=new BookAPI();
        return bookAPI.getBookServiceAPIPort();
    }

    @Bean
    public UserServiceAPI userServiceAPI(){
        UserAPI userAPI=new UserAPI();
        return userAPI.getUserServiceAPIPort();
    }

    @Bean
    public BorrowingServiceAPI borrowingServiceAPI(){
        BorrowingAPI borrowingAPI=new BorrowingAPI();
        return borrowingAPI.getBorrowingServiceAPIPort();
    }
}
