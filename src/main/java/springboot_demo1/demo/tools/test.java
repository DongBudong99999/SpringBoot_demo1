package springboot_demo1.demo.tools;

public class test {
    public static void main(String[] args){
        ExcelToHTML eth = new ExcelToHTML();
        String filePath = "//Users//dongbudong//Desktop//Tables//test1.xls";
        String str = eth.readExcelToHtml(filePath,
                "/Users/dongbudong/IdeaProjects/webtest/web/excel.html",
                false);

        System.out.println(str);
    }




}
