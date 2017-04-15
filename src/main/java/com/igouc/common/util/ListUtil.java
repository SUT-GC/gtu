package com.igouc.common.util;

import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

public class ListUtil {

    public static <T> List<List<T>> splitList(List<T> list, int subListSize) {
        List<List<T>> r = new ArrayList<List<T>>();
        if (CollectionUtils.isEmpty(list) || subListSize < 0) {
            r.add(list);
            return r;
        }
        int maxSize = subListSize;
        int subNum = list.size() / maxSize + 1;
        int endIndex = 0;
        for (int i = 0; i < subNum; i++) {
            if (i * maxSize < list.size()) {
                List<T> subList = new ArrayList<T>(maxSize);
                endIndex = (i + 1) * maxSize;
                endIndex = endIndex < list.size() ? endIndex : (list.size());
                subList.addAll(list.subList(i * maxSize, endIndex));

                r.add(subList);
            }
        }

        return r;
    }

    public static boolean isEmptyList(List list) {
        return list == null || list.isEmpty() ? Boolean.TRUE : Boolean.FALSE;
    }

    public static boolean isNotEmptyList(List list) {
        return !isEmptyList(list);
    }
}