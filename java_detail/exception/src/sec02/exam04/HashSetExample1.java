package sec02.exam04;

import java.util.HashSet;

import java.util.Set;

public class HashSetExample1 {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();

        set.add("Java");
        set.add("JDBC");
        set.add("Servlet/JSP");
        set.add("Java");
        set.add("iBATIS");

        int size = set.size();
        System.out.println("총 객체수: "+size);
        // 아래 for loop 방법과 동일하여 comment 처리 함
//        Iterator<String> iterator = set.iterator();
//        while(iterator.hasNext()){
//            String element = iterator.next();
//            System.out.println("\t"+element);
//        }
        for (String element : set) {
            System.out.println("\t" + element);
        }

        set.remove("JDBC");
        set.remove("iBATIS");

        System.out.println("총 객체수: "+set.size());
        for(String element: set){
            System.out.println("\t"+element);
        }
        set.clear();
        if(set.isEmpty()){
            System.out.println("비어 있음");}

    }
}
