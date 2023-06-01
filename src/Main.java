// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
            // Tạo danh sách liên kết và thực hiện xóa
            LinkedList linkedList = new LinkedList();
            linkedList.append(1);
            linkedList.append(2);
            linkedList.append(3);
            linkedList.append(4);
            linkedList.append(5);
            linkedList.append(6);

            System.out.println("Danh sách trước khi xóa:");
            linkedList.print();
            // a = 3
            int valueToDelete = 3;
            linkedList.remove(valueToDelete);

            System.out.println("Danh sách sau khi xóa các node có giá trị " + valueToDelete + ":");
            linkedList.print();
                // here are INTERVIEW 1
        }

}