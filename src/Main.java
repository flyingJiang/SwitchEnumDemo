import com.cn.flying.TypeEnum;

public class Main {

    public static void main(String[] args) {
        String type = "A";
        TypeEnum typeEnum = TypeEnum.valueOf(type);
        switch (typeEnum) {
            case A:
                System.out.println(TypeEnum.A.getName());
                break;
            case B:
                System.out.println(TypeEnum.B.getName());
                break;
            case C:
                System.out.println(TypeEnum.C.getName());
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}
