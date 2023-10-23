public class product{
    private String name,price,cant,id;

    public product(){
        name="";
        price="";
        cant="";
        id="";
    }

    public void setName(String name){
        this.name=name;
    }
     public void setPrice(String price){
        this.price=price;
    }
     public void setCant(String cant){
        this.cant=cant;
    }
     public void setId(String id){
        this.id=id;
    }
    public String GetName(){
        return name;
    }
    public String GetPrice(){
        return price;
    }
    public String GetId(){
        return id;
    }
    public String GetCant(){
        return cant;
    }
}