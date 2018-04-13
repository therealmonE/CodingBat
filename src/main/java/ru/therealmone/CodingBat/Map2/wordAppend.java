package Map2;

public class wordAppend {

    public static void main(String[] args) {

    }

    public static String wordAppend(String[] strings){
        String result = "";

        for (int i = 0; i < strings.length; i++) {
            int count = 0;

            for (int j = 0; j < strings.length; j++) {
                boolean added = false;

                if(strings[i].equals(strings[j])) {
                    count++;
                    if(count % 2 == 0 && !added && count != 0) {
                        result += strings[i];
                        added = true;
                    }
                }

            }
        }

        return result;
    }
}
