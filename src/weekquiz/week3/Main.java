package weekquiz.week3;

public class Main {
    public static void main(String[] args){
        ContactHelper ch = ContactHelper.getStringHelper();

        while(true){
            int menu = ch.MenuSelect();
            switch(menu){
                case 1:
                    ch.addBusinessContact();
                    break;
                case 2:
                    ch.addPersonalContact();
                    break;
                case 3:
                    ch.printContact();
                    break;
                case 4:
                    ch.searchContact();
                    break;
                case 5:
                    return ;
            }
        }
    }
}
