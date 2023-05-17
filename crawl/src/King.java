public class King {
    private String img;
    private String name;

    private String mieuhieu;
    private String thuyhieu;
    private String nienhieu;
    private String tenhuy;
    private String thethu;
    private String start;
    private String middle;
    private String end;

    public King(String img, String name, String mieuhieu, String thuyhieu, String nienhieu, String tenhuy, String thethu, String start, String middle, String end) {
        img =
        this.img = img;
        this.name = clearName(name);
        this.mieuhieu = mieuhieu;
        this.thuyhieu = thuyhieu;
        this.nienhieu = nienhieu;
        this.tenhuy = tenhuy;
        this.thethu = thethu;
        this.start = start;
        this.middle = middle;
        this.end = end;
    }

    public String clearImg(String img){
        if(img.equalsIgnoreCase("")) return "không có";
        return null;
    }

    public String clearName(String name){
        int index = name.indexOf("[");
        if(index < 0) return name;
        else return name.substring(0, index);
    }
//    public void clearImg(String img){
//
//    }
//    public void clearImg(String img){
//
//    }
//    public void clearImg(String img){
//
//    }
//    public void clearImg(String img){
//
//    }

    public String getName() {
        return name;
    }

    public String getMieuhieu() {
        return mieuhieu;
    }

    public String getImg() {
        return img;
    }

    public String getThuyhieu() {
        return thuyhieu;
    }

    public String getNienhieu() {
        return nienhieu;
    }

    public String getTenhuy() {
        return tenhuy;
    }

    public String getThethu() {
        return thethu;
    }

    public String getStart() {
        return start;
    }

    public String getMiddle() {
        return middle;
    }

    public String getEnd() {
        return end;
    }
}
