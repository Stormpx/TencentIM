package core;

import org.apache.commons.configuration.Configuration;
import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.apache.commons.lang3.RandomUtils;

public class TIMConfig {
    private static String sdkappid ;
    private static String identifier;
    private static String usersig;
    private static String host="console.tim.qq.com";
    private static String ver="v4";
    private static boolean async =true;
    private static Configuration configs;

    public static String buildRequestUrl(String serviceName,String command){
        return "https://"+host+"/"+ver+"/"+serviceName+"/"+command
                +"?sdkappid="+sdkappid+"&identifier="+identifier+"&usersig="+usersig
                +"&random="+RandomUtils.nextInt()+"&contenttype=json";
    }

    public synchronized static void init(String filePath){
        if (configs != null) {
            return;
        }

        try {
            configs = new PropertiesConfiguration(filePath);
        } catch (ConfigurationException e) {
            e.printStackTrace();
        }

        if (configs == null) {
            throw new IllegalStateException("can`t find file by path:" + filePath);
        }
        sdkappid=configs.getString("sdkappid");
        identifier=configs.getString("identifier");
        usersig=configs.getString("usersig");

        host=configs.getString("host");
        ver=configs.getString("ver");
        async=configs.getBoolean("async");
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

    public static void setSdkappid(String sdkappid) {
        TIMConfig.sdkappid = sdkappid;
    }

    public static void setIdentifier(String identifier) {
        TIMConfig.identifier = identifier;
    }

    public static void setUsersig(String usersig) {
        TIMConfig.usersig = usersig;
    }

    public static void setHost(String host) {
        TIMConfig.host = host;
    }

    public static void setVer(String ver) {
        TIMConfig.ver = ver;
    }

    public static void setAsync(boolean async) {
        TIMConfig.async = async;
    }

    public static void setConfigs(Configuration configs) {
        TIMConfig.configs = configs;
    }
}
