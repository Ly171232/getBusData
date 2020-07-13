package ly.test.com.pojo;

public class GongJiao {
    private String name;
    private String Lat;
    private String Lng;
    private String line;
    private String time;
    private String namese;
    private String company;

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNamese() {
        return namese;
    }

    public void setNamese(String namese) {
        this.namese = namese;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLat() {
        return Lat;
    }

    public void setLat(String lat) {
        Lat = lat;
    }

    public String getLng() {
        return Lng;
    }

    public void setLng(String lng) {
        Lng = lng;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    @Override
    public String toString() {
        return "GongJiao{" +
                "name='" + name + '\'' +
                ", Lat='" + Lat + '\'' +
                ", Lng='" + Lng + '\'' +
                ", line='" + line + '\'' +
                '}';
    }

    public GongJiao() {
    }

    public GongJiao(String name, String lat, String lng, String line) {
        this.name = name;
        Lat = lat;
        Lng = lng;
        this.line = line;
    }
}
