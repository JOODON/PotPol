class Product{
    public int prdNo;
    public String prdName;
    public int prdPrice;
    public int prdYear;
    public String prdMaker;

    Product(int No, String Name, int Price, int Year, String Maker){
        prdNo = No;
        prdName = Name;
        prdPrice = Price;
        prdYear = Year;
        prdMaker = Maker;
    }

    void show(){
        System.out.printf("%03d\t\t"+prdName+"\t"+prdPrice+"\t"+prdYear+"\t"+prdMaker+"\n",prdNo);
    }

}
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Product p1 = new Product(001, "노트북", 1200000, 2021, "삼성");
        Product p2 = new Product(002, "모니터", 300000, 2021, "LG");
        Product p3 = new Product(003, "마우스", 30000, 2020, "로지텍");
        p1.show();
        p2.show();
        p3.show();
    }
}

