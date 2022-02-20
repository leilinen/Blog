package com.java.jexl;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.jexl3.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description:
 * @Author: leiline
 * @CreateTime: 2021-11-02
 */
public class JexlSplitTest {

    private static final Logger logger = LoggerFactory.getLogger(JexlSplitTest.class);

    private static JexlEngine jexl = new JexlBuilder().create();

    public static Object execute(JSONObject value, String expression) {
        try {
            JexlContext jc = new MapContext();
            JsonUtil.registerJexl(value, jc);
            JexlScript expr = jexl.createScript(expression);
            return expr.execute(jc);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    public static void main(String[] args) {

        String me = "{\"uniformSocialCreditCode\":\"912201833473514246\",\"telephoneNumber\":\"13100000002\",\"verifyInfoType\":\"R\",\"businessNumber\":\"211102008500CNB00000000222929760\",\"msgVerification\":\"未验短\",\"businessTime\":\"2021-11-02 16:29:13\",\"userId\":\"781f2b78d1154bd8b331bfe811273744\",\"loginResult\":{\"msg\":\"成功\",\"code\":\"200\"},\"certificateNumber\":\"610116198808084398\",\"customerId\":\"100000017930\",\"eventTime\":\"2021-11-02 16:29:13\",\"sliderVerification\":\"未滑块\",\"envData\":{\"appName\":\"拓扑银行\",\"latitude\":\"31.151488\",\"envWifiMac\":\"94:E4:BA:51:63:9B\",\"terminal\":\"android\",\"deviceId\":\"612d4098b14109d9\",\"deviceToken\":\"tak013NQO6CZ3BFUYGPTNAIN5UJKMCXDAKUKPTCVAOLUNV63S6S6C2B2NWKBJ6DIX5AXQK57KYZRDQ7XFPMEU4RDAO36OHMSJXURRMPIEMIA01234567\",\"deviceSysVersion\":\"10\",\"deviceAppVersion\":\"1.0.8\",\"deviceMobileVersion\":\"ELS-AN00\",\"envIp\":\"192.168.4.36\",\"envWifiSsid\":\"Tbank8021x\",\"xForwardedFor\":\"192.168.4.136\",\"longitude\":\"121.483297\"}}";
        String exp = "xForwardedFor.contains(\",\")?xForwardedFor.substring(0,xForwardIp.indexOf(\",\")):xForwardedFor";
        String exp1 = "envData['xForwardedFor'].contains(',') ? envData['xForwardedFor'].substring(0, envData['xForwardedFor'].indexOf(',')):envData['xForwardedFor']";
        String exp2 = "xForwardIp.subString(0, xForwardIp.indexOf(','))";

        String exp3 = "envData['xForwardedFor']!=envData['envIp']";

        System.out.println(execute(JSONObject.parseObject(me), exp3));
    }
}
