package com.hsrg.clients;

import com.hsrg.pojo.Result;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

@FeignClient("file")
public interface FileClient {
    @PostMapping(value = "/file/uploadImage",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    Result uploadImage(MultipartFile image);
}
