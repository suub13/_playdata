package sec05.prac;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;


public class BoardService {
    private List<Board>list = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);
    private int counter = 0;

    public void showMenu() throws Exception {
        list = readList();
        while(true){
            System.out.println("----------------------------");
            System.out.println("1. 목록보기  | 2. 상세보기 | 3. 추가하기 | 4. 수정하기 | 5. 삭제하기 | 6. 파일저장 | 7. 종료");
            System.out.println("----------------------------");
            System.out.print("선택: ");
            String inp = scanner.nextLine();
            switch (inp) {
                case "1" -> checkList();
                case "2" -> checkDetails();
                case "3" -> addMore();
                case "4" -> modify();
                case "5" -> delete();
                case "6" -> saveFile();
                case "7" -> {
                    return;
                }
            }
        }
    }

    public List<Board> readList() throws Exception{
        FileInputStream fis = new FileInputStream("C:/Temp/BookList.db");
        ObjectInputStream ois = new ObjectInputStream(fis);
        List<Board> list = (List<Board>) ois.readObject();
        if (list.size()==0){
            System.out.println("기본 파일 안 데이터가 없습니다.");
        }
        return list;
    }

    public void checkList(){
        System.out.println("========목록========");
        for(Board board: list){
            System.out.println("북넘버: " +board.getBno()+ ": " + board.getTitle());
        }
    }
    public void checkDetails(){
        System.out.println("========상세보기========");
        for(Board board: list){
            System.out.println("북넘버: " +board.getBno()+ ": "+ board.getTitle());
            System.out.println("\t작가: "+board.getWriter());
            System.out.println("\t내용: "+board.getContent());
            System.out.println("\t날짜: "+board.getDate());
        }
    }
    public void addMore(){
        try{
            Board board = new Board(++counter);
            System.out.println("========추가하기========");
            System.out.print("제목을 입력하세요: ");
            board.setTitle(scanner.nextLine());

            System.out.print("작가명: ");
            board.setWriter(scanner.nextLine());

            System.out.print("내용: ");
            board.setContent(scanner.nextLine());

            System.out.print("날짜: ");
            board.setDate(new Date());

            list.add(board);
        } catch(Exception e){
            System.out.println("등록에러: "+e.getMessage());
        }
    }
    public void modify(){
        System.out.print("Book No를 입력하세요: ");
        int bNum = Integer.parseInt(scanner.nextLine());
        Board selected = null;
        for (Board board: list){
            if (board.getBno()==bNum){
                selected = board;
            }
        }
        if (selected != null){
            System.out.println("변경할 내용을 고르세요.");
            System.out.print("1. 제목, 2. 작가, 3. 내용: ");
            int changeNum = Integer.parseInt(scanner.nextLine());
            switch (changeNum){
                case 1:
                    System.out.print("변경할 내용을 입력하세요: ");
                    String newTitle = scanner.nextLine();
                    selected.setTitle(newTitle);
                case 2:
                    System.out.print("변경할 내용을 입력하세요: ");
                    String newWriter = scanner.nextLine();
                    selected.setWriter(newWriter);
                case 3:
                    System.out.print("변경할 내용을 입력하세요: ");
                    String newContent = scanner.nextLine();
                    selected.setContent(newContent);
            }
        } else {
            System.out.println("존재하지 않는 Book No입니다.");
        }

    }
    public void delete(){
        System.out.print("Book No를 입력하세요: ");
        int bNum = Integer.parseInt(scanner.nextLine());
        for (Board board: list) {
            if (board.getBno() == bNum) {
                list.remove(board);
                return;
            } else {
                System.out.println("존재하지 않는 Book No입니다.");
            }
        }
    }
    public void saveFile() throws Exception{
        FileOutputStream fos = new FileOutputStream("C:/Temp/BookList.db");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(list);
    }
}
