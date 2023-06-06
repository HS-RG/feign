package com.hsrg.clients;

import com.hsrg.pojo.Auth;
import com.hsrg.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient("auth")
public interface AuthClient {
    @PostMapping("/auth/queryIsAdmin")
    Result queryIsAdmin(@RequestBody Auth auth);
}
