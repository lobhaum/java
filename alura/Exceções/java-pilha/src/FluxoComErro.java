public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
			metodo1();
		} catch (ArithmeticException  | NullPointerException e) {
			// TODO: handle exception
			//System.out.println("ArithmeticException");
			//System.out.println(e);
			String msg = e.getMessage();
			System.out.println("Exceção: " + msg);
			System.out.println("printStackTrace:");
			e.printStackTrace();
		} 
        
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");

        	metodo2();

        
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("ini metodo 2");
    	metodo2();
    	System.out.println("fim metodo 2");
    }
}