import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;

public class Cart {
    ArrayList<King> kingArrayList = new ArrayList<>();
    public void add(Elements tableRows){
        for (int i = 1; i < tableRows.size(); i++) {
            Element row = tableRows.get(i);
            Elements columns = row.select("td");
            if (columns.size() < 10) continue;

            String img = columns.get(0).select("img").attr("src");
            String name = columns.get(1).text();
            String mieuhieu = columns.get(2).text();
            String thuyhieu = columns.get(3).text();
            String nienhieu = columns.get(4).text();
            String tenhuy = columns.get(5).text();
            String thethu = columns.get(6).text();
            String start = columns.get(7).text();
            String middle = columns.get(8).text();
            String end = columns.get(9).text();

            King king = new King(img, name, mieuhieu, thuyhieu, nienhieu, tenhuy, thethu, start, middle, end);
            kingArrayList.add(king);
        }
    }

    public void printlist(){
        int i=0;
        for (King king : kingArrayList) {
            i++;
            System.out.println("Người thứ " + i);
            System.out.println("Ảnh: " + king.getImg());
            System.out.println("Tên: " + king.getName());
            System.out.println("Miếu hiệu: " + king.getMieuhieu());
            // Print other fields as needed
            System.out.println("Thụy hiệu: " + king.getThuyhieu());
            System.out.println("Niên hiệu: " + king.getNienhieu());
            System.out.println("Tên húy: " + king.getTenhuy());
            System.out.println("Thế thứ: " + king.getThethu());
            System.out.println("Năm lên ngôi: " + king.getMieuhieu());
            System.out.println("Middle: " + king.getMiddle());
            System.out.println("Năm thoái vị: " + king.getEnd());
            System.out.println();
        }
    }

    public void printName(){
        int i=0;
        for (King king : kingArrayList) {
            i++;
            System.out.println(i + ". " + king.getName());
            System.out.println();
        }
    }
}
