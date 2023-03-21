public class App {
    public static void main(String[] args) throws Exception {
        String[] fruits1 = new String[] { "Morango", "Uva", "Cajá", "Acerola", "Manga" };
        String[] fruits2 = new String[] { "Pêra", "Caju", "Morango", "Kiwi", "Cajá" };

        for (int i = 0; i < fruits1.length; i++) {
            for (int j = 0; j < fruits2.length; j++) {
                if (fruits1[i].equals(fruits2[j])) {
                    System.out.println(fruits1[i]);
                }
            }
        }
    }
}
