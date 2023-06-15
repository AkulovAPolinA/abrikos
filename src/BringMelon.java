class BringMelon{
    private int melonAmount;


    public BringMelon(int melonAmount){
        this.melonAmount=melonAmount;
    }


    public void setMelonAmount(int melonAmount){
        this.melonAmount=melonAmount;
    }

    public int getMelonAmount(){
        System.out.println("На данный момент на складе "+melonAmount+" дынь");
        return melonAmount;
    }


}