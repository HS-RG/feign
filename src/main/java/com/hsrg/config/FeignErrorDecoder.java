package com.hsrg.config;

import com.hsrg.exception.MyException;
import feign.Response;
import feign.Util;
import feign.codec.ErrorDecoder;
import net.sf.json.JSONException;
import net.sf.json.JSONObject;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class FeignErrorDecoder implements ErrorDecoder {

  @Override
  public Exception decode(final String methodKey, final Response response) {
    try {
      String message = Util.toString(response.body().asReader());
      try {
        JSONObject jsonObject = JSONObject.fromObject(message);
        // 包装成自己自定义的异常，这里建议根据自己的代码改
        return new MyException(jsonObject.getString("msg"), jsonObject.getInt("code"));
      } catch (JSONException e) {
        e.printStackTrace();
      }

    } catch (IOException ignored) {
    }
    return decode(methodKey, response);
  }
}
