package com.kraftech.pages;

import com.kraftech.utilities.ExcelUtil;

import java.util.List;
import java.util.Map;

public class TestingExcel {
    public static void main(String[] args) {
        ExcelUtil excelUtil=new ExcelUtil("src/test/resources/KT_B4_DDF_test (1).xlsx","QA 1");
        List<Map<String, String>> dataList = excelUtil.getDataList();
        System.out.println(dataList);
        System.out.println(dataList.get(2).get("job"));
        System.out.println(dataList.get(3).get("job"));
        System.out.println(excelUtil.getCellData(3, 3));
        System.out.println(dataList.get(4).get("name"));
        System.out.println(dataList.get(3).get("username"));

    }
}
