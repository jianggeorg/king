package com.company.test;

public enum CardAgentTypeEnum {

    /**
     * 华正
     */
    HZ("HZ", "华正"),
    /**
     * 联想
     */
    LENOVE("LENOVE", "联想"),
    /**
     * 普创天信
     */
    PCTX("PCTX", "普创天信"),
    /**
     * 阿里云
     */
    ALI("ALI", "阿里云"),
    /**
     * 未知
     */
    UNKNOWN("UNKNOWN", "未知");

    private String value;
    private String label;

    CardAgentTypeEnum(String value, String label) {
        this.value = value;
        this.label = label;
    }

    /**
     * 根据枚举值获取枚举类型
     *
     * @param value
     * @return
     */
    public static CardAgentTypeEnum getEnumByValue(String value) {
        if ("".equals(value)) {
            return null;
        }
        for (CardAgentTypeEnum typeEnum : CardAgentTypeEnum.values()) {
            if (value.equals(typeEnum.value)) {
                return typeEnum;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}
