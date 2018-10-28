package config;

import com.alibaba.fastjson.util.TypeUtils;

public class TencentImConfig {
    private static String sdkappid = "1400154520";
    private static String identifier="storm";
    private static String usersig="eJxlj9FOgzAUhu95CsKtRttCwZl4gcp0zKkIGN1N00FxXTcopeLU*O5OXGITz*33-ec-59OybdvJbtIj WhTNa62JfpfMsU9tBziHf1BKXhKqiavKf5BtJVeM0EozNUCIMUYAmA4vWa15xfdGpxu1MXBXCjJ0-OY9 ACD2djtMhb8McBblF5OoXzVjeNJO8nGSifVjvFw01Vvin6sRWCdTedddP7sHbFtEccijkCPcinB5tZjf ZsXDhy-CMJ6mfaCp6J7u57lIj2Fbri4pLM6MSs03bP*QB3yMglFg0J6pjjf1IKDdvRC54Gcc68v6BlnaXXk_";
    private static String host="console.tim.qq.com";
    private static String ver="v4";
    private static boolean async =true;

    public static String buildRequestUrl(String serviceName,String command){
        return "https://"+host+"/"+ver+"/"+serviceName+"/"+command
                +"?sdkappid="+sdkappid+"&identifier="+identifier+"&usersig="+usersig
                +"&random=99999999&contenttype=json";
    }
    public static void init(){
        TypeUtils.compatibleWithJavaBean=true;
    }
    public static String getSdkappid() {
        return sdkappid;
    }

    public static String getIdentifier() {
        return identifier;
    }

    public static String getUsersig() {
        return usersig;
    }

    public static String getHost() {
        return host;
    }

    public static String getVer() {
        return ver;
    }

    public static boolean isAsync() {
        return async;
    }

}
