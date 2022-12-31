package code20221206_accountDepth3_depth3;

import code20221205_accountInfo_depth2.studyJava0081_accountInfo;
import code20221205_stock.studyJava0081_stock_abstract;
import code20221205_stock_global.studyJava0082_stock_global;
import code20221206_anotation.Anotaion_marker;
import code20221206_interface.search;
import code20221206_interface.setterDefault;

import java.util.ArrayList;

//mission : accountInfo를 상속받은 studyJava0091_accountStock를 구현하시오
//accountInfo(상속), search(구현), setterDefault(구현) : 부모클래스가 이미 interface를 구현했다면 따로 구현x
//main메서드에서 studyJava0091_accountStock 인스턴스를 2개를 만들고, 각각의 모든 필드정보를 출력하는 메서드를 실행하시오
//예) @Override getInfo() 메서드 실행
@Anotaion_marker(cost = 50)
public class studyJava0091_accountStock extends studyJava0081_accountInfo implements search, setterDefault {

    private String bankNumber;
    private ArrayList<studyJava0081_stock_abstract> stockList = new ArrayList<>();

    public studyJava0091_accountStock(String id, String pw, String email, String name, String bankNumber) {
        super(id, pw, email, name);
        this.bankNumber = bankNumber;
    }

    @Override
    public void getInfo() {
        System.out.println(super.getId());
        System.out.println(super.getPw());
        System.out.println(super.getEmail());
        System.out.println(super.getName());
        System.out.println(this.getBankNumber());
        for(studyJava0081_stock_abstract item : stockList) {
            System.out.println(item.getStockName());
        }


    }

    public void addStockList(studyJava0081_stock_abstract stock) {
        //ArrayList<studyJava0081_stock_abstract> stockList :
        //1. studyJava0081_stock_abstract 추상클래스 = 인스턴스 생성 불가 = 선언부분이기 때문에 가능
        //2. 자식클래스를 add하여 추가 = 자식클래스는 부모클래스로 선언된 타입의 변수에 추가가 가능
        // (부모클래스는 자식클래스 or 본인클래스로 영역이 넓으므로 자유롭게 형변환 가능)
        //비슷) double 타입은 int타입보다 크기가 크므로 자동 형변환 가능하다
        this.stockList.add(stock);
    }

    public String getBankNumber() {
        return this.bankNumber;
    }
    public ArrayList<studyJava0081_stock_abstract> getStockList() {
        return this.stockList;
    }
}
