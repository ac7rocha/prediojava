package predio;
public class Predio {
    public static void main(String[] args) {
        Elevador elevadorSocial = new Elevador();
        
//        elevadorSocial.Entra();
//        elevadorSocial.Sobe();
//        System.out.println("Tem " +elevadorSocial.getLotacaoElevador() + " no elevador");
//        System.out.println("Andar " +elevadorSocial.getAndarAtual());
//        elevadorSocial.Entra();
//        System.out.println("Tem " +elevadorSocial.getLotacaoElevador()+ " no elevador");
//        elevadorSocial.Sai();
//        System.out.println("Tem " +elevadorSocial.getLotacaoElevador()+ " no elevador");
//        elevadorSocial.Desce();
//        System.out.println("Andar " +elevadorSocial.getAndarAtual());
//        elevadorSocial.Desce();
//        System.out.println("Andar " +elevadorSocial.getAndarAtual());

          elevadorSocial.Sobe();
          elevadorSocial.Entra();
          elevadorSocial.Entra();
          elevadorSocial.Entra();
          elevadorSocial.Sobe();
          elevadorSocial.Entra();
          System.out.println("Tem " +elevadorSocial.getLotacaoElevador() + " pessoas no elevador");
          System.out.println("Andar atual " +elevadorSocial.getAndarAtual());  
        
    }
    
}
