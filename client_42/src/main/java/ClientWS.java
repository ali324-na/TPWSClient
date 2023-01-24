import proxy1.BanqueService;
import proxy1.BanqueWS;
import proxy1.Compte;

public class ClientWS {
    public static void main(String[] args) {
        BanqueService stub = new BanqueWS().getBanqueServicePort();
        System.out.println(stub.convert(7000));
        Compte cp = stub.getCompte(5);
        System.out.println(cp.getCode());
        System.out.println(cp.getSolde()) ;
    }
}
