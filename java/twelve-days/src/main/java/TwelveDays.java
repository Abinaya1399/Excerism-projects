class TwelveDays {
    private static String[] ordinals = {"","first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"};
    private static String[] numbers = {"", "a", "two", "three", "four", "five", "six","seven", "eight", "nine", "ten", "eleven", "twelve" };
    private static String[] gifts = {"","Partridge in a Pear Tree", "Turtle Doves", "French Hens", "Calling Birds", "Gold Rings", "Geese-a-Laying", "Swans-a-Swimming", "Maids-a-Milking", "Ladies Dancing", "Lords-a-Leaping", "Pipers Piping", "Drummers Drumming"};

    String verse(int verseNumber) {
StringBuilder res = new StringBuilder();
res.append(String.format("On the %s day of Christmas my true love gave to me: ", ordinals[verseNumber]));
for(int i=verseNumber; i>0; i--){
    res.append(i==verseNumber ? "" : i==1 ? ", and " : ", ");
    res.append(String.format("%s %s", numbers[i],gifts[i]));
}
return res.append(".\n").toString();
    }

    String verses(int startVerse, int endVerse) {
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        StringBuilder res = new StringBuilder();
        for(int i=startVerse; i<=endVerse; i++){
            res.append(String.format("%s%s",verse(i),i==endVerse ? "" : "\n"));
        }
        return res.toString();
    }
    
    String sing() {
      return verses(1,12);
        //throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
    }
}
