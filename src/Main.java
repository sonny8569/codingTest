import java.io.IOException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        FindString();
//        ChangeString();
//        findLongString();
//        reverseString();
//        reverseSpcString();
//        removeSameString();
//        checkFireMoon();
//        findNum();
//        findDistance();
//        zipString();
//        deCodeData();
//        inputBigData();
//        showBigStudent();
//        startRock();
//        startFibo();
//        decimal();
//        findReverseDecimal();
//        checkAnswer();
//        checkCount();
        grid();
    }

    private static void grid(){
        Grid.gridAnswer();
    }
    private static void checkCount(){
        CountNum.solution();
    }
    private static void checkAnswer(){
        CountAnswer.checkAnswer();
    }
    private static void findReverseDecimal(){
        ReverseDecimal.reverseDecimal();
    }

    private static void decimal(){
        Finddecimal.startDecimal();
    }
    //문자열찾기#****###**#####**#####**##**
    private static void FindString() {
        FindString codingTEst = new FindString();
        codingTEst.inputData();
    }

    private static void ChangeString() {
        ChangeString changeString = new ChangeString();
        changeString.startChangeString();
    }

    private static void findLongString() {
        FindLongString findLongString = new FindLongString();
        findLongString.findLongString();
    }

    private static void reverseString() {
        ReverseString answer = new ReverseString();
        ReverseString.startReverseString();
    }
    private static void reverseSpcString(){
        ReverseSpcText.reverseSpcText();
    }

    private static void removeSameString(){
        RemoveSameString.startRemoveSameString();
    }
    private static void checkFireMoon(){
        CheckFireMoonStr.startCheckFireMoonStr();
    }

    private static void findNum(){
        FindNum.startFindNum();
    }

    private static void findDistance(){
        FindStringDistance.startFindStringDistance();
    }
    private static void zipString(){
        ZipString.zipString();
    }

    private static void deCodeData(){
        decodeData.startDecodeLatter();
    }

    private static void inputBigData(){
        InputBig.startInputBigData();
    }
    private static void showBigStudent(){
        try{
            ShowOnlyBigStudent.startBigStudent();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void startRock(){
        RockSigerPaper.startRockPaper();
    }
    private static void startFibo(){
        Fibonazi.startFiboNazi();
    }
}