/*
 * package file;
 * 
 * import java.io.File; import java.io.FileInputStream; import
 * java.io.FileOutputStream; import java.io.InputStream; import
 * java.text.SimpleDateFormat; import java.util.Date;
 * 
 * import org.apache.poi.hssf.usermodel.HSSFRow; import
 * org.apache.poi.hssf.usermodel.HSSFSheet; import
 * org.apache.poi.hssf.usermodel.HSSFWorkbook; import
 * org.apache.poi.xssf.usermodel.XSSFRow; import
 * org.apache.poi.xssf.usermodel.XSSFSheet; import
 * org.apache.poi.xssf.usermodel.XSSFWorkbook;
 * 
 * 
 * public class FileWriting {
 * 
 * public static void main(String[] args) { // TODO Auto-generated method stub
 * 
 * try{ File myFile = new File(
 * "C:\\Users\\prsoni\\eclipse-workspace2\\Collection\\tddextract_06222020_120614.xls"
 * ); InputStream fiss= new FileInputStream(myFile); HSSFWorkbook myWorkBook =
 * new HSSFWorkbook(fiss); HSSFSheet mySheet =
 * myWorkBook.getSheet("tddextract"); HSSFRow row = null; row =
 * mySheet.getRow(0); int colCount = row.getLastCellNum();
 * System.out.println("Column Count :- " + colCount); fiss.close(); int rowCount
 * = mySheet.getLastRowNum() + 1; System.out.println("Row Count :- " +
 * rowCount); String pattern="MM/dd/yyyy hh:mm:ssaa"; String
 * filename="tddextract_06192020_001243.xls"; String count=String.valueOf(560);
 * File file = new
 * File("C:\\Users\\prsoni\\eclipse-workspace2\\Collection\\music.ctl");
 * FileOutputStream fout=new FileOutputStream(file,true); SimpleDateFormat
 * simpleDateFormat = new SimpleDateFormat(pattern);
 * fout.write("\"Remarketing\",\"DealerDirect\",\"".getBytes());
 * fout.write(simpleDateFormat.format(new Date()).getBytes());
 * fout.write("\",\"External\",\"".getBytes());
 * fout.write((filename+"\",").getBytes()); fout.write("\"NA\",".getBytes());
 * fout.write("\"NA\",".getBytes());
 * fout.write("\"Record Count\",\"".getBytes());
 * fout.write((count+"\"").getBytes()); fout.close();
 * System.out.println("success..."); }catch(Exception e){System.out.println(e);}
 * }
 * 
 * }
 */