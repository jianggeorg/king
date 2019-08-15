package com.company.test;

public enum CardStatusEnum {

    NOT_ACTIVE(0, "待激活"),
    TEST(1, "测试期"),
    SILENT(2, "沉默期"),
    USING(3, "正使用"),
    STOP(4, "已停机"),
    CANCEL(5, "预约销户"),
    NOT_SET(6, "未设置"),
    ;

    private int code;
    private String desc;


    CardStatusEnum(int code, String desc) {
        this.code = code;
        this.desc = desc;
    }

    public static String getDescByCode(int code) {
        for (CardStatusEnum cardStatusEnum : CardStatusEnum.values()) {
            if (code == cardStatusEnum.getCode()) {
                return cardStatusEnum.getDesc();
            }
        }
        return null;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }


}