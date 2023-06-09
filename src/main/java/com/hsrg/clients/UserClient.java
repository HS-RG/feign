package com.hsrg.clients;

import com.hsrg.pojo.Result;
import com.hsrg.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@FeignClient("user")
public interface UserClient {
    @PostMapping("/initOneUser")
    void initOneUser(@RequestBody User user);

    @PostMapping("/deleteOneUser")
    Result deleteOneUser(@RequestBody User user);

    @PostMapping("/user/selectByUserId")
    Result selectByUserId(@RequestBody User user);
}
