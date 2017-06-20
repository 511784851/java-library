package com.blemobi.library.util;

import org.apache.poi.hssf.usermodel.*;

import javax.servlet.http.HttpServletResponse;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;

/**
 * Description:
 * User: HUNTER.POON
 * Date: 2017/6/19 19:46
 */
public final class ExcelUtils {
    public static void exportExcelWithTitle(String excelName, String title,
                                            List<Map<String, Object>> dataList, List<String> titleList,
                                            List<String> header, HttpServletResponse response){
        OutputStream out = null;
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet sheet = workbook.createSheet();
            for (int i = 0; i < titleList.size(); i++)
            {
                sheet.setColumnWidth(i, String.valueOf(titleList.get(i)).getBytes().length * 2 * 256);
            }
            HSSFRow row = null;

            HSSFCellStyle style = workbook.createCellStyle();
            style.setAlignment((short)2);

            row = sheet.createRow(0);
            //sheet.addMergedRegion(new Region(0, (short)0, 0, (short)(header.size()-1)));
            HSSFCell cell1 = row.createCell((short)0);
            cell1.setCellStyle(style);
            cell1.setCellValue(title);

            row = sheet.createRow(1);

            createTitle(row, titleList);

            Map<String, Object> dMap = null;

            for (int i = 0; i < dataList.size(); i++) {
                dMap = (Map)dataList.get(i);
                row = sheet.createRow(i + 2);
                HSSFCell cell = null;
                int col = 0;

                for (int j = 0; j < header.size(); j++) {
                    cell = row.createCell(col++);
                    cell.setCellValue(
                            dMap.get(header.get(j)) == null ? "--" : dMap.get(header.get(j)).toString());
                }

            }

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            workbook.write(baos);
            byte[] data = baos.toByteArray();
            if (data != null) {
                response.reset();
                response.setContentType("application/x-download;charset=UTF-8");
                response.setHeader("Content-Disposition",
                        "attachment;filename=" + URLEncoder.encode(excelName, "UTF-8"));
                out = new BufferedOutputStream(response.getOutputStream());
                out.write(data);
                out.flush();
                out.close();
            }
        }
        catch (IOException e) {
            e.printStackTrace();

            if (out != null)
                try {
                    out.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
        } finally {
            if (out != null)
                try {
                    out.close();
                } catch (IOException e) {
                }
        }
    }

    public static void createTitle(HSSFRow row, List<String> pros){
        HSSFCell cell = null;
        for (int i = 0; i < pros.size(); i++) {
            cell = row.createCell(i);
            cell.setCellType(1);
            cell.setCellValue((String)pros.get(i));
        }
    }
}
