package com.hsrg.clients;

import com.hsrg.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@FeignClient("file")
public interface FileClient {
    @PostMapping("/file/uploadImage")
    Result uploadImage(MultipartFile image);
}
