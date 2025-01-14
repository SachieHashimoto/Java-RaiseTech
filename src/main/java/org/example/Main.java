package org.example;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//TIP コードを<b>実行</b>するには、<shortcut actionId="Run"/> を押すか
// ガターの <icon src="AllIcons.Actions.Execute"/> アイコンをクリックします。
public class Main {

  public static void main(String[] args) {
    List<String> studentNameList = List.of("小林","佐々木","五十嵐","井上","橋下","伊集院",
        "五所川原","加藤","工藤", "鈴木","剛屋","遠藤");

    for (String mojisuu : studentNameList){
      if (mojisuu.length() >= 3) {
        System.out.println(mojisuu);
      }
    }



    Map<Integer,String> studentNameMAP =new HashMap<Integer,String>();
        studentNameMAP.put(1,"加藤");
        studentNameMAP.put(2,"佐々木");
        studentNameMAP.put(3,"五十嵐");
        studentNameMAP.put(4,"剛屋");
        studentNameMAP.put(5,"井上");
        studentNameMAP.put(6,"橋下");
        studentNameMAP.put(7,"伊集院");
        studentNameMAP.put(8,"五所川原");
        studentNameMAP.put(9,"加藤");
        studentNameMAP.put(10,"工藤");
        studentNameMAP.put(11,"鈴木");
        studentNameMAP.put(12,"神奈川");

    System.out.println("削除前:"+studentNameMAP);

    List<Integer> deleteList = new ArrayList<>();

    for (Integer studentNumber : studentNameMAP.keySet()) {
      if (studentNumber % 2 == 0) {
        deleteList.add(studentNumber);
      }
    }
    for (Integer key : deleteList){
        studentNameMAP.remove(key);
    }
    System.out.println("削除後:"+studentNameMAP);

  }
}
