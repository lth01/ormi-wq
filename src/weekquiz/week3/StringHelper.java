package weekquiz.week3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StringHelper {
     static StringHelper sh;
     private Scanner sc;

     private StringHelper(){
        sc = new Scanner(System.in);
     }

    static public StringHelper getStringHelper(){
         if(sh == null){
             sh = new StringHelper();
         }

         return sh;
    }


    Integer MenuSelect(){
        StringBuilder sb = new StringBuilder();

        sb.append("1. 비즈니스 연락처 추가\n");
        sb.append("2. 개인 연락처 추가\n");
        sb.append("3. 연락처 출력\n");
        sb.append("4. 연락처 검색\n");
        sb.append("5. 종료\n");
        sb.append("메뉴를 선택해주세요:");

        System.out.print(sb.toString());

        try{
            return sc.nextInt();
        }catch (InputMismatchException e){
            System.out.println("잘못된 입력입니다. 다시 메뉴를 선택해주세요");
            return null;
        }
    }

     public BusinessContact addBusinessContact(){
        String name = getContactUserName();
        String phoneNumber = getContactPhoneName();

        return null;
    }

    public PersonalContact addPersonalContact(){
        return null;
    }

    private String getContactUserName(){
         System.out.print("이름을 입력하세요: ");

         return sc.nextLine();
    }

    private String getContactPhoneName(){
         System.out.print("전화번호를 입력하세요: ");

         return sc.nextLine();
    }



}
