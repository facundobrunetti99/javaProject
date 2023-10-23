import javax.swing.JOptionPane;
import java.util.ArrayList;

public class arrayListProduct {
    ArrayList<product>  arrayListProduct=new ArrayList<>();
    public String input(String text){
        return JOptionPane.showInputDialog(text);
    }

    public void addProduct(){
        String id=input("Ingrese el id ");
        String cant=input("Ingrese la Cantidad ");
        String price=input("Ingrese el precio ");
        String name=input("Ingrese el nombre del producto ");
        product prod= new product();

        prod.setCant(cant);
        prod.setId(id);
        prod.setPrice(price);
        prod.setName(name);
        arrayListProduct.add(prod);
    }

    public void getProducts(){
        String string="";
        for(int i=0;i<arrayListProduct.size();i++){
            string +="Nombre del Producto "+arrayListProduct.get(i).GetName()+"\n";
            string +="Id del producto "+arrayListProduct.get(i).GetId()+"\n";
            string+="Precio del Producto "+arrayListProduct.get(i).GetPrice()+"\n";
            string+="Cantidad de productos "+arrayListProduct.get(i).GetCant()+"\n";
        }
        JOptionPane.showMessageDialog(null,string);
    }

    public void clearListProduct(){
        arrayListProduct.clear();
    }

}
