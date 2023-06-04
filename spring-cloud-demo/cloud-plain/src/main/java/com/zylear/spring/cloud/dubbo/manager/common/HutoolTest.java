package com.zylear.spring.cloud.dubbo.manager.common;

import cn.hutool.core.annotation.AnnotationUtil;
import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.util.ReUtil;
import cn.hutool.core.util.ReflectUtil;
import cn.hutool.crypto.KeyUtil;
import cn.hutool.crypto.SecureUtil;
import cn.hutool.crypto.asymmetric.RSA;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import cn.hutool.poi.excel.ExcelUtil;
import cn.hutool.poi.excel.ExcelWriter;
import com.arronlong.httpclientutil.HttpClientUtil;
import com.arronlong.httpclientutil.common.HttpConfig;
import com.arronlong.httpclientutil.exception.HttpProcessException;
import org.apache.commons.lang3.AnnotationUtils;
import org.apache.http.Header;
import org.springframework.beans.BeanUtils;
import org.springframework.cglib.core.ReflectUtils;

import java.beans.PropertyDescriptor;

/**
 * @author xiezongyu
 * @date 2021/1/20
 */
public class HutoolTest {

    public static void main(String[] args) throws HttpProcessException {


//        RSA rsa = SecureUtil.rsa("a", "sd");
        HttpConfig httpConfig = HttpConfig.custom().headers(new Header[]{null, null});
        HttpClientUtil.post(httpConfig);

        SecureUtil.generatePrivateKey("", (byte[])null);
        ExcelWriter writer = ExcelUtil.getWriter();

        PropertyDescriptor[] propertyDescriptors = BeanUtils.getPropertyDescriptors(String.class);
//        AnnotationUtil.
    }

}
