import java.util.*;

public class messyKevin {
    public static void main (String [] args) {
        Scanner scanner = new Scanner (System.in);
        List<String> path = new ArrayList<>();

        int line = Integer.parseInt(scanner.nextLine());
        int numberPath = 0;

        while (numberPath < line) {
            String savePath = scanner.nextLine();
            path.add(savePath);
            numberPath = numberPath + 1;
        }


        for (String text : path) {
            System.out.println(normalisePath(text));
        }
    }


    public static String normalisePath(String path) {
        boolean isSlash = path.startsWith("/");
        List<String> list = new ArrayList<>();

        String [] split = path.split("/");

        for (String part : split) {
            if (part.isEmpty() || part.equals(".")) {
                continue;
            } else if (part.equals("..")) {
                if (!list.isEmpty()) {
                    list.remove(list.size() - 1);
                }
            } else {
                list.add(part);
            }
        }

        String normalised = String.join("/", list);
        if (isSlash) {
            normalised = "/" + normalised;
        }

        return normalised;
    }
}