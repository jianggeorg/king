package com.company;

import java.lang.reflect.Field;


public class JudgeObjectFieldsIsEmpty {

    public static void main(String[] args){

    }

    public boolean checkObjFieldIsNull(Object obj) throws IllegalAccessException {
        boolean flag = false;
        for (Field f : obj.getClass().getDeclaredFields()) {
            f.setAccessible(true);

            if (f.get(obj) == null || f.get(obj).equals("")) {
                flag = true;
                return flag;
            }
        }
        return flag;
    }
}
