import java.util.*;


public class MyCollection {
    public static void main(String[] args) {
     //  listCollection();
      // setCollection();
       mapCollection();
    }
    public static void mapCollection(){
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"one");
        map.put(2,"one");
        map.put(1,"three");
        map.put(4,"two");
        map.put(9,"nine");
        System.out.println("Map--->"+map);
    }
    public static void setCollection(){
        Set<String> intSet=new HashSet<>();
        intSet.add("623");
        intSet.add("234");
        intSet.add("312");
        intSet.add("42");
        intSet.add("55");
        intSet.add("1");
        intSet.remove("2");
        System.out.println("Int set-->"+intSet);

      //  =============================================
        Set<String> linkedSet =new LinkedHashSet<>();
        linkedSet.add("623");
        linkedSet.add("234");
        linkedSet.add("312");
        linkedSet.add("42");
        linkedSet.add("55");
        linkedSet.add("1");
        linkedSet.add("42");
       // linkedSet.remove("2");
        System.out.println("linkedSet-->"+ linkedSet);
//=============================================================
        Set<String> treeset =new TreeSet<>();
        treeset.add("623");
        treeset.add("234");
        treeset.add("312");
        treeset.add("42");
        treeset.add("55");
        treeset.add("1");
        treeset.add("42");
        // linkedSet.remove("2");
        System.out.println("treeset-->"+ treeset);
    }

public static void listCollection(){
    List<String> stringList = new ArrayList<>();
    stringList.add("one");
    stringList.add("two");
    stringList.add("three");
    stringList.add("one");
    System.out.println("list-->"+ stringList);
    stringList.add("new");
    System.out.println("list-->"+stringList);
    System.out.println("size-->"+stringList.size());
    System.out.println("-->"+stringList.isEmpty());
    System.out.println("second-->"+ stringList.get(1));
    System.out.println("remove-->"+stringList.remove(3));
    stringList.set(1,"newTwo");
    System.out.println("-->"+ stringList);
    //========================================================
List<Integer> listInt = new LinkedList<>();


}

}
