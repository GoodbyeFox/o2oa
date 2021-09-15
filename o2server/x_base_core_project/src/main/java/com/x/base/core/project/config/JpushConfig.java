package com.x.base.core.project.config;

import com.x.base.core.project.annotation.FieldDescribe;
import org.apache.commons.lang3.BooleanUtils;

public class JpushConfig extends ConfigObject {

    private static final String O2_app_key_default = "9aca7cc20fe0cc987cd913ca";
    private static final String O2_master_secret_default = "96ee7e2e0daffd51bac57815";


    public static JpushConfig defaultInstance() {
        return new JpushConfig();
    }
    public JpushConfig() {
        this.enable = true;
        this.appKey = O2_app_key_default;
        this.masterSecret = O2_master_secret_default;
        this.huaweiPushEnable = false;
        this.huaweiPushConfig = HuaweiPushConfig.defaultInstance();
    }


    @FieldDescribe("是否启用.")
    private Boolean enable;
    @FieldDescribe("极光推送应用的AppKey")
    private String appKey;
    @FieldDescribe("极光推送应用的Master Secret")
    private String masterSecret;
    @FieldDescribe("是否开启华为推送")
    private Boolean huaweiPushEnable;
    @FieldDescribe("华为推送的配置")
    private HuaweiPushConfig huaweiPushConfig;



    public Boolean getEnable() {
        return BooleanUtils.isTrue(this.enable);
    }

    public void setEnable(Boolean enable) {
        this.enable = enable;
    }

    public String getAppKey() {
        return appKey;
    }

    public void setAppKey(String appKey) {
        this.appKey = appKey;
    }

    public String getMasterSecret() {
        return masterSecret;
    }

    public void setMasterSecret(String masterSecret) {
        this.masterSecret = masterSecret;
    }

    public Boolean getHuaweiPushEnable() {
        return huaweiPushEnable;
    }

    public void setHuaweiPushEnable(Boolean huaweiPushEnable) {
        this.huaweiPushEnable = huaweiPushEnable;
    }

    public HuaweiPushConfig getHuaweiPushConfig() {
        return huaweiPushConfig;
    }

    public void setHuaweiPushConfig(HuaweiPushConfig huaweiPushConfig) {
        this.huaweiPushConfig = huaweiPushConfig;
    }
}
