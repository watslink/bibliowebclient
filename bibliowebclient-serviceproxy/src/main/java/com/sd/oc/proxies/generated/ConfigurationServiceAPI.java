package com.sd.oc.proxies.generated;

import com.sd.oc.proxies.generated.bookAPI.BookAPI;
import com.sd.oc.proxies.generated.bookAPI.BookServiceAPI;
import com.sd.oc.proxies.generated.borrowingAPI.BorrowingAPI;
import com.sd.oc.proxies.generated.borrowingAPI.BorrowingServiceAPI;
import com.sd.oc.proxies.generated.userAPI.UserAPI;
import com.sd.oc.proxies.generated.userAPI.UserServiceAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationServiceAPI {

    @Bean
    public BookServiceAPI createBeanBookServiceAPI(){
        BookAPI bookAPI=new BookAPI();
        return bookAPI.getBookServiceAPIPort();
    }

    @Bean
    public UserServiceAPI createBeanUserServiceAPI(){
        UserAPI userAPI=new UserAPI();
        return userAPI.getUserServiceAPIPort();
    }

    @Bean
    public BorrowingServiceAPI createBeanBorrowingServiceAPI(){
        BorrowingAPI borrowingAPI=new BorrowingAPI();
        return borrowingAPI.getBorrowingServiceAPIPort();
    }
}
