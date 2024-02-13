package weekquiz.week3;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class ContactHelper {
     AddressBook adBook;
     static ContactHelper sh;
     private Scanner sc;

     private static String patternPhoneNumber = "^\\d{2,3}-\\d{3,4}-\\d{4}$";

     private ContactHelper(){
        sc = new Scanner(System.in);
        adBook = new AddressBook();
     }

    static public ContactHelper getStringHelper(){
         if(sh == null){
             sh = new ContactHelper();
         }

         return sh;
    }

    public Integer MenuSelect(){
        StringBuilder sb = new StringBuilder();

        sb.append("1. 비즈니스 연락처 추가\n");
        sb.append("2. 개인 연락처 추가\n");
        sb.append("3. 연락처 출력\n");
        sb.append("4. 연락처 검색\n");
        sb.append("5. 종료\n");
        sb.append("메뉴를 선택해주세요:");

        System.out.print(sb.toString());

        try{
            return Integer.parseInt(sc.nextLine());
        }catch (NumberFormatException e){
            System.out.println("잘못된 입력입니다. 다시 메뉴를 선택해주세요");
            return null;
        }
    }

     // 연락처 추가 시작
     public void addBusinessContact(){
         try{
             String name = getContactUserName();
             String phoneNumber = getContactPhoneName();
             String comName = getContactComName();

             adBook.addContact(new BusinessContact(name, phoneNumber, comName));
         }catch (PhoneRegxException pre){
             return ;
         }catch (InputLengthException ile){
             return ;
         }
    }

    public void addPersonalContact(){
         try{
             String name = getContactUserName();
             String phoneNumber = getContactPhoneName();
             String relation = getContactRelation();

             adBook.addContact(new PersonalContact(name, phoneNumber, relation));
         }catch(PhoneRegxException pre){
             return ;
         }catch(InputLengthException ile){
             return ;
         }
    }

    private String getContactUserName() throws  InputLengthException{
         System.out.print("이름을 입력하세요: ");
         String name = sc.nextLine();

         if(name.length() > 0){
             return name;
         }

         throw new InputLengthException();
    }

    //정규식으로 유효한 휴대전화번호인지 확인
    private String getContactPhoneName() throws PhoneRegxException {
         System.out.print("전화번호를 입력하세요: ");
         String inPhoneNumberString = sc.nextLine();

         if(Pattern.matches(patternPhoneNumber, inPhoneNumberString)){
            return inPhoneNumberString;
         }

         throw new PhoneRegxException();
    }

    //회사 연락처 전용
    private String getContactComName() throws InputLengthException{
         System.out.print("회사명을 입력하세요: ");
         String comName = sc.nextLine();

         if(comName.length() > 0){
             return comName;
         }

         throw new InputLengthException();
    }
    //개인 연락처 전용
    private String getContactRelation() throws InputLengthException{
         System.out.print("관계를 입력하세요: ");
         String relation = sc.nextLine();

         if(relation.length() > 0){
             return relation;
         }

         throw new InputLengthException();
    }
    //연락처 추가 로직 종료

    //연락처 출력
    public void printContact(){
        adBook.displayContacts();
    }

    //연락처 검색
    public void searchContact(){
         try{
             System.out.print("검색할 이름을 입력하세요: ");

             String searchName = sc.nextLine();

             if(searchName.length() == 0){
                 throw new InputLengthException();
             }

             adBook.searchContact(searchName);
         }catch(InputLengthException ile){
             return ;
         }
    }
}
