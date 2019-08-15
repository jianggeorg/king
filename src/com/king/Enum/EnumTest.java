package com.king.Enum;

/**
 * Created by JIANGGE on 2019/7/23.
 */
public class EnumTest {
    public enum AcDeviceTypeEnum {
        /**
         * Mambike的E10充换电柜
         */
        DEVICE_CHARGER_CL_E10(330),

        /**
         * 基于国标GB/T32960-2016协议的电动汽车TBOX设备。
         */
        DEVICE_VEHICLE_GB_V1(100),

        /**
         * 基于国标GB/T32960-2016协议修改的V1版的猛犸电动自行车M6.
         */
        DEVICE_VEHICLE_M6_V1(102),

        /**
         * 基于国标GB/T32960-2016协议修改的V1版的猛犸电动自行车M5.
         */
        DEVICE_VEHICLE_M5_V1(103),

        /**
         * 基于国标GB/T32960-2016协议修改的V1版的猛犸电动自行车M8.
         */
        DEVICE_VEHICLE_M8_V1(104),

        /**
         * Amitek公司基于v1版MQTT协议的行车记录仪/后视镜设备。
         */
        DEVICE_RECORDER_AMI_V1(200),

        /**
         * ChargeLink公司基于v1版MQTT协议的充电桩TCU设备。
         */
        DEVICE_CHARGER_CL_V1(300),

        /**
         * ChargeLink公司基于v2版MQTT协议的充电桩TCU设备。
         */
        DEVICE_CHARGER_CL_V2(301),

        /**
         * ChargeLink公司基于x5版MQTT协议的充电桩TCU设备。
         */
        DEVICE_CHARGER_CL_X5(302),

        /**
         * ChargeLink公司基于x5版MQTT协议的充电桩TCU设备。
         */
        DEVICE_CHARGER_CL_X9(303),

        /**
         * ChargeLink公司基于x5版MQTT协议的充电桩TCU设备。
         */
        DEVICE_CHARGER_CL_X10(304),

        /**
         * ChargeLink公司基于x5版MQTT协议的充电桩TCU设备。
         */
        DEVICE_CHARGER_CL_A6(305),

        /**
         * 盛弘TCP协议的充电桩设备
         */
        DEVICE_CHARGER_SINEXCEL(306),

        /**
         * ChargeLink公司基于R6版TCP协议的电动车充电桩设备
         */
        DEVICE_CHARGER_CL_R6(307),

        /**
         * ChargeLink公司基于R8路由器版TCP协议的电动车充电桩路由设备
         */
        DEVICE_CHARGER_CL_R8(308),

        /**
         * ChargeLink公司基于X6P路由器版TCP协议的电动车充电桩路由设备
         */
        DEVICE_CHARGER_CL_X6P(309),

        /**
         * ChargeLink公司基于充电小队长版MQTT协议的电动自行车充电桩设备
         */
        DEVICE_CHARGER_CL_X5X(310),

        /**
         * ChargeLink公司基于X6L路由器版TCP协议的电动车充电桩路由设备。
         */
        DEVICE_CHARGER_CL_X6L(311),

        /**
         * ChargeLink公司基于R9版TCP协议的电动自行车充电桩设备。
         */
        DEVICE_CHARGER_CL_R9(312),

        /**
         * ChargeLink公司基于A10版TCP协议的电动汽车充电桩设备。
         */
        DEVICE_CHARGER_CL_A10(313),

        /**
         * ChargeLink公司基于D10版TCP协议的电动自行车充电桩设备。
         */
        DEVICE_CHARGER_CL_D10(314),

        /**
         * ChargeLink公司基于E8版TCP协议的电动自行车充电桩设备。
         */
        DEVICE_CHARGER_CL_E8(315),

        /**
         * ChargeLink公司基于X10E版TCP协议的电动自行车充电桩设备。
         */
        DEVICE_CHARGER_CL_X10E(316),

        /**
         * ChargeLink公司基于v1版MQTT协议的车位地锁/车位探测器设备。
         */
        DEVICE_PARKING_CL_V1(400),

        /**
         * ChargeLink公司基于v2版MQTT协议的车位地锁/车位探测器设备。
         */
        DEVICE_PARKING_CL_V2(401);

        private int value;

        AcDeviceTypeEnum(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

    }

    public static void main(String[] args){
        AcDeviceTypeEnum deviceType = null;
        Integer accessDeviceType = 401;
        for (AcDeviceTypeEnum acDeviceTypeEnum : AcDeviceTypeEnum.values()) {
            if (accessDeviceType != acDeviceTypeEnum.getValue()) {
                System.out.println("---------------");
                continue;
            }
            System.out.println("=============");
            deviceType = acDeviceTypeEnum;
            break;
        }
    }
}
