import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;// Input/Outputに関する道具をまとめて全部持ってくる



public class StudentReader {
  public static void main(String[] args) {
    ArrayList<Student> studentList = new ArrayList<>();
    String filePath = "Lab8/students.txt";
    //BufferedReader は「1行ずつ効率よく読むための道具」、FileReader はファイルを開くための道具
    try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
      String line;
      //一行ずつ読んだラインが空っぽにならない間は
      while ((line = reader.readLine()) != null) {
        //split(" ") メソッドを使うと、指定した文字で区切られた単語を配列（String[]）として取得できます
        //line（1行分）の中には John Doe 12345 ... と繋がった文字が入っている。
        //これをスペース（" "）を境目にしてハサミで切り、4つの部品に分けて data という配列にしまおう
        String[] data = line.split(" ");
        if (data.length == 4) {
          //バラバラにした部品（data[0]が名前、data[1]が苗字..
          Student s = new Student(data[0], data[1], data[2], data[3]);
          studentList.add(s);// ここで名簿に追加
        }
      }
    } catch (FileNotFoundException e) {
      System.out.println("File cannot be found");
    } catch (IOException e) {
      System.out.println("Error found");
    }
    Scanner scanner = new Scanner(System.in);
    //プログラムが勝手に終わらないように、running が true の間はずっとメニューを出し続けよう
    boolean running = true;

    while (running) {
      System.out.println("1. Add a student");
      System.out.println("2. Remove a student");
      System.out.println("3. Search for a student");
      System.out.println("4. Print all students");
      System.out.println("5. Exit");

      int choice = scanner.nextInt();
      scanner.nextLine(); // 改行（Enter）』が次の入力の邪魔をしないように、nextLine() で掃除しておこう

      switch (choice) {
        case 1:
          System.out.println("Enter first name: ");
          String firstName = scanner.nextLine();
          System.out.println("Enter last name: ");
          String lastName = scanner.nextLine();
          System.out.println("Enter student ID: ");
          String id = scanner.nextLine();
          System.out.println("Enter email: ");
          String email = scanner.nextLine();
          //新しい学生オブジェクトを作って名簿（リスト）に追加する
          Student student = new Student(firstName, lastName, id, email);
          studentList.add(student);

          //リストの最新状態をファイルに書き出す（保存）
          //今リストにある全員分のデータを、もう一度 students.txt に書き込み直して最新状態にしよう
          //new FileWriter(filePath) と書くと、ファイルの中身を一度空にしてから新しく書き始めます（上書き）
          try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            //名簿棚（studentList）にいる学生を、上から順番に一人ずつ取り出して s と名付け、処理を繰り返そう
            for (Student s : studentList) {
              // ファイルに「名前 苗字 ID メール」の形式で1行ずつ書き込む
              writer.println(s.firstName + " " + s.lastName + " " + s.studentID + " " + s.email);
            }
            System.out.println("Student added and file updated!");
          } catch (IOException e) {
            System.out.println("Could not save to file.");
          }
          break;

        //ID　をみて生徒を削除
        case 2:
          System.out.println("Enter ID to remove: ");
          String idRemove = scanner.nextLine();

          //消せたかどうかを判定する「旗（フラグ）」を用意
          boolean foundAndRemoved = false;

          //（studentList）を上から一人ずつチェックする（ループ）
          for (int i = 0; i < studentList.size(); i++) {
            // もし、i番目の人のIDが、入力されたIDと「一致」したら
            if (studentList.get(i).studentID.equals(idRemove)) {
              studentList.remove(i);
              foundAndRemoved = true;
              System.out.println("Student removed from the list.");
              break; // 一人見つかれば十分なので、ループを強制終了する
            }
          }
          // 4. もし旗が立っていたら（削除に成功したら）、ファイルも更新する
          if (foundAndRemoved) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
              for (Student s : studentList) {
                // 残った全員のデータをファイルに書き直す
                writer.println(s.firstName + " " + s.lastName + " " + s.studentID + " " + s.email);
              }
            } catch (IOException e) {
              System.out.println("Could not update the file");
            }
          } else {
            // 5. 最後まで探して旗が立たなかった場合
            System.out.println("Error: Student ID not found.");
          }
          break;
        case 3:
          System.out.println("Enter student ID to search");
          String idSearch = scanner.nextLine();

          boolean found = false;

          //（studentList）を上から一人ずつチェック
          for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).studentID.equals(idSearch)) {
              //その人の情報を画面に表示する（StudentクラスのtoStringが呼ばれる）
              System.out.println("Student found: " + studentList.get(i));
              found = true;
              break;
            }
          }
          // 4. 最後まで探して「旗」が立っていなかったら
          if (!found) {
            System.out.println("Error: Student ID not found.");
          }
          break;

          case 4:
            for (int i = 0; i < studentList.size(); i++) {
              System.out.println((i + 1) + ". " + studentList.get(i));
            }
            break;

            case 5:
              running = false; // これで while ループが止まる
              System.out.println("Exiting program...");
              break;

              default:
                System.out.println("Invalid option.");
                break;
      }
    }
    System.out.println("Program finished.");
  }
}


