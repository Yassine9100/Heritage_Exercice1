public class Main {
    public static void main(String[] args) {
        Article article1 = new Crayon(1,"B2","BIC",2.5,"Bleu");
        Article article2 = new Ramette(2,"R256","PaperClie",35,90);
        System.out.println(article1.getDescriptif());
        System.out.println(article2.getDescriptif());
    }
}