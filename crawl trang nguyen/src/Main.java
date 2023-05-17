import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.util.ArrayList;

public class Main {
    private static ArrayList<TrangNguyen> tnArraylist = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        String link = "https://vi.wikipedia.org/wiki/Danh_s%C3%A1ch_Tr%E1%BA%A1ng_nguy%C3%AAn_Vi%E1%BB%87t_Nam";
        Document doc = Jsoup.connect(link).get();
        Elements rows = doc.select("table.wikitable.sortable").select("tbody").select("tr");
        add(rows);
        printlist();

    }

    public static void add(Elements rows){
        for(int i=0; i < rows.size(); i++){
            Element row = rows.get(i);
            Elements columns = row.select("td");
            if(columns.size() < 7) continue;
            TrangNguyen tn = new TrangNguyen(
                    columns.get(1).text(),
                    columns.get(2).text(),
                    columns.get(3).text(),
                    columns.get(4).text(),
                    columns.get(5).text(),
                    columns.get(6).text());
            tnArraylist.add(tn);
        }
    }

    public static void printlist(){
        int i=0;
        for(TrangNguyen p : tnArraylist){
            i++;
            System.out.println("Trạng nguyên thứ " + i);
            System.out.println("Tên: " + p.getName());
            System.out.println("Năm sinh: " + p.getNamsinh());
            System.out.println("Năm mất: " + p.getNammat());
            System.out.println("Quê quán: " + p.getQue());
            System.out.println("Năm đỗ trạng nguyên: " + p.getNamdotrangnguyen());
            System.out.println("Đời vua: " + p.getDoivua());
            System.out.println("Ghi chú: " + p.getGhichu());
            System.out.println("================================");
        }
    }

}