public class TrangNguyen {
    private String name;
    private String namsinh;
    private String nammat;
    private String que;
    private String namdotrangnguyen;
    private String doivua;
    private String ghichu = "";

    public TrangNguyen(String name, String namsinhnammat, String que, String namdotrangnguyen, String doivua, String ghichu){
        this.name = name;
        this.que = que;
        this.namdotrangnguyen = namdotrangnguyen;
        this.doivua = doivua;
        if(ghichu.isBlank()) this.ghichu = "không có";
        else this.ghichu = ghichu;
        if(namsinhnammat.isBlank()) {
            this.namsinh = "không rõ";
            this.nammat = "không rõ";
        }
        else{
            String[] s = namsinhnammat.split("-", -1);
            if(s[0].contains("?")) this.namsinh = "không rõ";
            else this.namsinh = s[0];

            if(s[1].contains("?")) this.nammat = "không rõ";
            else this.nammat = s[1];
        }
    }

    public String getName() {
        return name;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public String getNammat() {
        return nammat;
    }

    public String getQue() {
        return que;
    }

    public String getNamdotrangnguyen() {
        return namdotrangnguyen;
    }

    public String getDoivua() {
        return doivua;
    }

    public String getGhichu() {
        return ghichu;
    }
}
