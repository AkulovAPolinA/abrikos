class MelonCount{
    private int melonAmount;


    public MelonCount(int melonAmount){
        this.melonAmount=melonAmount;
    }


    public void setMelonAmount(int melonAmount){
        this.melonAmount=melonAmount;
    }

    public int getMelonAmount(){
        System.out.println("На данный момент на складе "+melonAmount+" дынь");
        return melonAmount;
    }

    void melonAmountInStorage(){
        System.out.println("На данный момент на складе "+melonAmount+" дынь");
    }
}
