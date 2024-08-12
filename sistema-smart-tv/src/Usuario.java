public class Usuario {
    public static void main(String[] args) throws Exception {

        SmartTv smartTv = new SmartTv();

        System.out.println("TV Ligada ? " + smartTv.on);
        System.out.println("Canal Atual: " + smartTv.channel);
        System.out.println("Volume Atual: " + smartTv.volume);
        
        smartTv.turnOn();
        
        System.out.println("TV Ligada ? " + smartTv.on);
        System.out.println("Canal Atual: " + smartTv.channel);
        System.out.println("Volume Atual: " + smartTv.volume);
    }
}
