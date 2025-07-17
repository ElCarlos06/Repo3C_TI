public class App {
    public static void main(String[] args) throws Exception {
        Pedido[] pedidos = new Pedido[3];
        /*double[] precios = new double[3]; es una forma para hacerlo
        precios[0]=2;
        precios[1]=6; */
        double[] precios1 ={1,4,7,8}; ///es una forma mas conveniente, con esto se puede intanciar.
        double[] precios2 ={3,4,5,6,7,3,2};
        double[] precios3 ={6,7,8,12}; 
        Pedido pedido1= new Pedido(1, precios1); ///esta es la mejor forma desde la instancia. se definen precios arriba
        pedidos[0] = pedido1; ///se declara 
        pedidos[1] = new Pedido(2, precios2);
        pedidos[2] = new Pedido(3, precios3);

        for(int i=0 ; i<pedidos.length; i++){
            System.out.println("El total es: "+ pedidos[i].calcularTotal());
        }
    }
}
