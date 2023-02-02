import com.sun.source.tree.TryTree;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class LocalSpecialty {
    public static void main(String[] args) {
        Map<String,String> specialtyMap =new HashMap<>();
        specialtyMap.put("山梨","ほうとう");
        specialtyMap.put("愛知","ひつまぶし");
        specialtyMap.put("大阪","たこやき");

        System.out.println("都道府県名を入力してください");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

//        例外処理
        try{
            if(specialtyMap.get(input)==null) {
                throw new NullPointerException();
            }
            System.out.println(specialtyMap.get(input)+"が名物です");
        }catch (NullPointerException e){
            System.out.println(input+"は未登録です");
        }
    }
}
