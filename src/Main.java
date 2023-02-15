public class Main {
    public static void main(String[] args) {
        String ss = "Все вокруг нас - это счастье. счастье бывает мимолетным. счастье приходит и уходит. Все счастливы, когда у них все получается. счастье не в деньгах. Огромное счастье можно обрести в кругу родных.";
        String pat = "счастье";
        int indPat;
        int curInd = 0;
        int counter = 0;
        while ((indPat = ss.indexOf(pat,curInd)) != -1) {
            counter++;
            curInd = indPat +1;
        }
        System.out.printf("%s - %d", pat, counter);
    }
}