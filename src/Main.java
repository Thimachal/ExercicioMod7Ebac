public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Motog 50",98,false);

        System.out.println(phone1.getModel());
        System.out.println(phone1.getBatery());
        //o metodo construtor inicia o atributo power como false, então abaixo mudamos para true através do metodo
        phone1.setPowerBy(true);

        if (phone1.getPowerBy()){
            System.out.println("Power On");
        }else {
            System.out.println("Power Off");
        }
    }
}