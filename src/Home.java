public class Home {
    private String name;
    private String address;

    public Home(String name, String address){
        this.name = name;
        this.address = address;
    }
    public String getName(){
        return name;
    }

    public String getAddress(){
        return address;
    }
}