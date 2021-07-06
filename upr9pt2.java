public class upr9pt2 {
    public static void main(String[] args) {

            String text = "Искам да разделя този текст на думи в масив!";

            String[] words = text.split("[ .,'-]+");

            System.out.println(words.length);
    }
}

