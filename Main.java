interface IData{
    void show();//public
}
class DataManager implements IData{
    public void show(){ //default
        System.out.println("Show Data aaaa");
    }
}
public class Main{
    public static void main(String[] args){
        DataManager dm=new  DataManager();
        dm.show();
    }
}
