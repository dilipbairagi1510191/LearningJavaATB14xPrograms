package ex_19_encapsulation;

public class AccountMain {
    public static void main(String[] args) {

        Account ac=new Account();

        ac.setAccno(101);
        ac.setAmount(56000);
        ac.setName("Dilip");

        System.out.println(ac.getAccno());
        System.out.println(ac.getAmount());
        System.out.println(ac.getName());
    }
}
