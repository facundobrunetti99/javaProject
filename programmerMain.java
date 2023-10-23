import javax.swing.JOptionPane;

public class programmerMain {
    public static void main(String[] args) {
        arrayListProduct prd=new arrayListProduct();
        byte opcion;



        do{
            opcion=Byte.parseByte(JOptionPane.showInputDialog(
                "Menu Principal \n"+
                "1)Añadir un Producto\n"+
                "2)Mostrar los Productos\n"+
                "3)Eliminar los productos\n"+
                "4)Salir\n"
                

            ));

            switch(opcion){
                case 1:
                prd.addProduct();
                break;

                case 2:
                prd.getProducts();
                break;

                case 3:
                prd.clearListProduct();
                break;

                case 4:
                JOptionPane.showMessageDialog(null,"Hasta Luego");
                break;
                default: JOptionPane.showMessageDialog(null,"No funciona");
            }
        }while(opcion!=4);

    }
}
