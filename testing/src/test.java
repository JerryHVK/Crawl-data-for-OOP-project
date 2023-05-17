import java.io.IOException;
import java.nio.charset.Charset;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class test {
    public static void main(String[] args) throws IOException {
        String link = "https://vi.wikipedia.org/wiki/Vua_Vi%E1%BB%87t_Nam";
        Document doc = Jsoup.connect(link).get();
        Elements vua = doc.select("table[cellpadding=0]").select(
                "tbody").select("tr").select("td");
        Element t = doc.body();
        Charset c = t.charset();
    }
}



//import java.io.IOException;
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        ArrayList<King> kingArrayList = new ArrayList<>(200);
//
//        String link = "https://vi.wikipedia.org/wiki/Vua_Vi%E1%BB%87t_Nam";
//        Document doc = Jsoup.connect(link).get();
////        Elements table = doc.select("tr[style=height:50px;]").select("td").select("b");
////        int i=0;
////        for(Element p : table) {
////            i++;
////            System.out.println(i + p.text());
////            System.out.println();
////        }
//        Elements table1 = doc.select("table[cellspacing=0][style=\"width:100%; font-size:90%; text-align:center; border:1px solid lavender;\"]").select("tr");
        Elements table2 = doc.select("table[cellpadding=\"0\"][style=\"width:100%; font-size:90%; text-align:center; border:lavender;\"]").select("tr");
//
//        //.select("tbody").select("tr").select("td");
//
////        table[cellspacing=0 style=width:100%; font-size:90%; text-align:center; border:1px solid lavender]
//
//
////        Elements mieuhieu = doc.select("table[cellpadding=0]").select(
////                "tbody").select("tr").select("td").select("b").select("a[title]");
////
////        Elements thuyhieu = doc.select("table[cellpadding=0]").select(
////                "tbody").select("tr").select("td").select("b").select("a[title]");
////
////        Elements nienhieu = doc.select("table[cellpadding=0]").select(
////                "tbody").select("tr").select("td").select("b").select("a[title]");
////
////        Elements tenhuy = doc.select("table[cellpadding=0]").select(
////                "tbody").select("tr").select("td").select("b").select("a[title]");
////
////        Elements trivi = doc.select("table[cellpadding=0]").select(
////                "tbody").select("tr").select("td").select("b").select("a[title]");
//
////        int i=0;
////        for(Element p : table1) {
////            i++;
////            System.out.println(i + p.text());
////            System.out.println();
////        }
////        for(Element k : table2) {
////            i++;
////            System.out.println(i + k.text());
////            System.out.println();
////        }
////        System.out.println(i);
//        System.out.println(table1.get(48).toString());
//    }
//
//
//
//}











-------





//import java.io.IOException;
//import java.util.ArrayList;
//
//import org.jsoup.Jsoup;
//import org.jsoup.nodes.Document;
//import org.jsoup.nodes.Element;
//import org.jsoup.select.Elements;
//
//public class Main {
//    public static void main(String[] args) throws IOException {
//        String link = "https://vi.wikipedia.org/wiki/Vua_Vi%E1%BB%87t_Nam";
//        Document doc = Jsoup.connect(link).get();
//
//        Elements tableRows = doc.select("table.wikitable tr");
//
//        int i=0;
//        for(Element p : tableRows){
//            i++;
//        }
//        System.out.println(i);
//
//
//            Element row = tableRows.get(7);
//            System.out.println(row.text());
//            Elements columns = row.select("td");
//            for(Element p : columns){
//                System.out.println(p.text());
//            }
//
//    }
//}
