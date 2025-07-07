package shop.app;

import shop.dto.CustDto;
import shop.frame.SmService;
import shop.service.CustService;

import java.util.List;
import java.util.Scanner;

public class CustApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SmService<CustDto, String> smService = new CustService();

        while(true){
            System.out.print("Enter Command: ");
            String cmd = sc.nextLine();
            if(cmd.equals("q")){
                System.out.println("Quit...");

                break;
            }else if(cmd.equals("i")){
                System.out.println("Insert...");

                System.out.print("Input ID: ");
                String id = sc.nextLine();

                System.out.print("Input PWD: ");
                String pwd = sc.nextLine();

                System.out.print("Input Name: ");
                String name = sc.nextLine();

                CustDto custDto = new CustDto(id,pwd,name);
                smService.register(custDto);
                System.out.println();

            }else if(cmd.equals("s")){
                System.out.println("Search...");

                System.out.print("Input ID: ");
                String id = sc.nextLine();
                CustDto myInfo = null;
                myInfo = smService.get(id);
                System.out.println(myInfo);
                System.out.println();

            }else if(cmd.equals("sa")){
                System.out.println("Search All...");

                List<CustDto> memberlist = null;
                memberlist = smService.get();
                for(CustDto member : memberlist){
                    System.out.println(member);
                }
                System.out.println();

            } else if(cmd.equals("d")){
                System.out.println("Delete...");

                System.out.print("Input ID: ");
                String id = sc.nextLine();
                smService.remove(id);
                System.out.println();

            }else if(cmd.equals("u")){
                System.out.println("Update...");

                System.out.print("Input New ID: ");
                String id = sc.nextLine();

                System.out.print("Input New PWD: ");
                String pwd = sc.nextLine();

                System.out.print("Input New Name: ");
                String name = sc.nextLine();

                CustDto updateCust = new CustDto(id,pwd,name);
                smService.modify(updateCust);
                System.out.println();

            }else{
                System.out.println("Invalid Command...");
                System.out.println();

            }
        }
        sc.close();
    }
}
