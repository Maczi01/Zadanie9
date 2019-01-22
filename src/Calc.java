public class Calc {



    void compareTwoLines(Line line1, Line line2){
        int length1 = line1.getP2().getA()-line1.getP1().getA();
        int length2 = line2.getP2().getA()-line2.getP1().getA();
        if(length2>length1){
            System.out.println("Linia nr 2 jest dłuższa. ");
        }
        else{
            System.out.println("Linia nr 1 jest dłuższa. ");
        }
        showInfoAboutLines(line1, line2);


    }

    void showInfoAboutLines(Line line1,Line line2){
        int length1 = line1.getP2().getA()-line1.getP1().getA();
        int length2 = line2.getP2().getA()-line2.getP1().getA();
        System.out.println("Linia nr 1 ma długosc " + length1 + ", jej punkt początkowy to: " + line1.getP1().getA()
                + ", a końcowy to: "+ line1.getP2().getA());
        System.out.println();
        System.out.println("Linia nr 2 ma długosc " + length2 + ", jej punkt początkowy to: " + line2.getP1().getA()
                + ", a końcowy to: "+ line2.getP2().getA());
    }

}
