package com.igouc.common.util;


public class MagicNum {
    public static final Integer ZERO = 0;
    public static final Integer ONE = 1;

    public static boolean greaterThanZero(Long num) {
        if (num == null) {
            return Boolean.FALSE;
        }

        return num.longValue() > ZERO.longValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean greaterThanZero(Integer num) {
        if (num == null) {
            return Boolean.FALSE;
        }

        return greaterThanZero(num.longValue());
    }

    public static boolean equalsZero(Long num) {
        if (num == null) {
            return Boolean.TRUE;
        }

        return num.longValue() == ZERO.longValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean notEqualsZero(Long num) {
        if (num == null) {
            return Boolean.FALSE;
        }

        return num.longValue() != ZERO.longValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean lessThanZero(Long num) {
        if (num == null) {
            return Boolean.FALSE;
        }

        return num.longValue() < ZERO.longValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean lessThanZero(Integer num) {
        if (num == null) {
            return Boolean.FALSE;
        }

        return lessThanZero(num.longValue());
    }

    public static boolean lessThanAndEqualsZero(Integer num) {
        if (num == null) {
            return Boolean.TRUE;
        }

        return lessThanZero(num.longValue()) || equalsZero(num.longValue());
    }

    public static boolean equalsOne(Long num) {
        if (num == null) {
            return Boolean.FALSE;
        }

        return num.longValue() == ONE.longValue() ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean equalsOne(Integer num){
        if (num == null) {
            return Boolean.FALSE;
        }

        return equalsOne(num.longValue());
    }

    public static boolean equalsOne(Short num){
        if (num == null) {
            return Boolean.FALSE;
        }

        return equalsOne(num.longValue());
    }
}