public class Address {
    public static void main(String[] args){
        var sep = ',';
        var adr = "Россия, Краснодарскй край, Сочи, ТНТ, 2, 4, 300";
        var lines = adr.split(String.valueOf(sep) + ' ');
        System.out.println("Country:"+lines[0]);
        System.out.println("Reg:"+lines[1]);
        System.out.println("City:"+lines[2]);
        System.out.println("Street:"+lines[3]);
        System.out.println("H:"+lines[4]);
        System.out.println("K:"+lines[5]);
        System.out.println("KV:"+lines[6]);
    }
}
