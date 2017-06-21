package com.blemobi.library.util;

import org.apache.poi.hssf.usermodel.*;

import java.io.*;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * User: HUNTER.POON
 * Date: 2017/6/19 19:46
 */
public final class ExcelUtils {
    public static ByteArrayInputStream exportExcelWithTitle(String title,
                                                             List<Map<String, Object>> dataList, List<String> titleList,
                                                             List<String> header) {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ByteArrayInputStream bis = null;
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            for (int i = 0; i < titleList.size(); i++) {
                sheet.setColumnWidth(i, String.valueOf(titleList.get(i)).getBytes().length * 2 * 256);
            }
            HSSFRow row = null;

            HSSFCellStyle style = workbook.createCellStyle();
            style.setAlignment((short) 2);

            row = sheet.createRow(0);
            HSSFCell cell1 = row.createCell((short) 0);
            cell1.setCellStyle(style);
            cell1.setCellValue(title);
            row = sheet.createRow(1);
            createTitle(row, titleList);
            if(dataList != null && !dataList.isEmpty()) {
                Map<String, Object> dMap = null;
                for (int i = 0; i < dataList.size(); i++) {
                    dMap = dataList.get(i);
                    row = sheet.createRow(i + 2);
                    HSSFCell cell = null;
                    int col = 0;
                    for (int j = 0; j < header.size(); j++) {
                        cell = row.createCell(col++);
                        cell.setCellValue(
                                dMap.get(header.get(j)) == null ? "-" : dMap.get(header.get(j)).toString());
                    }
                }
            }
            workbook.write(baos);
            byte[] bytes = baos.toByteArray();
            bis = new ByteArrayInputStream(bytes);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
        }
        return bis;
    }

    public static void createTitle(HSSFRow row, List<String> pros) {
        HSSFCell cell = null;
        for (int i = 0; i < pros.size(); i++) {
            cell = row.createCell(i);
            cell.setCellType(1);
            cell.setCellValue((String) pros.get(i));
        }
    }
}
